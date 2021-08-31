package gui;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textFieldLU;
	private JTextField textFieldApellido;
	private JTextField textFieldName;
	private JTextField textFieldMail;
	private JTextField textFieldGit;
	

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(580, 289));
		setResizable(false);
		setContentPane(contentPane);
		
	
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 20));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		tabInformation.setLayout(null);
		
		
		JLabel lblLu = new JLabel("LU");
		lblLu.setFont(new Font("SansSerif", Font.BOLD, 15));
		tabInformation.add(lblLu);
		contentPane.add(tabbedPane, BorderLayout.WEST);
		lblLu.setBounds(1, 10, 62, 38);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblApellido.setBounds(1, 42, 62, 38);
		tabInformation.add(lblApellido);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblName.setBounds(1, 77, 62, 38);
		tabInformation.add(lblName);
		
		JLabel lblMail = new JLabel("E-mail");
		lblMail.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblMail.setBounds(1, 112, 62, 38);
		tabInformation.add(lblMail);
		
		JLabel lblGit = new JLabel("GitHub URL");
		lblGit.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblGit.setBounds(1, 145, 91, 40);
		tabInformation.add(lblGit);
		
		JLabel lblIma = new JLabel();
		lblIma.setBounds(445, 30, 120, 159);
		ImageIcon ima = new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto()));
		Icon ima2 = new ImageIcon(ima.getImage().getScaledInstance(lblIma.getWidth(), lblIma.getHeight(), Image.SCALE_DEFAULT));
		contentPane.add(lblIma);
		lblIma.setIcon(ima2);

		DateTimeFormatter time1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter time2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		JLabel lblTime = new JLabel("Esta ventana fue generada el " + time1.format(LocalDateTime.now()) + " a las: "+time2.format(LocalDateTime.now()));
		lblTime.setFont(new Font("SansSerif", Font.BOLD, 14));
		contentPane.add(lblTime, BorderLayout.SOUTH);
		
		
		textFieldLU = new JTextField();
		textFieldLU.setFont(new Font("SansSerif", Font.PLAIN, 14));
		textFieldLU.setBounds(93, 21, 322, 20);
		textFieldLU.setText(String.valueOf(studentData.getId()));
		tabInformation.add(textFieldLU);
		textFieldLU.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setFont(new Font("SansSerif", Font.PLAIN, 14));
		textFieldApellido.setBounds(93, 53, 322, 20);
		textFieldApellido.setText(studentData.getLastName());
		tabInformation.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("SansSerif", Font.PLAIN, 14));
		textFieldName.setBounds(93, 88, 322, 20);
		textFieldName.setText(studentData.getFirstName());
		tabInformation.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldMail = new JTextField();
		textFieldMail.setFont(new Font("SansSerif", Font.PLAIN, 14));
		textFieldMail.setBounds(93, 123, 322, 20);
		textFieldMail.setText(studentData.getMail());
		tabInformation.add(textFieldMail);
		textFieldMail.setColumns(10);
		
		
		textFieldGit = new JTextField();
		textFieldGit.setFont(new Font("SansSerif", Font.PLAIN, 14));
		textFieldGit.setBounds(93, 156, 322, 20);
		textFieldGit.setText(studentData.getGithubURL());
		tabInformation.add(textFieldGit);
		textFieldGit.setColumns(10);

	
	
		
		
	
	
	}
}