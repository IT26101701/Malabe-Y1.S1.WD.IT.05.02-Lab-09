public class IT26101701Lab9Q3 {

	// User Defined Method
	
    // Adds two integers and returns the result
    public static int add(int x, int y) {
        return x + y;
    }

    // Multiplies two integers and returns the result
    public static int multiply(int x, int y) {
        return x * y;
    }

    // Multiplies a number by itself and returns the result
    public static int square(int x) {
        return x * x;
    }


	// Main Method 
	
    public static void main(String[] args) {
		
        // i. (3 * 4 + 5 * 7)^2
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));

        // ii. (4 + 7)^2 + (8 + 3)^2
        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)^2\t: " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2\t: " + result2);
    }
}