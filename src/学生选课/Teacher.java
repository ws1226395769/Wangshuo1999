package ѧ��ѡ��;

import java.awt.FlowLayout;

import javax.swing.*;

public class Teacher extends JFrame {
	JLabel j1 = new JLabel("ѡ��ѧ����");
	JLabel  name = new JLabel("��ʦ���ƣ�С��");
	JLabel  ID = new JLabel("��ʦ��ţ� 1");
	JLabel  course = new JLabel("���ڿγ̣����� "+"ѧ�֣�2"+
	                            "�ص㣺1"+"ʱ�䣺9:25am-11:15am");
	JTextField jtf1 = new JTextField("ws",15);
	Teacher(){
		setSize(400,200);
		setTitle("��ʦ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout(5));    
		add(name);     //����ǩ���봰����
		System.out.print("\n");
		add(ID);  
		add(course);
		add(j1);
		add(jtf1);
		validate();
	}
	
	public static void main(String[] args) {
		new Teacher();
	}
	
}