package 学生选课;

import java.awt.FlowLayout;

import javax.swing.*;

public class Teacher extends JFrame {
	JLabel j1 = new JLabel("选课学生：");
	JLabel  name = new JLabel("老师名称：小明");
	JLabel  ID = new JLabel("老师编号： 1");
	JLabel  course = new JLabel("所授课程：物理 "+"学分：2"+
	                            "地点：1"+"时间：9:25am-11:15am");
	JTextField jtf1 = new JTextField("ws",15);
	Teacher(){
		setSize(400,200);
		setTitle("教师");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout(5));    
		add(name);     //将标签加入窗口中
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