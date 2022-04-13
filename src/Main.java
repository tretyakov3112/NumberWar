import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        Action action = new Action();
        int count = 20;
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            arr.add(arr.size(), random.nextInt(10));
        }
        System.out.println(arr);
        while (arr.size() != 1 || arr.get(1) != 0){
            String s = scanner.nextLine();
            arr = action.stringToArray(s);
            arr = action.action(arr);
            System.out.println(arr);

        }

    }
}
