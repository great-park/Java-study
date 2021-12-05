public class Person {
    public final String fristName;
    public final String lastName;

    public Person(String fristName, String lastName){
        this.fristName = fristName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return fristName + " " + lastName;
    }
}
