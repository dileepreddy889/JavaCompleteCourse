package AllPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    public static void main(String[] args) throws IOException {
        int a=0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            System.out.println("Enter a number");
            a= Integer.parseInt(br.readLine());
            System.out.println(a);
        }

    }

}
