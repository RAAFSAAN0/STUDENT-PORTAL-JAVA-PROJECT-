//package classes;
import java.lang.*;
import Interface.*;

public class Management {
    
    private StudentProfile students[];

public Management(){
	students =new StudentProfile[10];
}
    //insert student
    public void insertStudent(StudentProfile e)
	{
		int flag = 0;
		//e.showInfo();
		for(int i=0; i<students.length; i++)
		{
			if(students[i] == null)
			{
				students[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Student Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}

	}


    

    //remove student

    public void removeStudent(StudentProfile e)
	{
		int flag = 0;
		for(int i=0; i<students.length; i++)
		{
			if(students[i] == e)
			{
				students[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println(" Student Removed");}
		else{System.out.println("Can Not Remove");}
	}

    // search student

    public StudentProfile searchStudent(String id)
	{
		StudentProfile e = null;
		
		for(int i=0; i<students.length; i++)
		{
			if(students[i] != null)
			{
				if(students[i].getId()==id)
				{
					e = students[i];
					break;
				}
			}
		}
		if(e != null)
		{
			System.out.println("Student Found");
		}
		else
		{
			System.out.println("Student Not Found");
		}
		return e;
	}
    
	public void showStudentList()
	{
		System.out.println("----------------------------------------------------------------------------");
        System.out.println("                              Student List\n                                  ");
        System.out.println("----------------------------------------------------------------------------");
		

        for(int i =0 ; i<students.length;i++)
        {
			
        	if(students[i] !=null)
            {
             
               // System.out.println("Student Name : "+students[i].getName());
				//System.out.println("Student ID: "+students[i].getId());
				//System.out.println("your current balance: "+getaddMoney());
                students[i].showStudentList();

            }

        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            End\n                              ");
        System.out.println("----------------------------------------------------------------------------");
	}
	

  
   
    
}
