package sma;

import jade.core.behaviours.CyclicBehaviour;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import mg.toky.projet3D.controller.FXMLDocumentController;
import mg.toky.projet3D.main.render.Camera;
import static mg.toky.projet3D.main.render.Camera.getForward;
import mg.toky.projet3D.math.Vector3f;

public class AgentRecepteur extends GuiAgent {

    private FenetreControle fen;

    @Override
    protected void setup() {
        fen = new FenetreControle();
        fen.setRecepteur(this);
        fen.setVisible(true);
        fen.setTitle("Agent " + getLocalName());
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                MessageTemplate msgTmplt = MessageTemplate.or(
                        MessageTemplate.MatchOntology("OCR"),
                        MessageTemplate.MatchOntology("Lampe"));
                ACLMessage message = receive(msgTmplt);
                if (message != null) {
                    System.out.println(" Je suis l'agent " + getLocalName() + " Un nouveau message de " + message.getSender().getLocalName() + "\n"
                            + " contenus: " + message.getContent());
                    String msg = message.getContent();
                    String[] coord = msg.split("#");
                    System.out.println("onthology : " + message.getOntology());
                    if (message.getOntology().equals("Lampe")) {
                        Vector3f rota = Camera.getRotation();
                        rota.setY(Float.valueOf(coord[0]));
                        Camera.setRotation(rota);
                    } else if (message.getOntology().equals("OCR")) {
                        //GAUCHE
                        if (message.getContent().contains(fen.getD_gauche().getText())) {
                            Vector3f rota = Camera.getRotation();
                            rota.addY(fen.getSlide_angle().getValue());
                            Camera.setRotation(rota);
                        }
                        //DROITE
                        if (message.getContent().contains(fen.getR_droite().getText())) {
                            Vector3f rota = Camera.getRotation();
                            rota.addY(-fen.getSlide_angle().getValue());
                            Camera.setRotation(rota);
                        }
                        if (message.getContent().equals(fen.getD_avant().getText())) {
                            Camera.getPosition().add(getForward().mult(new Vector3f(-Camera.speed, -Camera.speed, -Camera.speed)));
                        }
                        if (message.getContent().equals(fen.getD_arriere().getText())) {
                            Camera.getPosition().sub(getForward().mult(new Vector3f(-Camera.speed, -Camera.speed, -Camera.speed)));
                        }

                    }
                    fen.getLab_message().setText(message.getContent());
                } else {
                    block();
                }
            }
        });
    }

    @Override
    protected void onGuiEvent(GuiEvent ge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
