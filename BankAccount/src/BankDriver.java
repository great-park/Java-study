public class BankDriver {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "Kim";
        p1.age = 28;
        p1.cashAmount = 30000;

        BankAccount a1 = new BankAccount();
        a1.balance=100000;

        p1.account = a1;
        a1.owner = p1;


    }
}
