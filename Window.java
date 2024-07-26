import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Window {

    private static JFrame frame;
    private ArrayList<JPanel> JPanelList = new ArrayList<>();

    public Window(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(600,800);
        frame.setVisible(true);
    }

    public void addPanel(JPanel panel){
        frame.add(panel);
        JPanelList.add(panel);
    }

    public void clearWindow(){
        for(JPanel panel : JPanelList){
            Component[] components = panel.getComponents();
            for(Component component : components){
                panel.remove(component);
            }
            panel.revalidate();
            panel.repaint();
        }
        JPanelList.clear();
    }
}

