package AllPrograms;

public class NullException extends Throwable {

    private int simpleNullCheck(String str){
        return (str.length());
    }

    public static void main(String[] args) {
         String input = null;
         NullException nullException= new NullException();
         try {
             nullException.simpleNullCheck(input);
         }catch (NullPointerException e){
             System.out.println("Null pointer Exception Thrown");
         }


    }

}
