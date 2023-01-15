import java.util.*;

class helperclass {
    HashMap<Integer,Student> hashob = new HashMap<Integer,Student>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        helperclass H1=new helperclass(); 
        while (true)
        {
            {
                System.out.println("\n Enter Your Choice \n 1.addStudent  \n 2.searchStudent  \n 3.deleteStudent \n 4.Exit \n");
                int choice = H1.sc.nextInt(); //to avoid using scanner calss multiple times we created sc as global and to acces nonstatic member inside static method(main) we need to acces using object
                
                switch(choice)
                {
                    case 1: H1.addstudent();
                    break;
                    case 2: H1.SearchStudent();
                    break;
                    case 3: H1.deleteStudent();
                    break;
                    case 4: System.exit(1);
                    break;
                    default: System.out.println("Invalid Input");
                    H1.sc.close();
                }    
            }
        } 
    }

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

           Student S1=new Student(name,college,branch,place,rollno,sem); 
             if (hashob.containsKey(rollno)) 
             {
                System.out.println("Student Already present");
             } else {
                this.hashob.put(rollno, S1); 
                // this is used to refer to current object of addstudent method, if we dont use this , then it'll try to access global variable. 
             } 
           
        }
        void SearchStudent()
        {
            System.out.println("Enter Student Rollno to search");
            int rollno= sc.nextInt();
            for (java.util.Map.Entry<Integer,Student> IT : hashob.entrySet()) 
            { 
                if(IT.getKey() == rollno) {
                Student s = IT.getValue();
                System.out.println("Name :" +s.name);
                System.out.println("College :" +s.college);
                System.out.println("Place :" +s.place);
                System.out.println("Branch :" +s.branch);
                System.out.println("Semester :" +s.sem);
             }
             else{
                System.out.println("No student Available with that Roll no \n");
             }
            }
    }

        void deleteStudent()
        {
            System.out.println("enter student roll no. to delete");
            int rollno= sc.nextInt();
            hashob.remove(rollno);
            System.out.println("Student details deleted succesfully");
        }
}