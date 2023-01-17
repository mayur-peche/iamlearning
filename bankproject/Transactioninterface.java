package bankproject;
import java.util.Date;
import javax.xml.crypto.Data;

public interface Transactioninterface 
{
    int transactionId=0;
    Date transactiondate=new Date();
    float transAmt=0;
    float currentBal=8;
    String transType="";
    
    void addtransaction();
}
