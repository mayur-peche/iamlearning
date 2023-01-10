class Bank {
   String name;
    int ID;
    int Phone;
    private long TotalFund ;
    private float Interest ;
    
    public Bank(long TotalFund, float Interest) {
       this.TotalFund = TotalFund;
       this.Interest = Interest;   
   }

   float checkLoan(int amount)
    {  
       if(amount<TotalFund)
          {
             return Interest;
          }
       else
         return -1;
    }
}
