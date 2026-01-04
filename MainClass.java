package jp.atmmachineproject;

import java.util.Scanner;

public class MainClass 
{
    public static void main(String[] args) {
        ATMOperationInterface op=new ATMOperationImpl();
        int atmnumber=12345;
        int atmpin=123;

        Scanner in=new Scanner(System.in);
        System.out.println("Welcome To ATM Machine");
        System.out.println("Enter Atm Number");
        int atmNumber=in.nextInt();
        System.out.println("Enter pin:");
        int pin=in.nextInt();

        if((atmnumber==atmNumber)&&(atmpin==pin)){
            //System.out.println("Validation Done");
            while(true){
                // System.out.println("1.View Available Balance, /2.Withdrowl Amount, /3.Deposit Amount, /4.View the Mini Statement , /5.Exit from the Application");
                System.out.println("""
                    1.View Available Balance
                    2.Withdrowl Amount
                    3.Deposit Amount
                    4.View the Mini Statement
                    5.Exit from the Application""");
                System.out.println("Enter the Choice");
                int ch=in.nextInt();

                if(ch==1){
                    op.ViewBalance();

                }
                else if(ch==2){
                    System.out.println("Enter Amount to Withdraw");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositeAmount=in.nextDouble();//50000
                    op.depositeAmount(depositeAmount);
                }
                else if(ch==4){
                    op.ViewMiniStatement();

                }
                else if(ch==5){
                    System.out.println("Collect your ATM Card \n Thank You Using ATM Machine");
                    System.out.println(0);
                }
                else{
                    System.out.println("Please Enter Correct Choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Number or pin");
            System.exit(0);
        }
    }
}
