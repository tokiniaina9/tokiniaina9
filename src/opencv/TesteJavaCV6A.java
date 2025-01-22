/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;

import com.googlecode.javacpp.Loader;
import static com.googlecode.javacv.cpp.opencv_core.*;
import com.googlecode.javacv.cpp.opencv_highgui.CvCapture;
import static com.googlecode.javacv.cpp.opencv_highgui.*;
import static com.googlecode.javacv.cpp.opencv_imgproc.*;
import com.googlecode.javacv.cpp.opencv_imgproc.CvMoments;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvContourArea;
import mg.toky.projet3D.main.Main;
import mg.toky.projet3D.main.render.Camera;
import mg.toky.projet3D.math.Vector3f;
import static opencv.Controleur.*;

public class TesteJavaCV6A {


    public static CvScalar Bminc;//= cvScalar(15, 25, 18, 0);
    public static CvScalar Bmaxc;//= cvScalar(110, 100, 128, 0);
    public static CvScalar Rminc;//= cvScalar(150, 150, 75, 0);
    public static CvScalar Rmaxc;//= cvScalar(190, 255, 255, 0);

    public static int new_xx = 0, old_xx = 0;
    public static int new_yy = 0, old_yy = 0;

    public static int getNew_xx() {
        return new_xx;
    }

    public static int getNew_yy() {
        return new_yy;
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
                main.start();
            }
        });
        t.start();

        IplImage img1, imghsv, imgbin;
        new Controleur().setVisible(true);
//        CvScalar Bminc = cvScalar(95, 150, 75, 0), Bmaxc = cvScalar(145, 255, 255, 0);
//        CvScalar Rminc = cvScalar(150, 150, 75, 0), Rmaxc = cvScalar(190, 255, 255, 0);
//        CvScalar Bminc = cvScalar(15, 25, 18, 0), Bmaxc = cvScalar(110, 100, 128, 0);
//        CvScalar Rminc = cvScalar(150, 150, 75, 0), Rmaxc = cvScalar(190, 255, 255, 0);

        CvSeq contour1, contour2;
        CvMemStorage storage = CvMemStorage.create();
        CvMoments moments = new CvMoments(Loader.sizeof(CvMoments.class));

        double areaMax, areaC = 0;
        double m10, m01, m_area;

        int posX = 0, posY = 0;

        CvCapture capture1 = cvCreateCameraCapture(0);
        imghsv = cvCreateImage(cvSize(640, 480), 8, 3);
        imgbin = cvCreateImage(cvSize(640, 480), 8, 1);

        int i = 1;
        while (i == 1) {

            Bminc = cvScalar(hmax.getValue(), smax.getValue(), vmax.getValue(), 0);
            Bmaxc = cvScalar(hmin.getValue(), smin.getValue(), vmin.getValue(), 0);
            Rminc = cvScalar(hmax.getValue(), smax.getValue(), vmax.getValue(), 0);
            Rmaxc = cvScalar(hmin.getValue(), smin.getValue(), vmin.getValue(), 0);

            img1 = cvQueryFrame(capture1);
            if (img1 == null) {
                System.err.println("No img");
                break;
            }
            cvCvtColor(img1, imghsv, CV_BGR2HSV);
            cvInRangeS(imghsv, Bminc, Bmaxc, imgbin);

            cvMorphologyEx(imgbin, imgbin, null, null,
                    CV_MOP_OPEN, 1);

            contour1 = new CvSeq();
            areaMax = 1000;

            cvFindContours(imgbin, storage, contour1, Loader.sizeof(CvContour.class),
                    CV_RETR_LIST, CV_LINK_RUNS, cvPoint(0, 0));
            contour2 = contour1;
            while (contour1 != null && !contour1.isNull()) {
                areaC = cvContourArea(contour1, CV_WHOLE_SEQ, 1);
                if (areaC > areaMax) {
                    areaMax = areaC;
                }

                contour1 = contour1.h_next();
            }

            while (contour2 != null && !contour2.isNull()) {
                areaC = cvContourArea(contour2, CV_WHOLE_SEQ, 1);
                if (areaC < areaMax) {
                    cvDrawContours(imgbin, contour2, CV_RGB(0, 0, 0), CV_RGB(0, 0, 0),
                            0, CV_FILLED, 8, cvPoint(0, 0));
                }

                contour2 = contour2.h_next();
            }

            cvMoments(imgbin, moments, 1);
            m10 = cvGetSpatialMoment(moments, 1, 0);
            m01 = cvGetSpatialMoment(moments, 0, 1);
            m_area = cvGetCentralMoment(moments, 0, 0);

            posX = (int) (m10 / m_area);
            posY = (int) (m01 / m_area);

            if (posX > 0 && posY > 0) {
                System.err.println("x= " + posX + " ,y= " + posY);
                new_xx = posX;
                new_yy = posY;
                Vector3f rot = Camera.getRotation();
                int x1 = posX, y1 = posY;
                if (posX > 90) {
                    x1 = 90;
                }
                if (posX < -90) {
                    x1 = -90;
                }
                if (posY > 90) {
                    y1 = 90;
                }

                if (posY < -90) {
                    y1 = -90;
                }
                //rot.setX(x1 - 25);
                //rot.setY(posX - 25);
                rot.setY(-new_xx);
                Camera.setRotation(rot);
                old_xx = new_xx;
                old_yy = new_yy;
            }

            cvShowImage("en couleur", img1);
            cvShowImage("filtré binaire", imgbin);
            char c = (char) cvWaitKey(15);
            if (c == 'q') {
                break;
            }

        }
    }

}
