import java.util.Scanner;
class college 
{
    String clgname,clgid,clgplace;
    int choice;
    public void entercollegedetail()
    {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter College details.");

               System.out.println("Enter College Name");
               this.clgname = sc.nextLine();

               System.out.println("Enter College ID");
               this.clgid = sc.nextLine();

               System.out.println("Enter College Place");
               this.clgplace = sc.nextLine();

               System.out.println("College details recorded succesfully.");
               sc.close();
    }

    public void showcollegedetail()
   {
    entercollegedetail();
     System.out.println("College Name:"+ clgname);
     System.out.println("College ID:"+ clgid);
     System.out.println("College Place:"+ clgplace);
   }
}

class branch extends college
{
    public String brname,brid,brstaff;
    public void enterbranchdetail()
    {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Branch details.");   

          System.out.println("Enter Branch Name:");
          this.brname = sc.nextLine();

          System.out.println("Enter Branch ID");
          this.brid = sc.nextLine();

          System.out.println("Enter total no. of Staff in the Branch:");
          this.brstaff = sc.nextLine();

          System.out.println("Branch details recorded succesfully.");
          sc.close();
    }

    public void showbranchdetail()
   { 
    enterbranchdetail();
     System.out.println("Branch Name:"+ brname);
     System.out.println("Branch ID:"+ brid);
     System.out.println("Total no. of Staff in the Branch:"+ brstaff);
   }
}

class student extends branch
{
    private String stdname,stdplace,stid;
    public void enterStudentdetail()
    {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Student Name:");
     this.stdname = sc.nextLine();

     System.out.println("Enter Student ID:");
     this.stid = sc.nextLine();

     System.out.println("Enter Student Location:");
     this.stdplace = sc.nextLine();

     System.out.println("Student details recorded succesfully.");
     sc.close();    
    }

    public void showStudentdetail()
   {
     enterStudentdetail();
     System.out.println("Student Name: "+ stdname);
     System.out.println("Student ID: "+ stid);
     System.out.println("Student location: "+ stdplace);
   }
public static void main(String[] args)
{   
    Scanner sc = new Scanner(System.in);
    student foo = new student();
    System.out.println("enter your choice:");   
    System.out.println("1. Show Student details:");
    System.out.println("2. Show College details");
    System.out.println("3. Show Branch details");
     int choice =sc.nextInt();
     if (choice==1) 
     {
      foo.showStudentdetail();
     } 
     else if (choice==2) 
     {
      foo.showcollegedetail();
     }
     else if (choice==3) {
      foo.showbranchdetail();
     }  
     sc.close();
}

}