import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Final_Output{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        switch(number){
            case 1:
                printPersonalInfo();
                break;
            case 2:
                rectangleAreaPerimeter();
                break;  
            case 3:
                computeSalary();
                break;  
            case 4:
                maxOfThree();
                break;
            case 5:
                distanceBetweenPoints();
                break;  
            case 6:
                breakIntoNotes();
                break;
            case 7:
                convertSeconds();
                break;  
            case 8:
                monthFromNumber();
                break;
            case 9:
                countPosNeg();
                break;
            case 10:
                passwordChecker();
                break;
            case 11:
                findQuadrant();
                break;  
            case 12:
                divideNumbers();
                break;
            case 13:
                printNumbersInLines();
                break; 
            case 14:
                averageMarks();
                break;
            case 15:
                smallestInArray();
                break;
            case 16:
                cmToInches();
                break;
            case 17:
                reverseNumber();
                break;
            case 18:
                absoluteValue();
                break;
            case 19:
                checkMultiple();
                break;
            case 20:
                printWordsSeparately();
                break;
            case 21:
                convertCurrency();
                break;
            case 22:
                thirdAngleOfTriangle();
                break;
            case 23:
                checkVowelOrConsonant();
                break;
            case 24:
                digitToWord();
                break;  
            case 25:
                guessNumber();
                break;
            case 26:
                usernameValidator();
                break;
            case 27:
                factorialCalculator();
                break;  
            case 28:
                multiplicationTable();  
                break;
            case 29:
                fizzBuzz();
                break;
            case 30:
                findLongestWord();  
                break;
            case 31:
                findMaxMin();
                break;
            case 32:
                separateOddEven();
                break;
            case 33:
                sortAscending();
                break;
            case 34:
                sortDescending();
                break;
            case 35:
                secondLargest();
                break;
            case 36:
                checkEvenOdd();
                break;
            case 37:
                decimalToBinary();
                break;
            case 38:
                checkLeapYear();
                break;
            case 39:
                areaOfCircle();
                break;
            case 40:
                areaOfSquare();
                break;
            default:
                System.out.println("Invalid number. Please enter a number between 1 and 10.");
        }
        input.close();
    }

    public static void printPersonalInfo() {
        System.out.println("Name   : JERREH ROMER SALERA");
        System.out.println("semester    : 1st Semester");
        System.out.println("School year : 2025-2026");
        System.out.println("degree program: Bachelor of Science in Information Technology");
    }

    // 2. Compute perimeter and area of rectangle
    public static void rectangleAreaPerimeter() {
        int height = 7;
        int width = 5;
        int perimeter = 2 * (height + width);
        int area = height * width;

        System.out.println("Perimeter of the rectangle = " + perimeter + " inches");
        System.out.println("Area of the rectangle = " + area + " square inches");
    }

    // 3. Compute employee salary
    public static void computeSalary() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the Employees ID(Max. 10 chars): ");
        String empID = input.nextLine();
        System.out.print("Input the working hrs: ");
        int hours = input.nextInt();
        System.out.print("Salary amount/hr: ");
        double rate = input.nextDouble();

        double salary = hours * rate;

        System.out.println("Employees ID = " + empID);
        System.out.printf("Salary = U$ %.2f%n", salary);

        input.close();
    }

    // 4. Find maximum of three integers
    public static void maxOfThree() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first integer: ");
        int a = input.nextInt();
        System.out.print("Input the second integer: ");
        int b = input.nextInt();
        System.out.print("Input the third integer: ");
        int c = input.nextInt();

        int max = Math.max(a, Math.max(b, c));
        System.out.println("Maximum value of three integers: " + max);

        input.close();
    }

    // 5. Distance between two points
    public static void distanceBetweenPoints() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input x1: ");
        double x1 = input.nextDouble();
        System.out.print("Input y1: ");
        double y1 = input.nextDouble();
        System.out.print("Input x2: ");
        double x2 = input.nextDouble();
        System.out.print("Input y2: ");
        double y2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Distance between the said points: %.4f%n", distance);

        input.close();
    }

    // 6. Break amount into smallest bank notes
    public static void breakIntoNotes() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the amount: ");
        int amount = input.nextInt();

        int[] notes = {100, 50, 20, 10, 5, 2, 1};
        System.out.println("There are:");
        for (int note : notes) {
            int count = amount / note;
            amount %= note;
            System.out.println(count + " Note(s) of " + note + ".00");
        }

        input.close();
    }

    // 7. Convert seconds to H:M:S
    public static void convertSeconds() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println("There are:");
        System.out.println("H:M:S - " + hours + ":" + minutes + ":" + seconds);

        input.close();
    }

    // 8. Print month name from number
    public static void monthFromNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number between 1 to 12 to get the month name: ");
        int month = input.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};

        if (month >= 1 && month <= 12) {
            System.out.println(months[month - 1]);
        } else {
            System.out.println("Invalid month number.");
        }
        input.close();
    }

    // 9. Count positive and negative numbers
    public static void countPosNeg() {
        Scanner input = new Scanner(System.in);
        int pos = 0, neg = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Input number " + i + ": ");
            int num = input.nextInt();
            if (num > 0)
                pos++;
            else if (num < 0)
                neg++;
        }

        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        input.close();
    }

    // 10. Password validation loop
    public static void passwordChecker() {
        Scanner input = new Scanner(System.in);
        final String CORRECT_PASSWORD = "1234";
        String entered;

        while (true) {
            System.out.print("Input the password: ");
            entered = input.nextLine();
            if (entered.equals(CORRECT_PASSWORD)) {
                System.out.println("Correct password");
                break;
            } else {
                System.out.println("Incorrect password");
            }
        }
        input.close();
    }

    // 11. Find the quadrant of a point
    public static void findQuadrant() {
        Scanner input = new Scanner(System.in);
        System.out.print("x: ");
        int x = input.nextInt();
        System.out.print("y: ");
        int y = input.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Quadrant-I(+,+)");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant-II(-,+)");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant-III(-,-)");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant-IV(+,-)");
        } else if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("On Y-axis");
        } else {
            System.out.println("On X-axis");
        }

        input.close();
    }

    // 12. Divide two numbers with validation
    public static void divideNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("x: ");
        double x = input.nextDouble();
        System.out.print("y: ");
        double y = input.nextDouble();

        if (y == 0) {
            System.out.println("Division is not possible");
        } else {
            System.out.println(x / y);
        }

        input.close();
    }

    // 13. Print numbers 3 per line up to n lines
    public static void printNumbersInLines() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of lines: ");
        int n = input.nextInt();

        int num = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(num++ + " ");
            System.out.print(num++ + " ");
            System.out.println(num++);
        }

        input.close();
    }

    // 14. Average mathematics marks
    public static void averageMarks() {
        Scanner input = new Scanner(System.in);
        int sum = 0, count = 0;

        while (true) {
            System.out.print("Input Mathematics marks (0 to terminate): ");
            int mark = input.nextInt();
            if (mark <= 0) break;
            sum += mark;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Average marks in Mathematics: %.2f%n", average);
        } else {
            System.out.println("No valid marks entered.");
        }

        input.close();
    }

    // 15. Find smallest value and its position in an array
    public static void smallestInArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of the array: ");
        int len = input.nextInt();
        int[] arr = new int[len];

        System.out.println("Input the array elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = input.nextInt();
        }

        int min = arr[0];
        int position = 0;

        for (int i = 1; i < len; i++) {
            if (arr[i] < min) {
                min = arr[i];
                position = i;
            }
        }

        System.out.println("Smallest Value: " + min);
        System.out.println("Position of the element: " + position);

        input.close();
    }

    // 16. Convert cm to inches
    public static void cmToInches() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the distance in cm: ");
        double cm = input.nextDouble();
        double inches = cm / 2.54;

        System.out.printf("Distance of %.2f cms is = %.2f inches%n", cm, inches);

        input.close();
    }

    // 17. Reverse a number
    public static void reverseNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();

        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("The original number = " + original);
        System.out.println("The reverse of the said number = " + reversed);

        input.close();
    }

    // 18. Remove negative sign (absolute value)
    public static void absoluteValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value (negative): ");
        int value = input.nextInt();

        int abs = Math.abs(value);

        System.out.println("Original value = " + value);
        System.out.println("Absolute value = " + abs);

        input.close();
    }

    // 19. Check if one number is multiple of another
    public static void checkMultiple() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first integer : ");
        int a = input.nextInt();
        System.out.print("Input the second integer: ");
        int b = input.nextInt();

        if (a % b == 0) {
            System.out.println(a + " is a multiple of " + b + ".");
        } else {
            System.out.println(a + " is not a multiple of " + b + ".");
        }

        input.close();
    }

    // 20. Print each word on a new line
    public static void printWordsSeparately() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input some text:");
        String line = input.nextLine();

        String[] words = line.split("\\s+");

        for (String word : words) {
            System.out.println(word);
        }

        input.close();
    }

    // 21. Convert currency value to notes and coins
    public static void convertCurrency() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the currency value (floating point with two decimal places): ");
        double amount = input.nextDouble();

        int whole = (int) amount;
        int cents = (int) Math.round((amount - whole) * 100);

        System.out.println("\nCurrency Notes:");
        int[] notes = {100, 50, 5, 2};
        for (int note : notes) {
            int count = whole / note;
            whole %= note;
            if (count > 0)
                System.out.println(note + " number of Note(s): " + count);
        }

        System.out.println("\nCurrency Coins:");
        int[] coins = {50, 25}; // in cents
        for (int coin : coins) {
            int count = cents / coin;
            cents %= coin;
            if (count > 0)
                System.out.println("." + coin + " number of Coin(s): " + count);
        }

        input.close();
    }

    // 22. Find third angle of a triangle
    public static void thirdAngleOfTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input two angles of triangle separated by comma: ");
        String[] parts = input.nextLine().split(",");
        int angle1 = Integer.parseInt(parts[0].trim());
        int angle2 = Integer.parseInt(parts[1].trim());
        int angle3 = 180 - (angle1 + angle2);
        System.out.println("Third angle of the triangle : " + angle3);

        input.close();
    }

    // 23. Check if alphabet is vowel or consonant
    public static void checkVowelOrConsonant() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = input.next().toLowerCase().charAt(0);

        if ("aeiou".indexOf(ch) >= 0) {
            System.out.println("The alphabet is a vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println("The alphabet is a consonant.");
        } else {
            System.out.println("Not a valid letter.");
        }
        
        input.close();
    }

    // 24. Digit to word
    public static void digitToWord() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a digit (0-9): ");
        int digit = input.nextInt();
        String[] words = {"Zero", "One", "Two", "Three", "Four",
                          "Five", "Six", "Seven", "Eight", "Nine"};
        if (digit >= 0 && digit <= 9) {
            System.out.println(words[digit]);
        } else {
            System.out.println("Not a valid single digit.");
        }

        input.close();
    }

    // 25. Guess the number game
    public static void guessNumber() {
        Scanner input = new Scanner(System.in);
        int randomNumber = 1 + (int) (Math.random() * 20);
        int guess = -1;

        while (guess != randomNumber) {
            System.out.print("Guess the number (1 to 20): ");
            guess = input.nextInt();
            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct!");
            }
        }

        input.close();
    }

    // 26. Prompt for valid username
    public static void usernameValidator() {
        Scanner input = new Scanner(System.in);
        String username;

        do {
            System.out.print("Enter a username (min 8 characters): ");
            username = input.nextLine();
        } while (username.length() < 8);

        System.out.println("Valid username entered: " + username);

        input.close();
    }

    // 27. Factorial using while loop
    public static void factorialCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        long factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " = " + factorial);

        input.close();
    }

    // 28. Multiplication table up to 10
    public static void multiplicationTable() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }

        input.close();
    }

    // 29. FizzBuzz from 1 to 100
    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    // 30. Find longest word in a sentence
    public static void findLongestWord() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        String[] words = sentence.split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());

        input.close();
    }

    // 31. Find max and min in array
    public static void findMaxMin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Input " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0], min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Maximum element is : " + max);
        System.out.println("Minimum element is : " + min);

        sc.close();
    }

    // 32. Separate even and odd into arrays
    public static void separateOddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        System.out.println("Input " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) even.add(arr[i]);
            else odd.add(arr[i]);
        }

        System.out.println("The Even elements are :");
        for (int num : even) System.out.print(num + " ");
        System.out.println("\nThe Odd elements are :");
        for (int num : odd) System.out.print(num + " ");
        System.out.println();

        sc.close();
    }

    // 33. Sort array in ascending order
    public static void sortAscending() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Input " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Elements of array in sorted ascending order:");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        sc.close();
    }

    // 34. Sort array in descending order
    public static void sortDescending() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        System.out.println("Input " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Elements of the array in sorted descending order:");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        sc.close();
    }

    // 35. Find second largest element
    public static void secondLargest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Input " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int largest = arr[n - 1];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondLargest != Integer.MIN_VALUE)
            System.out.println("The Second largest element in the array is : " + secondLargest);
        else
            System.out.println("All elements are equal or second largest not found.");

        sc.close();
    }

    // 36. Check if number is even or odd using function
    public static void checkEvenOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any number: ");
        int n = sc.nextInt();
        if (isEven(n)) System.out.println("The entered number is even.");
        else System.out.println("The entered number is odd.");

        sc.close();
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // 37. Decimal to binary using function
    public static void decimalToBinary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any decimal number: ");
        int n = sc.nextInt();
        System.out.println("The Binary value is : " + Integer.toBinaryString(n));

        sc.close();
    }

    // 38. Leap year checker
    public static void checkLeapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = sc.nextInt();

        if (year < 1000 || year > 9999) {
            System.out.println("invalid year");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        sc.close();
    }

    // 39. Area of circle using function
    public static void areaOfCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO NICO’S COMPUTING AREA OF THE CIRCLE PROGRAM");
        System.out.print("Input radius: ");
        float r = sc.nextFloat();
        float area = getAreaOfCircle(r);
        System.out.printf("The area is : %.2f%n", area);

        sc.close();
    }

    public static float getAreaOfCircle(float radius) {
        return (float) (Math.PI * radius * radius);
    }

    // 40. Area of square using function
    public static void areaOfSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO NICO’S COMPUTING AREA OF THE CIRCLE PROGRAM");
        System.out.print("Input side: ");
        float side = sc.nextFloat();
        float area = getAreaOfSquare(side);
        System.out.printf("The area is : %.2f%n", area);

        sc.close();
    }

    public static float getAreaOfSquare(float side) {
        return side * side;
    }
}