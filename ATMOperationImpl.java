package jp.atmmachineproject;

import java.util.HashMap;
import java.util.Map;

public class ATMOperationImpl implements ATMOperationInterface 
{
    ATM atm=new ATM();
    Map<Double,String> ministmt=new HashMap<>();

    @Override
    public void ViewBalance() {
        // TODO Auto-generated method stub

        System.out.println("Available Balance is :"+atm.getBalance());
        
    }

    @Override
    public void ViewMiniStatement() {
        // TODO Auto-generated method stub

        for(Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
        
    }

    @Override
    public void depositeAmount(double depositeAmount) {
        // TODO Auto-generated method stub

        ministmt.put(depositeAmount, "Amount Deposited");
            System.out.println(depositeAmount+"Deposited Sucessfully !!");
                atm.setBalance(atm.getBalance()+depositeAmount);
                    ViewBalance();
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        // TODO Auto-generated method stub

         if(withdrawAmount%500==0){
            if(withdrawAmount<=atm.getBalance()){
             ministmt.put(withdrawAmount, "Amount withdrawn");
                System.out.println("Collect the cash"+withdrawAmount);
                    atm.setBalance(atm.getBalance()-withdrawAmount);
                     ViewBalance();                                           
             }
              else{
                    System.out.println("Insufficient Balance !!");
            }
        }
        else{
            System.out.println("Please Enter the Amount in Multiple of 500");
        }
        
    }

}
