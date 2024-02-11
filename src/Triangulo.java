import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

public class Triangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triangulo frame = new Triangulo();
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
	public Triangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JTextField lado1 = new JTextField();
		lado1.setBounds(55, 120, 67, 20);
		JTextField lado2 = new JTextField();
		lado2.setBounds(140, 120, 67, 20);
		JTextField lado3 = new JTextField();
		lado3.setBounds(227, 120, 67, 20);
		JButton boton = new JButton();
		boton.setBounds(137, 169, 75, 25);
		JLabel resultado = new JLabel();
		resultado.setBounds(15, 236, 73, 17);
		JLabel angulo = new JLabel();
		angulo.setBounds(15, 264, 0, 0);
		JLabel jLabel1 = new JLabel();
		jLabel1.setBounds(24, 11, 283, 21);
		
		boton.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        boton.setText("Botón");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	String ladoA = lado1.getText();        // TODO add your handling code here:
            	String ladoB = lado2.getText();        // TODO add your handling code here:
            	String ladoC = lado3.getText();        // TODO add your handling code here:
            	double a = Integer.parseInt(ladoA);
            	double b = Integer.parseInt(ladoB);
            	double c = Integer.parseInt(ladoC);


            	String Tipo = "";

            	if (Integer.parseInt(ladoA) == Integer.parseInt(ladoB) && Integer.parseInt(ladoB) == Integer.parseInt(ladoC)){
            	    Tipo = "equilatero";
            	    resultado.setText("El triángulo es: "+Tipo);
            	}
            	else if (Integer.parseInt(ladoA) == Integer.parseInt(ladoB) || Integer.parseInt(ladoB) == Integer.parseInt(ladoC) || Integer.parseInt(ladoA) == Integer.parseInt(ladoC)){
            	    Tipo = "isoceles";
            	    resultado.setText("El triángulo es: "+Tipo);
            	}
            	else{
            	    Tipo = "escaleno";
            	    resultado.setText("El triángulo es: "+Tipo);
            	}

            	switch(Tipo){
            	    case "equilatero":
            	        
            	        break;
            	    
            	    case "isoceles":
            	        
            	        break;
            	        
            	    case "escaleno":
            	        
            	        double VanguloA = ((b*b) + (c*c) - (a*a)) / 2*(b*c);
            	        double anguloA = Math.cos(VanguloA);
            	        angulo.setText("El ángulo A tiene una medida de "+anguloA);
            	        break;
            	    }
            }
        });

        resultado.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        resultado.setText("¡Bienvenido!");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("CALCULADORA DE TRIANGULOS");
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Ingrese la longitud de cada lado:");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(67, 64, 202, 14);
        contentPane.add(lblNewLabel);
        contentPane.add(boton);
        contentPane.add(lado3);
        contentPane.add(lado2);
        contentPane.add(lado1);
        contentPane.add(jLabel1);
        contentPane.add(resultado);
        contentPane.add(angulo);

	}

}
