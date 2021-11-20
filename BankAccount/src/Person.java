public class Person {
    //접근 제어자 private-해당 class에서만, public-모든 class에 공개
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public void setAge(int newAge){
        if(newAge>=0){
            age = newAge;
        }
    }
    public int getAge(){
        return age;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void setCashAmount(int newCashAmount){
        cashAmount = newCashAmount;
    }
    public int getCashAmount(){
        return cashAmount;
    }
    public BankAccount getAccount(){
        return account;
    }
    public void setAccount(BankAccount pAccount){
        account = pAccount;
    }

    //1.
    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(),amount);
    }
    //2.
    //public boolean transfer(Person to, int amount) {
    //  return account.transfer(to, amount);
    //}

//전자는 BankAccount 클래스에 있는 transfer(BankAccount to, int amount) 2번 메소드를 호출하여 정의한 것이고,
//후자는 BankAccount 클래스에 있는 transfer(Person to, int amount) 1번 메소드를 호출하여 정의한 것


    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to,amount);
    }
}