package aula003
        ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exe3 extends classePasswordField implements ActionListener
{
	public static String A, B;
	public static int x =0;
	public Exe3()
	{
        super();
        setLocation(50, 100);
        setSize(600, 450);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        getRootPane().setBorder(BorderFactory.createRaisedBevelBorder());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
		Sx.addActionListener(this);
		Tx1.setText("");
		Tx2.setText("");
	}
	public static void main(String arg[])
	{
		Exe3 Ex = new Exe3();
		Ex.show();
	}
        
	public void actionPerformed(ActionEvent e)
	{
		x = x+1;
		String A = Tx1.getText();
		this.A = A;
	
		
		String B = Tx2.getText();
		this.B = B;
	
		
		if(Sx.getText().equals("admin"))
		{
		
                    JOptionPane.showMessageDialog(null,"Senha Correta !","Alerta ! ", -1);
		}
		else
		{
			if(x>3)
			{
				JOptionPane.showMessageDialog(null,"Até Logo !","Finalizando ! ",0);
				System.exit(0);
			}
			JOptionPane.showMessageDialog(null,"Senha Errada !","Alerta ! ", -1);
		}
	}
	
}
