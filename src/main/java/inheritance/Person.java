package inheritance;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private int age;
    private String gender;

//    default constructor
//    public Person(){
//        System.out.println("In Person default constructor");
//    }

    public Person(String name){
        System.out.println("In Person 2nd constructor");
    }
}
