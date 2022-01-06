public class Person {
    //접근 제어자 private-해당 class에서만, public-모든 class에 공개
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    //this 키워드 사용 - 메소드를 호출한 인스턴스를 가리킴
    //생성자
    public Person(String name, int cashAmount){
        this.name = name;
        this.cashAmount = cashAmount;
    }

    public Person(String name){
        this.name = name;
        cashAmount = 0;
    }

    public void setAge(int age){
        if(age>=0){
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setCashAmount(int cashAmount){
        this.cashAmount = cashAmount;
    }
    public int getCashAmount(){
        return cashAmount;
    }
    public BankAccount getAccount(){
        return account;
    }
    public void setAccount(BankAccount account){
        this.account = account;
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