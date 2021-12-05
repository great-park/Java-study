public class Main {
    public static void main(String[] args){
        Person person = new Person("찬호", "박");

        //Person 클래스에 아무런 메소드를 작성하지 않아도 여러 메소드들 사용가능. how?   -> object 클래스의 메소드들
        //Objet 클래스 : 최상위 클래스, 모든 클래스의 부모 클래스.
        //즉, Person 클래스는 Object 클래스를 상속받음

        System.out.println(person.toString());
        //Person@1b6d3586 - 오버라이딩 전
        //찬호 박 - 오버라이딩 후

        System.out.println(person);
        //println 내부적으로 toString 사용
    }
}
