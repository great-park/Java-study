import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        //arraylist 생성
        ArrayList<String > nameList = new ArrayList<>();

        //추가
        nameList.add("Park");
        nameList.add("Kim");
        nameList.add("Lee");
        nameList.add("Jung");
        nameList.add("Choi");

        //삭제
        nameList.remove(3);
        System.out.println(nameList);
        //크기
        System.out.println(nameList.size());
        //요소
        System.out.println(nameList.get(0));
        //요소 유무
        System.out.println(nameList.contains("Park"));



    }
}
