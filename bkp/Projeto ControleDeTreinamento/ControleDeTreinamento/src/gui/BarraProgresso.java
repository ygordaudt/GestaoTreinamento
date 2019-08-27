package gui;

import java.awt.Cursor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ygor
 */
public class BarraProgresso extends JFrame {
    public BarraProgresso() throws InterruptedException {
		JProgressBar progresso = new JProgressBar();
		setSize(300,100);
		add(progresso);
		setLocationRelativeTo(null);
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		setVisible(true);
		progresso.setToolTipText("Aguarde...");
		for (int i=1;i<100;i++){
			if (i==30)
				progresso.setToolTipText("Ta quase");
			if (i==70)
				progresso.setToolTipText("firme");
			progresso.setValue(i);
			Thread.sleep(100);
		}
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		JOptionPane.showMessageDialog(this, "Carregamento concluído");
	}
	public static void main(String[] args) throws InterruptedException{
		new BarraProgresso();
	}
}
