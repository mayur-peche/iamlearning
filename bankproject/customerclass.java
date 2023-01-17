package bankproject;

public class customerclass extends Bankclass implements Customerinterface
{

    public Accounts account;
    int CustomerID=0;
    String Customername="";
    String CustomerEmail="";
    String Customerpassword="";
    String customerAddress="";
    long CustomerPh=2;
    long CustomercardNo=3;

    @Override
    public void addcustomer() 
    {  
        Scanner sc= new Scanner(System.in);
        System.out.println("Eneter Customer ID");
        this.CustomerID=sc.nextInt();
        System.out.println("Eneter Customer Name");  
        this.Customername = sc.next();
        System.out.println("Eneter Customer Email");  
        this.CustomerEmail=sc.next();
        System.out.println("Eneter Customer Password");  
        this.Customerpassword=sc.next();
    }

    @Override
    public void deletecustomer() 
    {
      
    }

    @Override
    public void editcustomer() {
        // TODO Auto-generated method stub
        
    }
    
}
