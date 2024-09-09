package aula003;

import javax.swing.*;

public class Exe1_1 extends Exemplo2 {
    public Exe1_1() {
        super();
        setLocation(50, 100);
        setSize(600, 450);
        setUndecorated(true);// decoração
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String arg[]) {
        new Exe1_1().setVisible(true);
    }
}
