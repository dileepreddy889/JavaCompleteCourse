package AllPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(30);
        nums.add(2);
        nums.add(34);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

    }
}
