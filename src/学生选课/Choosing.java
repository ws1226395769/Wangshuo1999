package ѧ��ѡ��;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class Choosing extends JFrame implements  ActionListener{
	JLabel a = new JLabel("��ѡ��γ̣�");
	JButton r = new JButton("ȷ��");
	JCheckBox jc1 = new JCheckBox("��ʦ���ƣ�С��    ��ʦ��ţ� 1  ���ڿγ̣�����   ѧ�֣�2 �ص㣺1   ʱ�䣺9:25am-11:15am");
	JCheckBox jc2 = new JCheckBox("��ʦ���ƣ�С��    ��ʦ��ţ� 2  ���ڿγ̣�Ӣ��   ѧ�֣�2 �ص㣺2   ʱ�䣺11:15am-12:05pm");
	JCheckBox jc3 = new JCheckBox("��ʦ���ƣ�С��   ��ʦ��ţ�  3 ���ڿγ̣�����   ѧ�֣�2  �ص㣺3  ʱ�䣺13:30pm-15:05pm");
	
	Choosing(){
		setTitle("ѡ��");
		setSize(600,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(a);
		add(jc1);
		add(jc2);
		add(jc3);
		add(r);
		jc1.addActionListener(this);
		jc2.addActionListener(this);
		jc3.addActionListener(this);
		r.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==r) {
				JOptionPane.showMessageDialog(null, "ѡ�γɹ���");
				new caozuo();
				try {
					FileWriter fw1=new FileWriter("C:\\Users\\Administrator\\Desktop\\ws.txt",true);
					BufferedWriter fw=new BufferedWriter(fw1);
					fw.write("��ѡ�γ̣�");
					fw.newLine();
					fw.write("��ʦ���ƣ�С��    ��ʦ��ţ� 1  ���ڿγ̣�����   ѧ�֣�2 �ص㣺1   ʱ�䣺9:25am-11:15am");
					fw.newLine();
					fw.write("��ʦ���ƣ�С��    ��ʦ��ţ� 2  ���ڿγ̣�Ӣ��   ѧ�֣�2 �ص㣺2   ʱ�䣺11:15am-12:05pm");
					fw.newLine();
					fw.write("��ʦ���ƣ�С��   ��ʦ��ţ�  3 ���ڿγ̣�����   ѧ�֣�2  �ص㣺3  ʱ�䣺13:30pm-15:05pm");					
					fw.close();
				}
				catch (IOException n) 
				{
				n.printStackTrace();
				}
			}
		}
		public static void main(String args[]) {
			Choosing c = new Choosing();
		}
}
