import java.util.Scanner;
public class BankBranch extends Bank
{  
    String name;
    int ID;
    long Phone;
     float loanAmount;
     private float branchInterest;
    public BankBranch(long bankTotalFund, float bankInterest, String name, int iD, long phone, float loanAmount, int branchInterest) 
    {
        super(bankTotalFund, bankInterest);
        this.name = name;
        ID = iD;
        Phone = phone;
        this.loanAmount = loanAmount;
        this.branchInterest = branchInterest;
    }
    void Loan()
     {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Amount Of Loan to be approved ");
         int amount= sc.nextInt(); 
        float b= checkLoan(amount);
        if(b == -1)
        {   
            System.out.println("Not approved");    

        }
        else
        {
            System.out.println("Loan approved");
            System.out.println("........................."); 
            System.out.println(name);
            System.out.println("intrest "+(b+branchInterest));
        }
     }    
 public static  void main(String[]args)
 {  
    BankBranch B1= new BankBranch(1000000 , 12, "Axis", 4586, 9654654525, 10000, 6);
    B1.Loan();
 }
}
    
