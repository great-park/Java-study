import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Name> arrayList = new ArrayList<Name>();
        arrayList.add(new Name("Park"));
        arrayList.add(new Name("Kim"));
        arrayList.add(new Name("Lee"));
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.get(2));

        //HashMap
        //Key -> Value

        HashMap<String, Name> namebox = new HashMap<>();
        namebox.put("Park", new Name("Park"));
        namebox.put("Lee", new Name("Lee"));
        namebox.put("Kim", new Name("Kim"));

        namebox.remove("Park");
        Name name003 = namebox.get("Kim");

        //ketSet() 메소드 -> key들이 담긴 리스트 반환

        for (String key : namebox.keySet()) {
            System.out.println(namebox.get(key));
        }
    }
}