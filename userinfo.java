
class userinfo 
{
  public  String username,place,company;
    private int userid;
    protected int age;
    private String position;
  
    void createuser(String username,int userid,String place,String company,int age,String position)
    {
        this.username =username;
        this.userid = userid;
        this.place = place;
        this.company = company;
        this.age = age ;
        this.position = position;
        System.out.println("user info generated");
        System.out.println("");
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
        userinfo obj1 = new userinfo();
        userinfo obj2 = new userinfo();
        obj1.createuser("snake",6758,"bangalore","dell", 23,"associate");  
        obj2.createuser("tortoise",6733,"mumbai","lenovo", 54, "manager");
        obj1.display();
        obj2.display();
    }
}