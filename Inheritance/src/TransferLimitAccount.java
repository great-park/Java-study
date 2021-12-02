public class TransferLimitAccount extends BankAccount{
    private int transferLimit;

    @Override
    public boolean withdraw(int amount){
        if(amount > transferLimit){
            return false;
        }

        return super.withdraw(amount);
    }
}
//1. 기본 생성자는 클래스명과 같다.
//2. 파라미터가 있는 기본 생성자는 자동 생성되지 않는다.
//3. super는 항상 위에

/*
 * super 키워드
 * 1. 부모 클래스의 변수, 메소드를 사용할 때
 * 2. 부모 클래스의 생성자를 사용할 때
 * super()는 부모 클래스의 생성자를 호출 - 자식 클래스에서 부모 클래스의 변수, 메소드 사용
 * 하지만 super.a()와 같이 참조변수로 super 사용하면, 부모와 자식 클래스의 중복을 피하기 위함이라 맨 위에 적지 않아도 오류 x
 *
 * 규칙
 * 1. 자식 클래스의 인스턴스 생성시 부모클래스의 생성자는 반드시 불린다. - 인스턴스 생성시 생성자 호출은 필수
 * 2. 부모 클래스에 생성자가 없어도 기본 생성자가 제공,  자식 클래스에서 따로 적어주지 않으면 부모클래스의 기본 생성자가 불린다.
 * 3. 부모 클래스에 기본 생성자가 없는 경우, 자식 클래스에 생성자를 만들어 부모 클래스의 생성자를 호출 해야 한다.
 * 4. 부모 클래스의 생성자 호출은 맨 윗줄에 적어야 한다.
 *  */
