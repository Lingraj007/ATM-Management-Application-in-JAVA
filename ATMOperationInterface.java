package jp.atmmachineproject;

public interface  ATMOperationInterface {
    public void ViewBalance();
    public  void withdrawAmount(double withdrawAmount);
    public void depositeAmount(double depositAmount);
    public void ViewMiniStatement();
}
