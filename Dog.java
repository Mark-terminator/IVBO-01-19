public class Dog {
    private int age;
    private String name;
    public Dog(int a, String n) {
        age = a;
        name = n;
    }
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public int inHumanYears(){
        return age * 7;
    }
    public void to_String(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
