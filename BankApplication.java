public class BankApplication
{
    double balance;
    public BankApplication()
    {
        balance = 0;
    }
    public BankApplication(double initialbalance)
    {
        balance=initialbalance;
    }
    public void deposit(double amount)
    {
        balance=balance+amount;
    }
    public void withdraw(double amount) throws IllegalAccessException
    {
        if(amount<0)
        {
            throw new IllegalAccessException("Amount is under zero");
        }
        balance=balance-amount;
    }
}
