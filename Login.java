import javax.swing.*;

class Login
{
JFrame frame;

JLabel l1,l2,l3;
JTextField tf;
JPasswordField pf;
JButton bt,bt1;
Login(){
	frame = new JFrame();
	
	l1 = new JLabel("USER NAME:");
	l2 = new JLabel("PASSWORD:");
	l3 = new JLabel("Login Page");
	tf = new JTextField("Enter user id");
	pf = new JPasswordField("Enter Password");
	bt = new JButton("Login");
	bt1 = new JButton("Close");
	l1.setBounds(100,100,150,30);
	l2.setBounds(100,200,150,30);
	l3.setBounds(205,30,300,50);
	tf.setBounds(300,100,150,30);
	pf.setBounds(300,200,150,30);
    bt.setBounds(150,250,75,30);	
	bt1.setBounds(250,250,75,30);
	frame.add(l1);
	frame.add(l2);
	frame.add(l3);
	frame.add(tf);
	frame.add(pf);
	frame.add(bt);
	frame.add(bt1);
	

//frame.setTitle(Login_Library);
frame.setBounds(100,75,600,600);
frame.setLayout(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String args[])
{
	new Login();
}}