public class BankAccount {

    private int balance;
    private Person owner;

    public int getBalance(){
        return balance;
    }

    public void setBalance(int pBalance){
        balance = pBalance;
    }

    public Person getOwner(){
        return owner;
    }

    public void setOwner(Person pOwner){
        owner=pOwner;
    }

    public boolean deposit(int amount) {
        if (amount < 0 || owner.getCashAmount() < amount) {
            System.out.println("입금 실패입니다. 잔고: " +
                    balance + "원, " + "현금: " + owner.getCashAmount() +"원");
            return false;
        } else {
            owner.setCashAmount(owner.getCashAmount() - amount);
            balance += amount;
            System.out.println(amount + "원 입금하였습니다. "
                    + "잔고: " + balance + "원, " + "현금: " + owner.getCashAmount() + "원");
            return true;
        }
    }

    //메소드 오버로딩 - 한 클래스 내에 같은 이름의 메소드 만들기
    //파라미터의 구성이 달라서 자바가 이를 구분하므로 메소드 오버로딩이 가능
    public boolean deposit(double amount, double exchangeRate){
        return deposit((int)(amount * exchangeRate));
    }


    public boolean withdraw(int amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, "
                    + "현금: " + owner.getCashAmount() + "원");
            System.out.println("false");
            return false;
        } else {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: "
                    + balance + "원, " + "현금: " + owner.getCashAmount() + "원");
            System.out.println("true");
            return true;
        }
    }

}