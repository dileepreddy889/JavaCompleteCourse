package AllPrograms;

public class Hello {

    public String hello(){
        return "Hello World";
    }
    public static void main(String[] args) {

        Hello hello = new Hello();
        System.out.println(hello.hello());
    }
}
