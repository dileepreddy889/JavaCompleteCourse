package AllPrograms;

public class InterfaceExamplImpl implements InterfaceExample{
    @Override
    public void show() {
        System.out.println("Hello"+ area);
    }

    @Override
    public void config() {
        System.out.println("This is Config");

    }

    public static void main(String[] args) {
        InterfaceExamplImpl il= new InterfaceExamplImpl();
        il.show();
        il.config();
    }
}
