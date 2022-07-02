import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TaskTwo {
    public static void main(String[] args) {
        System.out.println("Enter max number: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int counter = 0;
        int maxNumber = Integer.parseInt( input );
        List<Integer> list = new ArrayList<>();
        for (int num = 2; num <= maxNumber; num++) {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++) {
                if ( num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if ( isPrime == true )
                list.add(num);
        }
        int n = 1;
        for (int i = 0; i < list.size(); i++) {
            n = n *  list.get(i);
            String value = String.valueOf(n);
            if (value.endsWith("0")) {
                counter = counter+1;
            }
        }

        System.out.println(counter);
    }


}
