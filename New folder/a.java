import java.util.ArrayList;
import java.util.List;

public class a {
    public static void main(String[] args) {
        // Create a list of 10 integers
        List<Integer> numbers = new ArrayList<>();
        

        // Calculate the sum of all even numbers
        int evenSum = 0,i=0;
        while(i<10) {
            numbers.add(i);
            if (i % 2 == 0) {
                evenSum += i;
            }
            i++;
        }

        // Display the total of all even numbers
        System.out.println("The total of all even numbers is: " + evenSum);
    }
}
