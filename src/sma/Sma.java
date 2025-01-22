/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sma;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toky
 */
public class Sma {
        private static jade.core.Runtime rt;
    private static Profile profile;
    public static ArrayList<ContainerController> conteneurs = new ArrayList<ContainerController>();

    public static ContainerController creerMainContainer(String host) {
        rt = jade.core.Runtime.instance();
        profile = new ProfileImpl();
        profile.setParameter(ProfileImpl.MAIN_HOST, host);
        profile.setParameter(ProfileImpl.GUI, "true");
        ContainerController cc = rt.createMainContainer(profile);
        return cc;
    }

    public static ContainerController creerContainer(String nom, String host) {
        rt = jade.core.Runtime.instance();
        profile = new ProfileImpl();
        profile.setParameter(Profile.CONTAINER_NAME, nom);
        profile.setParameter(Profile.MAIN_HOST, host);
        ContainerController cc = rt.createAgentContainer(profile);
        return cc;
    }

    public static AgentController creerAgent(ContainerController cc, String nom, String surnom, Object[] objects) {
        AgentController ag = null;
        try {
            ag = cc.createNewAgent(nom, surnom, objects);
            ag.start();
        } catch (StaleProxyException ex) {
            Logger.getLogger(Sma.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ag;
    }
}
