public class Name {
    String name;

    public Name(String name){
        this.name = name;
    }
    // System.out.println(오브젝트)를 할 경우
    // 자동으로 toString()함수가 사용되어 오브젝트가
    // 문자열 형태로 출력
    public String toString(){
        return name;
    }
}
