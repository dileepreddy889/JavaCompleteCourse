package AllPrograms;

public class EnhancedFor {
    public static void main(String[] args) {
        int num[] = new int[5];
        num [0] =2;
        num [1] =25;
        num [2] =21;
        num [3] =212;
        num [4] =22;

        for (int i =0 ;i<num.length;i++){
            System.out.println(num[i]);
        }

        System.out.println("----------");

        for (int n:
             num) {
            System.out.println(n);
        }
    }

}
