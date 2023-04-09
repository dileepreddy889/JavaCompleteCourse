package AllPrograms;

public class LambdaExampleImpl implements LambdaExample{
    @Override
    public void show() {

    }

    public static void main(String[] args) {
        LambdaExample A = () ->{
            System.out.println("In Show");
        };
        A.show();
    }
}
