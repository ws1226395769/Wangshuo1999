package ѧ��ѡ��;
/*
 * ����һ��ѧ����
 */
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
		   return "  ѧ�ţ�" + id+ " ������" + name 
				   + " ���룺" + password;
		   }
}