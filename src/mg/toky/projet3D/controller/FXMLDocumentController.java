/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.toky.projet3D.controller;

import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import mg.toky.projet3D.main.Main;

/**
 *
 * @author Toky
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private static Label message;
    @FXML
    private static JFXTextField avant;
    @FXML
    private static JFXTextField droite;
    @FXML
    private static JFXTextField gauche;
    @FXML
    private static JFXTextField arriere;
    @FXML
    private static JFXTextField tr_gauche;
    @FXML
    private static JFXTextField tr_droite;
    @FXML
    private static JFXTextField haut;
    @FXML
    private static JFXTextField bas;
    @FXML
    private static JFXSlider angle;

    public static Label getMessage() {
        return message;
    }

    public static JFXTextField getAvant() {
        return avant;
    }

    public static JFXTextField getDroite() {
        return droite;
    }

    public static JFXTextField getGauche() {
        return gauche;
    }

    public static JFXTextField getArriere() {
        return arriere;
    }

    public static JFXTextField getTr_gauche() {
        return tr_gauche;
    }

    public static JFXTextField getTr_droite() {
        return tr_droite;
    }

    public static JFXTextField getHaut() {
        return haut;
    }

    public static JFXTextField getBas() {
        return bas;
    }

    public static JFXSlider getAngle() {
        return angle;
    }

    
    
    private void handleButtonAction(ActionEvent event) {
        Main main = new Main();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
