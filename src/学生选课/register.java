    
package ѧ��ѡ��;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class register extends JFrame implements ActionListener{
	JLabel id = new JLabel("������ѧ�ţ�");
	JLabel name = new JLabel("������������");
	JLabel password = new JLabel("���������룺");
	JTextField jtf1 = new JTextField(15); 
	JTextField jtf2 = new JTextField(15); 
	JTextField jtf3 = new JTextField(15); 
	JButton r = new JButton("ע��");
	
	register(){
		setTitle("ע��");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(id);add(jtf1);
		add(name);add(jtf2);
		add(password);add(jtf3);
		add(r);
		r.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==r) {
			JOptionPane.showMessageDialog(null, "ע��ɹ���");
			new caozuo();
			/*
			 * ��ע����Ϣת�����ַ���д��txt��
			 */
			Stu student = new Stu(jtf1.getText(),jtf2.getText(),jtf3.getText());
			StringBuffer s = new StringBuffer();
			s.append(student);
			try {
				//���ļ�����д��ע�����Ϣ
				FileWriter fw=new FileWriter("C:\\Users\\Administrator\\Desktop\\ws.txt",true);
				fw.write(s.toString());
				fw.close();
				} 
			catch (IOException n) 
				{
				n.printStackTrace();
				}
			
			}
		}
		
	public static void main(String[] args) {
		register r = new register();
	}
	
}