
class userinfo_constructor 
{
  public  String username,place,company;
    private int userid;
    protected int age;
    private String position;
  
   
    public userinfo_constructor(String username, String place, String company, int userid, int age, String position) {
        this.username = username;
        this.place = place;
        this.company = company;
        this.userid = userid;
        this.age = age;
        this.position = position;
    }

    void display()
        {
            System.out.println("username: " +username);
            System.out.println("userid: " +userid);
            System.out.println("place: " +place);
            System.out.println("company: " +company);
            System.out.println("age: " +age);
            System.out.println("position: " +position);
            System.out.println("");
        }
   
    public static void main(String[] args) 
    {
        userinfo_constructor obj1 = new userinfo_constructor("snake","banglore","dell",6758, 23,"associate");
        userinfo_constructor obj2 = new userinfo_constructor("tortoise","chennai","lenovo",4589, 45,"manager");
        obj1.display();
        obj2.display();
    }
}