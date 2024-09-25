public class Main {

  // method
  static String myMethod(String name){
    String line = "Hello" + " " + name;
    return line;
  }
  public static void main(String[] args) {
    // println utility
    System.out.println("Hello World");
    System.out.println("I am learning Java.");
    System.out.println("It is awesome!");

    // print utility
    System.out.print("Hello World! ");
    System.out.print("I will print on the same line.");

    // println numbers
    System.out.println(3);
    System.out.println(358);
    System.out.println(50000);

    // println maths
    System.out.println(3 + 3);
    System.out.println(2 * 5);

    // Variables
    String name = "Valentin";
    System.out.println(name);

    int a = 100;
    int b = 30;

    System.out.println(a + b);

    int c = 10;
    c = 100;
    System.out.println(c);

    final int d = 8432;
    System.out.println(d);

    // int myNum = 5;
    // float myFloatNum = 5.99f;
    // char myLetter = 'D';
    // boolean myBool = true;
    // String myText = "Hello";

    // Declare many variables
    int x = 5, y = 6, z = 50;
    System.out.println(x + y + z);

    // Student data
    String studentName = "John Doe";
    int studentID = 15;
    int studentAge = 23;
    float studentFee = 75.25f;
    char studentGrade = 'B';

    // Print variables
    System.out.println("Student name: " + studentName);
    System.out.println("Student id: " + studentID);
    System.out.println("Student age: " + studentAge);
    System.out.println("Student fee: " + studentFee);
    System.out.println("Student grade: " + studentGrade);

    // The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
    byte myNum = 100;
    System.out.println(myNum);

    //The short data type can store whole numbers from -32768 to 32767:
    short myNum2 = 5000;
    System.out.println(myNum2);

    // The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.
    int myNum3 = 100000;
    System.out.println(myNum3);

    // The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":
    long myNum4 = 15000000000L;
    System.out.println(myNum4);

    // The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:
    float myNum5 = 5.75f;
    System.out.println(myNum5);

    // The precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. Therefore it is safer to use double for most calculations.
    double myNum6 = 19.99d;
    System.out.println(myNum6);

    // Boolean
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);
    System.out.println(isFishTasty);

    // Char
    // Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:
    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    System.out.println(myVar1);
    System.out.println(myVar2);
    System.out.println(myVar3);

    // Exemple

    int items = 50;
    float costPerItem = 9.99f;
    float totalCost = items * costPerItem;
    char currency = '€';

    System.out.println("Number of items: " + items);
    System.out.println("Cost per item: " + costPerItem + currency);
    System.out.println("Total cost = " + totalCost + currency);

    // Java Type Casting
    // Widening casting is done automatically when passing a smaller size type to a larger size type:

    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);   
    System.out.println(myDouble);

    // Narrowing casting must be done manually by placing the type in parentheses () in front of the value:
    double myDouble2 = 9.78d;
    int myInt2 = (int) myDouble2; // Manual casting: double to int

    System.out.println(myDouble2);
    System.out.println(myInt2); 

    // Exemple
    int maxScore = 500;
    int userScore = 423;
    float percentage = (float) userScore / maxScore * 100.0f;

    System.out.println("User's percentage is " + percentage);

    // Concatenation

    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));

    // \n	New Line	
    // \r	Carriage Return	
    // \t	Tab	
    // \b	Backspace	
    // \f	Form Feed

    // Math

    System.out.println(Math.max(5, 10));
    System.out.println(Math.min(5, 10));
    System.out.println(Math.sqrt(64));
    System.out.println(Math.abs(-4.7));
    System.out.println(Math.random());

    int myAge = 25;
    int votingAge = 18;

    if (myAge >= votingAge) {
      System.out.println("Old enough to vote!");
    } else {
      System.out.println("Not old enough to vote.");
    }

    // variable = (condition) ? expressionTrue :  expressionFalse;

    // switch
    int day = 4;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }

    // The default keyword specifies some code to run if there is no case match:
    int day2 = 4;
    switch (day2) {
      case 6:
        System.out.println("Today is Saturday");
        break;
      case 7:
        System.out.println("Today is Sunday");
        break;
      default:
        System.out.println("Looking forward to the Weekend");
    }

    // loop

    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }

    int t = 0;
    do {
      System.out.println(t);
      t++;
    }
    while (t < 5);

    for (int g = 0; g < 5; g++) {
      System.out.println(g);
    }
    
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String p : cars) {
      System.out.println(p);
    }

    int[][] myNumbersZ = { {1, 2, 3, 4}, {5, 6, 7} };
    System.out.println(myNumbersZ[0][1]);

    System.out.println(myMethod("John"));
  }
}