package aula003;

import javax.swing.*;
import java.awt.*;

public class Exe2 extends Exemplo2 {

    public Exe2() {
        super();
        setLocation(50, 100);
        setSize(600, 450);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        getRootPane().setBorder(BorderFactory.createRaisedBevelBorder());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String arg[]) {
        new Exe2().setVisible(true);
    }
}
