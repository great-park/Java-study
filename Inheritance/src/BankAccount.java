public class BankAccount {
    //protected는 private과 유사하지만 자식 클래스에선 접근 가능하도록 합니다.
    //상속의 유연함과 private의 보호성을 동시에 만족시켜주는 키워드!
    protected int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 출금
    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }

        return false;
    }

    // 입금
    public boolean deposit(int amount) {
        balance += amount;
        return true;
    }
}

