package aula003;

import javax.swing.*;

public class Exe1_2 extends Exemplo2 {
    public Exe1_2() {
        super();
        setLocation(50, 100);
        setSize(550, 400);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String arg[]) {
        new Exe1_2().setVisible(true);
    }
}
