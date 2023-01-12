import java.util.ArrayList;
import java.util.Iterator;

public class arraylistdemo
{
    String name,gender;
    int age;
    public arraylistdemo(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
    

public static void main(String[] args) {
    arraylistdemo ob1 = new arraylistdemo("mayur", "male", 24);
    arraylistdemo ob2 = new arraylistdemo("pranay", "male", 25);
    arraylistdemo ob3= new arraylistdemo("sakshi", "female", 21);

    ArrayList<arraylistdemo> list = new ArrayList<>();
    list.add(ob1);
    list.add(ob2);
    list.add(ob3);
    System.out.println(list.size());

    for (arraylistdemo fe : list) 
    {
       fe.display();
    } 


    Iterator it =  list.iterator();
    while (it.hasNext()) {
        arraylistdemo ih =  (arraylistdemo) it.next();
        ih.display();
    }

}
    
}