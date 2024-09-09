package aula003;

import javax.swing.*;
import java.awt.*;

public class Exemplo4 extends Exemplo2 {

    public Exemplo4() {
        super();
        setLocation(50, 100);
        setSize(600, 450);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.red, 3));
        /*
         * Classe BorderFactory trata as bordas
         * Sugestao: visitar a documentacao dessa classe na API do Java
         */
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String arg[]) {
        new Exemplo4().setVisible(true);
    }
}
