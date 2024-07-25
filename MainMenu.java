import java.awt.*;
import java.awt.event.*;

public class MainMenu {

    public MainMenu(){
        Frame frame = new Frame("Tetris! S5139477");

        frame.setLayout(new FlowLayout());

        frame.setSize(500,800);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
        new MainMenu();
    }

}
