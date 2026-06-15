        import java.util.Scanner;  // Importing Scanner class for user input

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // Create Scanner object to take input
        char choice;  // Variable to store user’s choice (Y/N)

        do {
            // Step 1: Declare an array for 5 subject marks
            int[] marks = new int[5];
            int total = 0;

            // Step 2: Input marks for 5 subjects
            System.out.println("Enter marks for 5 subjects:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = input.nextInt();  // Read mark for subject i
                total += marks[i];           // Add mark to total
            }

            // Step 3: Calculate average
            double average = total / 5.0;  // Use 5.0 to ensure result is decimal

            // Step 4: Determine grade using if-else statements
            char grade;
            if (average >= 80) {
                grade = 'A';
            } else if (average >= 70) {
                grade = 'B';
            } else if (average >= 60) {
                grade = 'C';
            } else if (average >= 50) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Step 5: Display results
            System.out.println("\n--- Result ---");
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
            System.out.println("Grade Obtained: " + grade);

            // Step 6: Ask user if they want to repeat
            System.out.print("\nDo you want to calculate again? (Y/N): ");
            choice = input.next().charAt(0);  // Read first character of user input

        } while (choice == 'Y' || choice == 'y');  // Repeat loop if user enters Y/y

        input.close();  // Close the Scanner object
    }
}

Output:
 


Explanation of Each Part
1. import java.util.Scanner;
•	This imports the Scanner class from Java’s java.util library.
•	The Scanner is used to take user input from the keyboard.
•	Library: java.util = Java Utility Package → contains classes like Scanner, ArrayList, etc.
________________________________________
2. public class StudentGradeCalculator
•	Defines a public class (name of the program file must match this name).
•	Every Java program must have at least one class, and the main code is usually inside it.
________________________________________
3. public static void main(String[] args)
•	Entry point of every Java program.
•	public → can be accessed by JVM.
•	static → JVM can run this without creating an object.
•	void → doesn’t return anything.
•	String[] args → stores command-line arguments (if any).
________________________________________
4. Scanner input = new Scanner(System.in);
•	Creates a Scanner object named input to read data from System.in (keyboard input).
•	Example: input.nextInt() reads an integer.
________________________________________
5. char choice;
•	Declares a character variable to store whether the user wants to repeat (Y/N).
________________________________________
6. do { ... } while (condition);
•	A do-while loop executes at least once before checking the condition.
•	In this program, it ensures the grade is calculated at least once and then asks if the user wants to repeat.
________________________________________
7. int[] marks = new int[5];
•	Creates an array of 5 integers to store marks of 5 subjects.
________________________________________
8. for (int i = 0; i < 5; i++) { ... }
•	A for loop runs 5 times to take marks for each subject.
•	marks[i] = input.nextInt(); → takes input for each subject.
•	total += marks[i]; → adds each subject’s mark to the total.
________________________________________
9. double average = total / 5.0;
•	Calculates the average marks.
•	We use 5.0 (decimal) instead of 5 to ensure floating-point division (gives decimal result).
________________________________________
10. Grade Calculation (if-else statements)
if (average >= 80)
    grade = 'A';
else if (average >= 70)
    grade = 'B';
...
else
    grade = 'F';
•	Compares the average marks with defined conditions.
•	Assigns a grade based on the range.
________________________________________
11. Display Results
System.out.println("Total Marks: " + total);
System.out.println("Average Marks: " + average);
System.out.println("Grade Obtained: " + grade);
•	Prints the calculated total, average, and grade on the screen.
________________________________________
12. Ask to Repeat
System.out.print("Do you want to calculate again? (Y/N): ");
choice = input.next().charAt(0);
•	Takes one character input from the user.
•	input.next() reads a string, .charAt(0) extracts the first character (Y or N).
________________________________________
13. while (choice == 'Y' || choice == 'y');
•	The loop will repeat if the user enters Y or y.
________________________________________
14. input.close();
•	Closes the Scanner object to prevent memory leaks.
________________________________________
🧾 Sample Output:
Enter marks for 5 subjects:
Subject 1: 85
Subject 2: 72
Subject 3: 90
Subject 4: 67
Subject 5: 58

--- Result ---
Total Marks: 372
Average Marks: 74.4
Grade Obtained: B

Do you want to calculate again? (Y/N): Y
Enter marks for 5 subjects:
...
________________________________________
📚 Basic Libraries Used:
Library	Purpose	Example Use
java.util	Contains utility classes like Scanner, Arrays, etc.	import java.util.Scanner;
System.in	Standard input stream (keyboard).	Used by Scanner
System.out	Standard output stream (console).	System.out.println()

