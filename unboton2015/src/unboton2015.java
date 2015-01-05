import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class unboton2015 extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
   String textocaja1="";
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					unboton2015 frame = new unboton2015();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public unboton2015() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(25, 57, 32, 22);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JLabel Etiqueta1 = new JLabel("etiqueta1");
		Etiqueta1.setBounds(25, 11, 63, 50);
		contentPane.add(Etiqueta1);
		
		JLabel Etiqueta2 = new JLabel("etiqueta2");
		Etiqueta2.setBounds(234, 11, 63, 50);
		contentPane.add(Etiqueta2);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(234, 57, 32, 22);
		contentPane.add(textField2);
		
		JButton boton1 = new JButton("click me");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Apretado");
				//textocaja1 se ha definido en el main linea 20 String textocaja1="";
				textocaja1=textField1.getText();
				textField2.setText(textocaja1);
			}
		});
		boton1.setBounds(98, 57, 91, 23);
		contentPane.add(boton1);
	}
}
