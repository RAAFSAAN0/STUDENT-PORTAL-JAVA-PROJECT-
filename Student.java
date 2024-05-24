//package classes;
public abstract class Student
{
	public Student(){};
	public abstract void setId(String id);
	public abstract void setName(String name);
	public abstract void setBalance(double balance);
	public abstract void setPassword(String password);
	
	public abstract void showStudentList();
}