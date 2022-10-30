
package bank;
public class Bank {
    public float amount() {
        return 0;
    }
}

class SavingAccount extends Bank {
    float interestRate;
    float years;
    float amount;

    public SavingAccount(float i, float y, float r) {
        interestRate = i;
        years = y;
        amount = r;
    }

    public float totalamount() {
        float FixedDeposit = interestRate * years * amount;
        return FixedDeposit;
    }
}
class CurrentAccount extends Bank{
    float cash;
    float credit;
    public CurrentAccount(float c, float cr) {
        cash=c;
        credit= cr;
    }
    public float amount() {
        float cashcredit=cash+credit;
        return cashcredit;
    }
}
class Main extends Bank{
    public static void main(String[] args) {
        SavingAccount s= new SavingAccount(2f,2f,3000f);
        float savings =s.amount();
        CurrentAccount ca = new CurrentAccount(2500f,1200f);
        float current= ca.amount();
        float total= savings + current;
        System.out.println("Total amount available in bank is:"+total);
    }
}