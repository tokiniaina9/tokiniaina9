package sma;

import com.googlecode.javacv.cpp.opencv_core.CvScalar;
import static com.googlecode.javacv.cpp.opencv_core.cvScalar;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.ACLMessage;
import java.util.Map;

public class AgentEmmeteur extends GuiAgent {

    public static CvScalar Bminc = cvScalar(15, 25, 18, 0);
    public static CvScalar Bmaxc = cvScalar(110, 100, 128, 0);
    public static CvScalar Rminc = cvScalar(150, 150, 75, 0);
    public static CvScalar Rmaxc = cvScalar(190, 255, 255, 0);

    public static Agent agent;
    private static String message;
    private static String nom_agent;

    private GuiAgentExp gui;

    @Override
    protected void setup() {

        Thread t2 = new Thread(() -> {
            gui = new GuiAgentExp();
            gui.setAgent(this);
            gui.setTitle(getLocalName());
            gui.setVisible(true);
            addBehaviour(new CyclicBehaviour() {

                @Override
                public void action() {
                    ACLMessage message = receive();
                    if (message != null) {
                        gui.afficheMessage(message.getContent(), message.getSender().getLocalName(), true);
                    } else {
                        block();
                    }
                }
            });
        });
        
        t2.start();
    }

    public void ordonner(int[] coord) {
        ACLMessage msg = new ACLMessage();
        msg.addReceiver(new AID("souris", AID.ISLOCALNAME));
        msg.setContent(coord[0] + "#" + coord[1]);
        send(msg);
    }

    @Override
    public void onGuiEvent(GuiEvent ge) {
        Map<String, Object> params = (Map<String, Object>) ge.getParameter(0);
        String contenu = params.get("mesazy").toString();
        String agentDest = params.get("dest").toString();
        ACLMessage msg = new ACLMessage();
        switch (ge.getType()) {
            case 0:
                msg.addReceiver(new AID(agentDest, AID.ISLOCALNAME));
                msg.setContent(contenu);
                send(msg);
                break;
            case 1:
                msg.addReceiver(new AID(agentDest, AID.ISLOCALNAME));
                msg.setContent(contenu);
                send(msg);
                break;
            default:
                break;
        }
    }
}
