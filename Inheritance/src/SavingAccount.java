// BankAccount class를 상속받는다!
public class SavingAccount extends BankAccount{
    private double interest;

    public void setInterest(double interest){
        this.interest = interest;
    }

    public double getInterest(){
        return interest;
    }
/*
* balance는 부모 클래스인 BankAccount의 private 변수이기 때문에 자식 클래스인 SavingsAccount 클래스에서는 사용할 수 없다.
* 따라서 public 메소드인 setBalance와 getBalance를 통해 balance 변수에 접근을 하는 것.
* private 변수도 자식에게 상속되는 것은 맞으나, 변수나 메소드에 접근할 수 있는 권한이 private로 막혀있기 때문에 접근 불가한 것.
* */
    public void addInterest(){
        setBalance( (int) (getBalance() * (1+interest)) );
    }
}
