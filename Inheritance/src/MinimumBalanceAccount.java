public class MinimumBalanceAccount extends BankAccount{
    private int minimum;

    public void setMinimum(int minimum){
        this.minimum = minimum;
    }

    public int getMinimum(){
        return minimum;
    }
/*
* MinimumBalanceAccount의 withdraw 메소드는 부모 클래스인 BankAccount의 withdraw 메소드와 조금 다릅니다. 출금 후 잔액이 minimum 이상이어야 하기 때문이죠.
* 지금과 같이 자식 클래스가 부모 클래스가 가지고 있는 메소드를 덮어 쓰고 싶을 때는 '메소드 오버라이딩(Method Overriding)'을 해줘야 합니다.
* 메소드 정의 위에 써져있는 @Override가 메소드 오버라이딩을 표시해줍니다.
* */

    @Override   //'어노테이션(Annotation)'  메소드 이름의 철자 실수나 파라미터 매칭의 어긋남 등을 확인, override되었다는 것을 명확히 보여줌으로써 코드 가독성을 높인다.
    public boolean withdraw(int amount){
        //if(getBalance() - amount < minimum){
        if(balance - amount < minimum){  //protected 덕분에 부모 클래스의 변수 바로 접근 가능
            System.out.println("적어도 " + minimum + "원은 남겨야 합니다.");
            return false;
        }

        //setBalance(getBalance()-amount);
        balance -= amount;
        return true;
    }
}
