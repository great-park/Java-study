public class Main {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("Kim");
        p1.setCashAmount(30000);

        BankAccount a1 = new BankAccount();
        a1.setBalance(10000);

        p1.setAccount(a1);
        a1.setOwner(p1);

        Person p2 = new Person();
        p2.setName("Lee");
        p2.setCashAmount(100000);

        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);

        p2.setAccount(a2);
        a2.setOwner(p2);

        a2.deposit(30000);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);
    }
}