package ѧ��ѡ��;
/*
 * �ò�����Ҫ������ѧ��ѡ����ѡ�λ��������Ϣ
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class caozuo extends JFrame implements ActionListener{
	JButton Choosing = new JButton("ѡ      ��");
	JButton Printing = new JButton("�����Ϣ");
	JLabel wel = new JLabel("��ӭ����������²���");
	
	caozuo(){
		setTitle("ѧ��");
		setSize(250,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		add("North",wel);
		add("West",Choosing);add("East",Printing);
		validate();
		Choosing.addActionListener(this);;
		Printing.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Choosing) {
			new Choosing();
		}
		if(e.getSource()==Printing) {
			try {
				Runtime.getRuntime().exec("C:\\Users\\Administrator\\Desktop\\ws.txt");
				} catch (Exception e1) {
					System.out.println("txt��ʧ�ܣ�");
					e1.printStackTrace();
				}
				} 
	   
	}
	public static void main(String[] args) {
		caozuo c = new caozuo();
	}
}