package Practice_2_1;

public class TestAuthor {
    public static void main(String[] args){
        Author ob1 = new Author("Ivan Ivanov", "ivan_tyshkanchik@gmail.com", 'M');
        System.out.println(ob1.getName());
        System.out.println(ob1.getEmail());
        System.out.println(ob1.getGender());
        System.out.println(ob1.toString());
        ob1.setEmail("ivan_ivan@gmail.com");
        System.out.println(ob1.getEmail());
        System.out.println(ob1.toString());
    }
}
