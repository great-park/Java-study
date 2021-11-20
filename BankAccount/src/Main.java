public class Main {
    public static void main(String[] args) {
        // 생성자 - 인스턴스를 만든다. 인스턴스의 속성(변수)들을 초기화시켜준다.
        // 클래스에 아무런 생성자가 없을 경우에는 컴파일러가 자동으로 파라미터 없는 생성자를 제공
        // 단, 하나라도 만들면 X

        // 사람 1
        Person p1 = new Person("Kim",30000);
        // 은행 계좌 1
        BankAccount a1 = new BankAccount();
        a1.setBalance(100000);
        p1.setAccount(a1);
        a1.setOwner(p1);

        // 사람 2
        Person p2 = new Person("Lee",100000);
        // 은행 계좌 2
        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);
        p2.setAccount(a2);
        a2.setOwner(p2);

        // 계좌 이체 테스트
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
    }
}