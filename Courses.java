//package classes;
import java.lang.*;
import java .util.Scanner;
import Interface.*;
public class Courses implements ICourses
	
{

	private double courseCredit;
	private String courseName;
	public String courseId;
	private double percreditprice=4000;
	public double coursebalance;
	public Courses(){}
	public Courses(double courseCredit,String courseName,String courseId)
	{
		this.courseCredit = courseCredit;
		this.courseName =courseName;
		this.courseId = courseId;
	}
	public void setCourseCredit(double courseCredit)
	{
		this.courseCredit=courseCredit;
	}
	
	public void setcourseName(String courseName)
	{
		this.courseName=courseName;
	}
	public void setCourseID(String courseId)
	{
		this.courseId=courseId;
	}
	public double CourseBalance()
	{
		coursebalance =this.getCourseCredit()*percreditprice;
         return coursebalance;
	}

	public double getCourseCredit()
	{
		return courseCredit;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	public String getCourseId()
	{
		return courseId;
	}
	public void showdetails()
	{
		System.out.println("\n\n       You have Selected "+this.getCourseName());
		System.out.println("           Your Total Cost "   );
		System.out.println("           course id "+getCourseId()  ); 
		System.out.println( "          Total "+CourseBalance()+"Taka ");
	//	System.out.println("\n\n                    ====/Thank You!/====\n\n\n");


		
	}
}
