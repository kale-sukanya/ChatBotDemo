package Chatbot;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JavaChatBot {
	public static void main(String[] args) {
		new ChatBot();
}
}

class ChatBot extends JFrame {
	private JTextArea ca = new JTextArea();
	private JTextField cf =new JTextField();
	private JButton b =new JButton();
	private JLabel l =new JLabel(); 
	ChatBot() {
		JFrame f=new JFrame();
		f.setDefaultCloseOperation (EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null); 
		f.setSize(400,400);
		f.getContentPane().setBackground (Color.DARK_GRAY);
		f.setTitle("ChatBot");
		f.add(ca);
		f.add(cf);
		ca.setSize(300,310);
		ca.setLocation (1, 1);
		ca.setBackground (Color.LIGHT_GRAY);
		cf.setSize(300,20);
		cf.setLocation (1,320);
		f.add(b);
		l.setText("SEND");
		b.add(l);
		b.setSize(400,20);
		b.setLocation (300,320);
		
		b.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b) {
					String text=cf.getText().toLowerCase();
					ca.append("You -->"+text+"\n");
					cf.setText("");
					if(text.contains ("hi")) {
						replyMeth("Hello How can I help you?");
						}
					else if(text.contains ("how are you")) {
						replyMeth("I'm Good :). Thank you for asking. What about you?");
						}
					else if(text.contains("what is your name")) {
						replyMeth("I'm the JavaChatbot");
						}
					else if(text.contains ("bye")) {
						replyMeth("Thank you so much for connecting with us");
						}
					else
						replyMeth("I Can't Understand");
				}
			}
		});	
	}
	public void replyMeth (String s) {
		ca.append("ChatBot-->"+s+"\n");
		}
}

