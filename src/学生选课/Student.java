package ѧ��ѡ��;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Student extends JFrame implements ActionListener{
	JButton login1 = new JButton("��¼");
	JButton login2 = new JButton("ע��");
	JLabel id = new JLabel("ѧ�ţ�");
	JLabel password = new JLabel("���룺");
	JTextField jtf1 = new JTextField(15); 
	JTextField jtf2 = new JTextField(15); 
	
	Student(){
		setTitle("ѧ��");
		setSize(250,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		add(id);add(jtf1);
		add(password);add(jtf2);
		add(login1);add(login2);
		validate();
		login1.addActionListener(this);;
		login2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String s1 = jtf1.getText();
		String s2 = jtf2.getText();
		//�����ж�����ѧ�Ż������������ͨ��
		if(e.getSource() ==login1&&s1.equals("1")&&s2.equals("12345")) {
			new caozuo();//��ʾѡ�ν���
		} 
		else if(e.getSource()==login2) {
			new register();
			}
		else {
			JOptionPane.showMessageDialog(null, "ѧ�Ż������������������");
		}
		
		
	}
	public static void main(String[] args) {
		Student student= new Student();
	}
}