import java.util.*;
import java.lang.*;
class RBI{
    protected  int minBal=100,maxWithdrawLimit=5*100000;
    protected  float minInterest=4;
    
}
class PNB extends RBI{
    
    PNB(int minBal,int maxWithdrawLimit,float minInterest){
            this.minBal = Math.max(minBal,super.minBal);
            this.maxWithdrawLimit = Math.min(maxWithdrawLimit,super.maxWithdrawLimit);
            this.minInterest = Math.max(minInterest,super.minInterest);
    }
    PNB(){}
    public void showPlans(){
        System.out.println("Min Balance:"+ minBal+", Max Withdrawl Limit:"+ maxWithdrawLimit+ ", Min Interest Rate:"+minInterest+"%");
    }
}
class ICICI extends RBI{
    
    ICICI(int minBal,int maxWithdrawLimit,float minInterest){
            this.minBal = Math.max(minBal,super.minBal);
            this.maxWithdrawLimit = Math.min(maxWithdrawLimit,super.maxWithdrawLimit);
            this.minInterest = Math.max(minInterest,super.minInterest);
    }
    ICICI(){}
    public void showPlans(){
        System.out.println("Min Balance:"+ minBal+", Max Withdrawl Limit:"+ maxWithdrawLimit+ ", Min Interest Rate:"+minInterest+"%");
    }
}

class SBI extends RBI{
    
    SBI(int minBal,int maxWithdrawLimit,float minInterest){
            this.minBal = Math.max(minBal,super.minBal);
            this.maxWithdrawLimit = Math.min(maxWithdrawLimit,super.maxWithdrawLimit);
            this.minInterest = Math.max(minInterest,super.minInterest);
    }
    SBI(){}
    public void showPlans(){
        System.out.println("Min Balance:"+ minBal+", Max Withdrawl Limit:"+ maxWithdrawLimit+ ", Min Interest Rate:"+minInterest+"%");
    }
}
class Main{
    public static void main(String [] args){
        SBI stateBank = new SBI();//defaults
        ICICI bankForCreditCard = new ICICI(1000, 4*10000, 5);//extra benefits
        PNB punjab = new PNB(200,6*100000,2);//partially following
        System.out.println("For SBI");
        stateBank.showPlans();
        System.out.println("For ICICI");
        bankForCreditCard.showPlans();
        System.out.println("For PNB");
        punjab.showPlans();
    }
}