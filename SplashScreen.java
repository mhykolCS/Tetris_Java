import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SplashScreen{

    public SplashScreen(Window window){

        JPanel background = new JPanel();
        background.setBackground(Color.blue);

        window.addPanel(background);
    }
}