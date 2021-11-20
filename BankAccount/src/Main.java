public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Kim";
        p1.setAge(28);
        p1.cashAmount = 30000;

        System.out.println(p1.getAge());

        BankAccount a1 = new BankAccount();
        a1.balance = 100000;
        p1.account = a1;
        a1.owner = p1;
        
        Person p2 = new Person();
        p2.name = "Lee";
        p2.setAge(25);
        p2.cashAmount = 100000;

        System.out.println(p2.getAge());

        BankAccount a2 = new BankAccount();
        p2.account = a2;
        a2.owner = p2;
        a2.balance = 500000;



        a2.deposit(30000);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);

    }
}