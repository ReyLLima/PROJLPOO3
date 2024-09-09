package aula003;

import javax.swing.*;

public class Exemplo1 extends JFrame {
    Exemplo1() {
        setTitle("Descobrindo JFrame");
        setBounds(200, 150, 400, 300); /* parametros corresponden a 
                                          posicao x,y, altura e largura*/
    }

    public static void main(String arg[]) {
        Exemplo1 Ex = new Exemplo1();
        Ex.setVisible(true);
    }
}
