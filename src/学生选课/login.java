package ѧ��ѡ��;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class login extends JFrame implements ActionListener{
	JButton teacher = new JButton("Teacher");
	JButton student = new JButton("Student");
	login(){
		setSize(300,200);
		setTitle("�û�ѡ��");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());    //���ô���Ϊ��������
		add(teacher);
		add(student);    //����ť���봰����
		validate();
		teacher.addActionListener(this);
		student.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==teacher) 
			new Teacher();
		if(e.getSource()==student)
			new Student();
	}
public static void main(String[] args) {
	var Login= new login();
}
}