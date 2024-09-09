package aula003;

import javax.swing.*;

public class Exe1_3 extends Exemplo2 {
    public Exe1_3() {
        super();
        setLocation(50, 100);
        setSize(500, 350);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String arg[]) {
        new Exe1_3().setVisible(true);
    }
}
