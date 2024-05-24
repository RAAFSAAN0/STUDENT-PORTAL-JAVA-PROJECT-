//package classes;
import java.lang.*;
import java .util.Scanner;
import Interface.*;

	public class StudentProfile extends Student implements IStudentProfile
	{
    private Courses[]course=new Courses[10];
	private String id;
	private String name;
	private String password;
	private double balance;
   
	
	public void setId(String id){this.id = id;}
	public void setName(String name){this.name = name;}
	public void setBalance(double balance){this.balance = balance;}
	public void setPassword(String password){this.password = password;}
	
	public String getId(){return id;} 
	public String getName(){return name;}
	public double getBalance(){return balance;} 
	public String getPassword() {return password;}
    public void setaddMoney(double amount)
    {
        if(amount>0)
        {
            System.out.println("Your previous amount: "+balance);
            System.out.println("Your added money: "+amount);
            balance=balance+amount;
            System.out.println("Your Current amount: "+balance);
        }
        else
        {
           System.out.println("your deposit amount is less than 0");
        }
        
    }
    public double getaddMoney()
    {
        return balance;
    }

   
   

	public void showStudentList() {

				System.out.println("Student Name : "+getName());
				System.out.println("Student ID: "+getId());
                System.out.println("Your balance: "+getBalance());
		
	}
	public void insertCourses(Courses a)
  {
      int flag=0;
      for(int i=0;i<course.length;i++)
      {
          if(course[i]==null)
          {
              course[i]=a;
              flag=1;
              break;
          }
      }
      if(flag == 1)
		{
			System.out.println("Course Added Successfully");
		}
		else
		{
			System.out.println("Course did not added");
		}
  }
  public void removeCourses(Courses c)
  {
    {
		int flag = 0;
		for(int i=0; i<course.length; i++)
		{
			if(course[i] == c)
			{
				course[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Course Removed");}
		else{System.out.println("Can Not Remove");}
	}
  }

 


 public void showCourese()
 {
     for(int i=0;i<course.length;i++)
     {
         if(course[i]!=null)
         {
            /* System.out.println("Course name: "+course[i].getCourseName());
             System.out.println("Course Id: "+course[i].getcourseId());
             System.out.println("Course Price: "+course[i].getCoursePrice());
             */
            course[i].showdetails();
         }
     }
 }

 public Courses searchCourses(String id)
 {
     Courses e = null;
     
     for(int i=0; i<course.length; i++)
     {
         if(course[i] != null)
         {
             if(course[i].getCourseId().equals(id))
             {
                 e = course[i];
                 break;
             }
         }
     }
     if(e != null)
     {
         System.out.println("Courses Found");
     }
     else
     {
         System.out.println("Courses Not Found");
     }
     return e;
 }
		
	}
