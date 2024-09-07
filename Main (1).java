import java.util.*;

public class Main {
    
    
    public static boolean isValidInput(String input) {
        return input.matches("^[0-9 ]+$");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sequence of numbers separated by spaces:");
        String input = scanner.nextLine();
        
        
        if (!isValidInput(input)) {
            System.out.println("Invalid input. Please enter only numbers separated by spaces.");
            return;  
        }
        
        
        String[] inputArray = input.split(" ");
        List<Integer> numbers = new ArrayList<>();
        
        for (String s : inputArray) {
            numbers.add(Integer.parseInt(s));
        }
        
        
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        
        
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!numbers.contains(i)) {
                missingNumbers.add(i);
            }
        }
        
    
        if (missingNumbers.isEmpty()) {
            System.out.println("No numbers are missing. The sequence is perfect.");
        } else {
            System.out.println("Missing numbers: " + missingNumbers);
        }
        
        scanner.close();
    }
}