public class Prime {
    public static void main(String[] args) {
        int number = 29; // You can change this number to check for other values
        boolean isPrime = true;
        
        // Check if the number is less than 2, it's not prime
        if (number <= 1) {
            isPrime = false;
        }
        
        // Loop through numbers from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {  // If number is divisible by any number, it's not prime
                isPrime = false;
                break;
            }
        }
        
        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
