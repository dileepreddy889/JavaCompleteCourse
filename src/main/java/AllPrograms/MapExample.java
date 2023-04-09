package AllPrograms;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> employees = new HashMap<>();
        employees.put(1,"Dileep");
        employees.put(2,"Harish");
        employees.put(3,"Ramesh");
        employees.put(4,"Ganesh");

        System.out.println(employees.keySet());
        for (int key:
             employees.keySet()) {
            System.out.println(key +" ->"+employees.get(key));

        }
    }
}
