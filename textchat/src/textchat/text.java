package textchat;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class text extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					text frame = new text();
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
	public text() {
		String Name = new String("Renet");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 920);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		textField.setBounds(17, 17, 486, 45);
		contentPane.add(textField);
		textField.setColumns(30);
		
		JButton btnSend = new JButton("Send");
		

		btnSend.setBounds(520, 32, 75, 31);
		contentPane.add(btnSend);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 81, 578, 756);
		contentPane.add(scrollPane);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Meiryo", Font.PLAIN, 25));
		scrollPane.setViewportView(label);
		label.setVerticalAlignment(SwingConstants.TOP);
		
		
		btnSend.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText() != ""){
					String str = new String("<html>" + Name + " > "+ textField.getText() + "<br>");
					str += label.getText();
					label.setText(str);
					textField.setText("");
				}	
			}
		});
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					if(textField.getText() != ""){
						String str = new String("<html>" + Name + " > "+ textField.getText() + "<br>");
						str += label.getText();
						label.setText(str);
						textField.setText("");
					}
				}
				
			}
		});
		
		
	}
}
