class Student
{
    public String name,college,branch,place;
    public int rollno,sem;
    public Student(String name, String college, String branch, String place, int rollno, int sem)
    {
        this.name = name;
        this.college = college;
        this.branch = branch;
        this.place = place;
        this.rollno = rollno;
        this.sem = sem;   
    }
         public void display()
        {
            System.out.println("Student name:" + this.name);
            System.out.println("Student college:" + this.college);
            System.out.println("Student branch:" + this.branch);
            System.out.println("Student place:" + this.place);
            System.out.println("Student rollno:" + this.rollno);
            System.out.println("Student sem:" + this.sem);
        }
}