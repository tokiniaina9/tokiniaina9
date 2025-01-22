/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mg.toky.projet3D.main;

import jade.wrapper.ContainerController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sma.AgentRecepteur;
import sma.Sma;

/**
 *
 * @author Toky
 */
public class ProjetM2 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/mg/toky/projet3D/vue/FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Sma.creerMainContainer("localhost");
        ContainerController cc = Sma.creerContainer("C_recepteur", "localhost");
        Sma.creerAgent(cc, "Objet", AgentRecepteur.class.getName(), new Object[]{});
        Main main = new Main();
        //TesteJavaCV6A.main(args);
        main.start();
    }

}
