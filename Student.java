import java.util.*;
import java.util.Map.Entry;

class Student{
    public String name,college,branch,place;
    public int rollno,sem;
    void Studentdetails(String name, String college, String branch, String place, int rollno, int sem) {
        this.name = name;
        this.college = college;
        this.branch = branch;
        this.place = place;
        this.rollno = rollno;
        this.sem = sem;
    }
        
    }
class helperclass extends Student{
    HashMap<Integer,Student> hashob = new HashMap<Integer,Student>();
    Scanner sc = new Scanner(System.in);
    

    void addstudent()
        {
            System.out.println("Enter Student Name ");
            String name =sc.next();
            System.out.println("Enter Student Rollno");
            int rollno= sc.nextInt();
            System.out.println("Enter Student college  ");
            String college= sc.next();
            System.out.println("Enter student Place ");
            String place= sc.next();
            System.out.println("Enter student branch");
            String branch= sc.next();
            System.out.println("Enter student Semester");
            int sem= sc.nextInt();
           ;
           Student S1=new Student(); 
           S1.Studentdetails(name,college,branch,place,rollno,sem);
             if (hashob.containsKey(rollno)) 
             {
                System.out.println("Student Already present");
             } else {
                hashob.put(rollno, S1);
             }
           
        }
        void SearchStudent()
        {
            System.out.println("Enter Student Rollno to search");
            int Rollno= sc.nextInt();
            for (Map.Entry<Integer,Student> mapElement : hashob.entrySet()) 
            { 
                if(mapElement.getKey() == Rollno) {
                Student s = mapElement.getValue();
                System.out.println("Name :" +s.name);
                System.out.println("College :" +s.college);
                System.out.println("Place :" +s.place);
                System.out.println("Branch :" +s.branch);
                System.out.println("Semester :" +s.sem);
                break;
             }
             else{
                System.out.println("No student Available with that Roll no \n");
             }
            }
    }

        void deleteStudent()
        {

        }
    public static void main(String[] args) 
    {

        boolean v=true;
        while (v)
        {
            {
                System.out.println("\n Enter Your Choice \n 1.addStudent  \n 2.searchStudent  \n 3.deleteStudent \n 4.Exit \n");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                helperclass H1=new helperclass();
                switch(choice){
                    case 1: H1.addstudent();
                    break;
                    case 2: H1.SearchStudent();
                    break;
                    case 3: H1.deleteStudent();
                    break;
                    case 4: v=false;
                    break;
                    default: System.out.println("Invalid Input");
                }    
        }
    } 
}
}