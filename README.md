# Wangshuo1999
#学生选课 班级：计181 姓名：王硕 学号：2018310734

一、实验目的

  分析学生选课系统
  使用GUI窗体及其组件设计窗体界面
  完成学生选课过程业务逻辑编程
  基于文件保存并读取数据
  处理异常
二、实验要求

1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
3、针对操作过程中可能会出现的各种异常，做异常处理
三、实验过程

1、编写思路
    先画出流程图，确定需要实现哪些功能，然后再根据框架写出程序。先确定需要哪些包（swing\awt\IO），将包导入，导入后先构建整体的GUI的所有界面，         
将界面通过监听事件相连接。然后在需要文本写入与文本读出的地方的界面写上文本操作。而打印课表则是通过将文件打开，显示出学生基本信息、所选课程来实现
的。
2、流程图
![](https://github.com/ws1226395769/Wangshuo1999/blob/master/ws9.png)
3、核心代码
    因为代码重复的过多，仅展示部分代码。
   
package 学生选课;
public class Stu {
	String id;	
	String name;
	String password;
public Stu(String i, String n,String p) {
	    id = i;
	    name = n;
	    password = p;
	  }
	  public String getid() {
	    return id;
	  }
	  public String getname() {
	    return name;
	  }
	  public String getpassword() {
		  return password;
	  }
      public String toString() {
		   return "  学号：" + id+ " 姓名：" + name 
				   + " 密码：" + password;
		   }
}

public void actionPerformed(ActionEvent e) {
		String s1 = jtf1.getText();
		String s2 = jtf2.getText();
		//进行判定，若学号或密码错误，则不予通过
		if(e.getSource() ==login1&&s1.equals("1")&&s2.equals("12345")) {
			new caozuo();//显示选课界面
		} 
		else if(e.getSource()==login2) {
			new register();
			}
		else {
			JOptionPane.showMessageDialog(null, "学号或密码错误，请重新输入");
      
      package 学生选课;
/*
 * 该部分主要用于让学生选择是选课还是输出信息
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class caozuo extends JFrame implements ActionListener{
	JButton Choosing = new JButton("选      课");
	JButton Printing = new JButton("输出信息");
	JLabel wel = new JLabel("欢迎！请进行以下操作");
	
	caozuo(){
		setTitle("学生");
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
					System.out.println("txt打开失败！");
					e1.printStackTrace();
				}
				} 
	   
	}
	public static void main(String[] args) {
		caozuo c = new caozuo();
	}
}
四、实验感想
学习了一学期的Java课程,我学到了很多，但每门语言都停留在知识边缘地带，都没深入到它们的精华部分，对它们的精华部分知之甚少，于是我通过这几次试验终于对java的程序有了深入的理解。这个实验中我用到了许多的框图的代码，例如jframe，jbutton，这些代码的使用我同过课程没有很深的了解，所以我通过看书，将这些用法有了更深的理解，最终完成了这次实验，虽然在中途遇到了许多障碍，但是通过和同学的交流，最终解决了这些问题，总的来说这个实验还是较为成功的。
