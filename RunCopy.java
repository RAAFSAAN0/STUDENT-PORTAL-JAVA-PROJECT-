//import classes.*;
import java.lang.*;
import java.util.*;
import java.io.*;
import Interface.*;
import FileIO.*;




public class RunCopy {
    public static void main(String[] args)
     {
        System.out.println("            *********************************************************        *");
        System.out.println("            ----------------   WELCOME TO PORTAL    -------------         ");
        System.out.println("            ********************************************************          ");
        System.out.println("\n");
        boolean choice = true;
        Scanner input = new Scanner(System.in);

        Management m = new Management();
        Courses c=new Courses();
        StudentProfile student = new StudentProfile();
        Projectfile myfile = new Projectfile();
        //CourseManagement cm=new CourseManagement();



        while(choice){
        System.out.println("                 ==========   HERE ARE SOME OPTIONS   ================");
        System.out.println("\n");
        System.out.println("                              1.Student Section");
        System.out.println("\n");
        System.out.println("                              2.Admin Section");
        System.out.println("\n");
        System.out.println("                              3.Exit");
        System.out.println("\n");
        System.out.print("Choose an option: ");

        
        int first = input.nextInt();
        switch (first) {

            case 1 :   
                System.out.println("             =====================================================\n");
				System.out.println("                   	 Welcome to Student Section ! \n");
                System.out.println("             =======================================================");
				System.out.println("\n");

				System.out.println("			1. Create your Profile\n");
                System.out.println("                        2. Login to your profile ");
				/*System.out.println("			2. Add Course\n");
                System.out.println("			3. Drop Course\n");
				System.out.println("			4. Account Information\n");
				System.out.println("			5. Add Money\n");
                System.out.println("                        6. Go back\n");//bug
				System.out.println("			7. Exit \n");
				System.out.println("			Please choose an option : ");*/
		
                       
                       int second1 = input.nextInt();
                       switch (second1)
                                    {
                                    case 1: 
                                            System.out.println("\n \n");
                                            System.out.println("Please provide the required informations to create a Profile ");
                                            Scanner input2=new Scanner(System.in);
                                            System.out.print("Enter Your Name : ");
                                            String name = input2.nextLine();
                                            System.out.print("Enter Your Id Number : ");
                                            String id1 = input.next();
                                            System.out.print("Enter Your Password: ");
                                            String password = input.next();
                                            System.out.print("Enter Balance: ");
                                            double balance = input.nextDouble();
                                                student=new StudentProfile();
                                               
                                                student.setName(name);
                                                student.setId(id1);
                                                student.setPassword(password);
                                                student.setBalance(balance);

                                                m.insertStudent(student);
                                                myfile.writeInFile("Student name: "+name);
                                                myfile.writeInFile("student Id no :"+id1);
                                                myfile.writeInFile("Student password: "+password);
                                                myfile.writeInFile("Student balance: "+balance );
                                                myfile.readFromFile();
                                        

                                        break;
                                        case 2:  

                                        System.out.println("====================================================");
                                        System.out.println("    ------    Login Page  -----------------");
                                        System.out.println("====================================================");
										System.out.print("Enter Your Name : ");
										Scanner input5=new Scanner(System.in);
										String name1=input5.nextLine();
										System.out.print("Enter Your Password: ");
										String pass = input.next();
										   if(name1.equals(student.getName()) && pass.equals(student.getPassword()))
                                           {
											   System.out.println("			1. Select Courses\n");
                                               System.out.println("			2. Drop Course\n");
				                               System.out.println("			3. Account Information\n");
				                               System.out.println("			4. Add Money\n");
                                               System.out.println("                        5. Go back\n");//bug
				                               System.out.println("			7. Exit \n");
				                               System.out.println("			8. Student Login ");
				                               System.out.println("			Please choose an option : ");
											   int third = input.nextInt();

                                               switch(third){
                                                   case 1:
                                       
                                            
                                            
                                            System.out.println("********************************************************");
                                            System.out.println("            FILL THE REQUIREMENTS TO PURCHASE COURSE                  ");
                                            System.out.println("**********************************************************\n");
                                            Scanner input3=new Scanner(System.in);
                                            System.out.print("Enter the name of the course : ");
                                            String courseName=input3.nextLine();
                                            System.out.print("Enter the Credit of the course : ");
                                            double courseCredit=input.nextDouble();
                                            Scanner input4=new Scanner(System.in);
                                            System.out.print("Enter course Id: ");
                                            String courseId=input4.nextLine();

                                           


                                           
                                            c=new Courses();
                                            c.setcourseName(courseName);
                                            c.setCourseCredit(courseCredit);
                                            c.setCourseID(courseId);
                                            if(c.CourseBalance()<student.getBalance())
                                            {
                                            student.insertCourses(c);
                                            }
                                            else 
                                            {   
                                                System.out.println("====================================================");
                                                System.out.println("You donot have sufficient balance to buy this course");
                                                System.out.println("====================================================");
                                            }

                                            break;
                                            
                                            case 2:
                                            System.out.println("You have Selected to Drop Courses");
                                            System.out.print("Enter course Id: ");								
                                            student.removeCourses(student.searchCourses(input.next())); 


                                            case 3: System.out.println("=================== ACCOUNT INFORMATION =================");
                                            student.showCourese();
                                            m.showStudentList();

                                           // System.out.println("Remaining balance "+c.getcourseBalance());
                                            break;
                                            default:
                                            break;

                                            case 4: 
                                             System.out.println("You have selected to add money");
                                             Scanner amount=new Scanner(System.in);
                                             System.out.print("Enter the amount you want to add: ");
                                             double amount1=amount.nextDouble();

                                             student.setaddMoney(amount1);



                                             case 5:

                                             System.out.println("You have selected to go back ");

                                             break;
                                               }
                                               break;
                                            }
                                            else 
                                            {   
                                                System.out.println("                ============================================");
                                                System.out.println("                Sorry Invalid Username Or Password Try Again");
                                                System.out.println("                ============================================");
                                            }
                                        }

                                        



                       
                       
                                    
                 
                                  break;

                       case 2 :             
                                 System.out.println("             ================================================================================\n");
                                 System.out.println("                   			Welcome to Admin Panel ! \n");
                                 System.out.println("             ________________________________________________________________________________\n");

                                System.out.println("1.Show Student List");
                                System.out.println("2.Remove Student");
                                //subject adding droping
                                System.out.println("Choose an Option");
                                int x = input.nextInt();
                        switch (x) {

                            case 1: 
                                     System.out.println("You have Selected to see all the Existing Students");
							
							        m.showStudentList();
                                  
                            break;
							



                            case 2: 
                                     
                            
                                     System.out.println("You have Selected to remove an existing Student");
							         System.out.print("Enter Student Id: ");								
							         m.removeStudent(m.searchStudent(input.next())); //bug
							
                                
                                break;
                        
                                default:
                                break;
                               
                               }
                             
							   break;

                            






                default:
                break;



                case 3:
                System.out.println("You have selected to exit the application");
                System.out.println("Thank you");
                choice = false;
                break;
                
           
        
        }

       
    }
}
    }
