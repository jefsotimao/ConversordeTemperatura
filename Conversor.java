package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
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
	public Conversor() {
		setFont(new Font("Dialog", Font.PLAIN, 17));
		setForeground(Color.CYAN);
		setTitle("CONVERSOR DE TEMPERATURA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 214);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double fah = Double.parseDouble(valor.getText());
				double cel = (fah - 32) /1.8;
				resultado.setText(cel +" ºC");
			}
		});
		btnConverter.setFont(new Font("Tahoma", Font.BOLD, 26));
		contentPane.add(btnConverter, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblFahrenheit = new JLabel("FAHRENHEIT");
		lblFahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
		lblFahrenheit.setForeground(Color.BLUE);
		lblFahrenheit.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel.add(lblFahrenheit);
		
		valor = new JTextField();
		valor.setFont(new Font("Tahoma", Font.PLAIN, 22));
		valor.setHorizontalAlignment(SwingConstants.CENTER);
		valor.setBackground(Color.WHITE);
		panel.add(valor);
		valor.setColumns(10);
		
		JLabel lblCelcius = new JLabel("CELSIUS");
		lblCelcius.setHorizontalAlignment(SwingConstants.CENTER);
		lblCelcius.setBackground(Color.WHITE);
		lblCelcius.setForeground(Color.RED);
		lblCelcius.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel.add(lblCelcius);
		
		resultado = new JTextField();
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel.add(resultado);
		resultado.setColumns(10);
	}

}
