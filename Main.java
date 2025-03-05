

//import java.lang.*;
//import java.util.Scanner;
//
//class Akshayaa {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        float a = s.nextFloat();
//        float b = s.nextFloat();
//        System.out.println("sum: " + (a + b));
//        System.out.println(a - b);
//        System.out.println(a / b);
//        System.out.println(a * b);
//    }
//}


//        double a = Math.random();
//        System.out.println(a);
//        if (a % 2 == 0){
//           System.out.println("a is even");}
//        else {
//            System.out.println("a is odd");
//        }

//        for (int i = 0; i < 1000; i++){
//            if (i%5 == 0 && i%6 == 0){
//                System.out.println(i);
//            }
//            else {
//                System.out.println("nothing");
//            }
//
//
//
//    public static void sin() {
//        System.out.println(50);
//    }
//
//    public static void tan() {
//        System.out.println(80);
//    }
//
//    public static void cos() {
//        System.out.println(60);
//    }
//}

//        float a = s.nextInt();
//        if (a % 3 == 0 && a % 9 == 0){
//           System.out.println("True");}
//        else{
//            System.out.println("False");
//        }

//Abstract class

//import java.lang.*;
//
//abstract class Colour{
//    public void identifyColor() {
//        System.out.println("helloo");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Colour colTo = new Colour() {
//            @Override
//            public void identifyColor() {
//                super.identifyColor();
//            }
//        };
//        colTo.identifyColor();
//    }
//}

//
//abstract class Animal {
//    public void makeSound() {
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal cat= new Animal() {
//        @Override
//            public void makeSound() {
//            System.out.println("meaow");
//        }
//        };
//        cat.makeSound();
//    }
//}

//interface

//interface Bike {
//    void start();
//    void stop();
//}
//public class Main {
//    public static void main(String[] args) {
//        Bike bike= new Bike() {
//        @Override
//            public void start() {
//            System.out.println("Bike Started.");
//        }
//        @Override
//        public void stop() {
//            System.out.println("Bike Stopped.");
//        }
//        };
//        bike.start();
//        bike.stop();
//    }
//}

//wirth parameters
//
//abstract class GoogPay {
//    public void toPay(String name, int money) {
//        System.out.println("Paid " + money + " to " + name);
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        GoogPay gpay= new GoogPay() {
//        @Override
//            public void toPay(String name, int amount) {
//                super.toPay(name, amount);
//                System.out.println("Successfully paid.");
//        }
//        };
//        gpay.toPay("Aksh", 500);
//    }
//}

//Encapsulation
//import java.lang.*;
//class Students {
//    private String name;
//    private int regNum;
//    private double percent;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setRegNum(int regNum) {
//        this.regNum = regNum;
//    }
//    public int getRegNum() {
//        return regNum;
//    }
//    public void setPercent(double percent) {
//        this.percent = percent;
//    }
//    public double getPercent() {
//        return percent;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Students obj = new Students();
//        obj.setName("Akshayaa");
//        obj.setRegNum(21113185);
//        obj.setPercent(81);
//        System.out.println(obj.getName());
//        System.out.println(obj.getRegNum());
//        System.out.println(obj.getPercent());
//    }
//
//}

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String input = scanner.nextLine();
//
//        String[] words = input.split("\\s+");
//
//        Map<String, Integer> wordCount = new HashMap<>();
//
//        for (String word : words) {
//            word = word.toLowerCase();
//            if (wordCount.containsKey(word)) {
//                wordCount.put(word, wordCount.get(word) + 1);
//            } else {
//                wordCount.put(word, 1);
//            }
//        }
//
//        System.out.println("Word Frequency:");
//        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//
//        scanner.close();
//    }
//}
//import java.lang.*;
//import java.util.HashMap;
//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<HashMap<String, String>> students = new ArrayList<>();
//
//        HashMap<String, String> student1 = new HashMap<>();
//        student1.put("name", "Akshayaa");
//        student1.put("USn", "002");
//        student1.put("University", "Hits");
//
//        HashMap<String, String> student2 = new HashMap<>();
//        student2.put("name", "Agnes");
//        student2.put("USn", "003");
//        student2.put("University", "SSS");
//
//        HashMap<String, String> student3 = new HashMap<>();
//        student3.put("name", "Abi");
//        student3.put("USn", "004");
//        student3.put("University", "DDD");
//
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter a name: ");
//        String userInput = s.nextLine();
//
//        if (student1.get("name").equals(userInput)) {
//            System.out.println(student1);}
//        else if (student2.get("name").equals(userInput)) {
//            System.out.println(student2);}
//        else if (student3.get("name").equals(userInput)) {
//            System.out.println(student3);}
//        else {
//            System.out.println("Not found");
//        }
//    }

//public class Main{
//   public static void main(String[] args) {
//        HashMap<Character, Character> myHashmap = getHashMap();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your text to encrypt: ");
//        String userInput = scanner.nextLine();
//        String encryptedText = encryptMyMessage(userInput, myHashmap);
//        System.out.println("Encrypted Text: " + encryptedText);
//   }
//
//    public static String encryptMyMessage (String original, HashMap < Character, Character > myHashmap){
//        StringBuilder encrypted = new StringBuilder();
//        for (int i = 0; i < original.length(); i++) {
//            char c = original.charAt(i);
//            // If the character is present in the map, encrypt, otherwise keep it the same
//            if (myHashmap.containsKey(c)) {
//                encrypted.append(myHashmap.get(c));
//            } else {
//                encrypted.append(c);
//            }
//        }
//        return encrypted.toString();
//    }
//
//    public static HashMap<Character, Character> getHashMap() {
//        HashMap<Character, Character> alphabetMap = new HashMap<>();
//        String allCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//        String randomSymbols = "!@#$%^&*()_+-={}[]|:;<>,.?/~`";
//        Random random = new Random();
//
//        // Create a random character/symbol mapping
//        for (char c : allCharacters.toCharArray()) {
//            char randomChar;
//            if (random.nextBoolean()) {
//                randomChar = allCharacters.charAt(random.nextInt(allCharacters.length()));
//            } else {
//                randomChar = randomSymbols.charAt(random.nextInt(randomSymbols.length()));
//            }
//            alphabetMap.put(c, randomChar);
//        }
//
//        return alphabetMap;
//    }
//}

//import java.util.HashMap;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Encrypt (E) or decrypt (D)?");
//        String choice = scanner.nextLine().toUpperCase();
//
//        HashMap<Character, Character> myHashmap = getHashMap();
//
//        if (choice.equals("E")) {
//            System.out.println("Enter message to encrypt:");
//            String userInput = scanner.nextLine();
//            String encryptedText = encryptMyMessage(userInput, myHashmap);
//            System.out.println("Encrypted Message: " + encryptedText);
//        } else if (choice.equals("D")) {
//            System.out.println("Enter message to decrypt:");
//            String encryptedText = scanner.nextLine();
//            String decryptedText = decryptMyMessage(encryptedText, myHashmap);
//            System.out.println("Decrypted Message: " + decryptedText);
//        } else {
//            System.out.println("Invalid choice. Exiting.");
//        }
//        scanner.close();
//    }
//
//    public static String encryptMyMessage(String original, HashMap<Character, Character> myHashmap) {
//        StringBuilder temp = new StringBuilder();
//        for (int i = 0; i < original.length(); i++) {
//            char c = original.charAt(i);
//            // If the character is in the map, replace it. Otherwise, keep it as is (e.g., spaces)
//            temp.append(myHashmap.getOrDefault(c, c));
//        }
//        return temp.toString();
//    }
//
//    public static String decryptMyMessage(String encryptedText, HashMap<Character, Character> myHashmap) {
//        StringBuilder temp = new StringBuilder();
//        for (int i = 0; i < encryptedText.length(); i++) {
//            char c = encryptedText.charAt(i);
//            // Find the original character by value (reversing the map)
//            char originalChar = getKeyByValue(myHashmap, c);
//            if (originalChar != Character.MIN_VALUE) {
//                temp.append(originalChar);
//            } else {
//                // Handle characters not found in the mapping (e.g., spaces)
//                temp.append(c);
//            }
//        }
//        return temp.toString();
//    }
//
//    public static char getKeyByValue(HashMap<Character, Character> map, char value) {
//        for (Character key : map.keySet()) {
//            if (map.get(key) == value) {
//                return key;
//            }
//        }
//        return Character.MIN_VALUE; // Indicate character not found
//    }
//
//    public static HashMap<Character, Character> getHashMap() {
//        HashMap<Character, Character> alphabetMap = new HashMap<>();
//        String allCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//        String randomSymbols = "!@#$%^&*()_+-={}[]|:;<>,.?/~`";
//        Random random = new Random();
//        // Ensure unique random mapping
//        char[] shuffledCharacters = (allCharacters + randomSymbols).toCharArray();
//        shuffleArray(shuffledCharacters, random);
//        int i = 0;
//        for (char c : allCharacters.toCharArray()) {
//            alphabetMap.put(c, shuffledCharacters[i++]);
//        }
//        return alphabetMap;
//    }
//
//    // Utility function to shuffle array
//    public static void shuffleArray(char[] array, Random random) {
//        for (int i = array.length - 1; i > 0; i--) {
//            int index = random.nextInt(i + 1);
//            char temp = array[index];
//            array[index] = array[i];
//            array[i] = temp;
//        }
//    }
//}

//import java.util.*;
//
//class Main {
//    public static void main(String[] args) {
//        ArrayList arr = new ArrayList();
//        Random rand = new Random(50);
//        System.out.println(rand);
//    }
//        MyStack s1 = new MyStack();
//        s1.push("Hello There");
//        s1.push(12);
//        s1.pop();
//        s1.display();
//    }
//}
//
//class MyStack {
//    ArrayList arrayList = new ArrayList();
//
//    // Constructor that accepts an ArrayList
//    public MyStack(ArrayList arrayList) {
//        this.arrayList = arrayList;
//    }
//
//    // Default constructor
//    public MyStack() {
//    }
//
//    // Overloaded push method for String
//    public void push(String newElement) {
//        arrayList.add(newElement);
//    }
//
//    // Overloaded push method for int
//    public void push(int newElement) {
//        arrayList.add(newElement);
//    }
//
//    // Removes the last element (pop)
//    public void pop() {
//        arrayList.remove(arrayList.size() - 1);
//    }
//
//    // Displays the elements in the stack
//    public void display() {
//        System.out.println(arrayList);
//    }

//Multithreading
//import java.lang.*;
//import java.lang.Thread;
//
//class MultiDemo extends Thread {
//    public void run() {
//        try {
//            System.out.println("I'm okay");
//        } catch (Exception e) {
//            System.out.println("Error caught");
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args){
//        int n = 5;
//        for (int i =0; i<n; i++){
//            MultiDemo object = new MultiDemo();
//            object.start();
//        }
//    }
//}

////API
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.Scanner;
//class Hash {
//    public static void main(String[] args) throws MalformedURLException, IOException {
//        String base_url = "https://catfact.ninja/breeds";
//        URL catUrl = new URL(base_url);
//        HttpURLConnection catUrlConnecton = (HttpURLConnection) catUrl.openConnection();
//        catUrlConnecton.setRequestMethod("GET");
//        catUrlConnecton.connect();
//        Scanner scanner = new Scanner(catUrlConnecton.getInputStream());
//        String theInput = "";
//        while (scanner.hasNext()) {
//            theInput += scanner.next();
//        }
//        System.out.println(theInput);    }
//public class Main {
//        int num = 100;
//        public void display(){
//            System.out.println("Public modifier: " + num);
//        }
//}

//Calories  calculation
//class MET_VALUES {
//    public static final float running = 10.0f;
//    public static final float cycling = 8.0f;
//    public static final float swimming = 9.8f;
//    public static final float walking = 3.3f;
//}
//
//class Main{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Activity (Running/Cycling/Swimming/Walking): " );
//        String activity= sc.nextLine().toLowerCase();
//
//        System.out.println("Minutes: " );
//        int min= sc.nextInt();
//
//        System.out.println("Weight: " );
//        int weight= sc.nextInt();
//
//        float metValue = 0;
//        switch (activity) {
//            case "running":
//                metValue = MET_VALUES.running;
//                break;
//            case "swimming":
//                metValue = MET_VALUES.swimming;
//                break;
//            case "cycling":
//                metValue = MET_VALUES.cycling;
//                break;
//            case "walking":
//                metValue = MET_VALUES.walking;
//                break;
//            default:
//                System.out.println("Invalid");
//                return;
//        }
//
//        float calories_burnt = metValue * weight * min / 60.0f;
//        System.out.println("Calories Burned: " + calories_burnt);
//
//        sc.close();
//
//    }
//}

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
//class Main {
//    public static void main(String args[]) {
//        for(int i=0; i<=6; i++){
//            System.out.println(i + " ");
//        for (;;){
//            System.out.println("Infinite");
//          Scanner scan = new Scanner(System.in);
//          int i = 2003;
//          int attempts = 0;
//          int max_attempts = 3;
//          while (attempts<max_attempts) {
//              System.out.println("Enter your pin: ");
//              int pin = scan.nextInt();
//              if (i == pin) {
//                  System.out.println("Okay! Successfully logged in.");
//                  return;
//              } else {
//                  attempts++;
//                  if (attempts < max_attempts) {
//                      System.out.println("Incorrect attempts. You have " + (max_attempts - attempts) + " attempts to try.");
//                  } else {
//                      System.out.println("Too many attempts failed, Access denied.");
//                  }
//
//              }
//          }
//
//        StringBuffer sbf = new StringBuffer("Akshayaa");
//        sbf.append(" Dheenu");
//        System.out.println(sbf);
//
//        StringBuilder sbb = new StringBuilder("Akshayaa");
//        sbb.append(" Dheenu");
//        System.out.println(sbb);
//       int i = 10;
//        while(i>=1){
//            System.out.println(i);
//            i--;
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a num: ");
//        int num = sc.nextInt();
//        int rev = 0;
//        while(num > 0){
//             int digit = num % 10;
//             rev = rev * 10 + digit;
//             num /= 10;
//        }
//        System.out.println("Reversed number: " + rev);
//

//        int[] arr = {10, 20, 30};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int i : arr) {
//            System.out.println(i);
//        }
//
//        int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

        // printing 2D array
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++)
//                System.out.print(arr[i][j] + " ");
//            System.out.println();
//        }

//        int[] arr = {3, 2, 3, 2, 1};
//        int[] reversed = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            reversed[i] = arr[arr.length - i - 1];
//        }
//
//        if (Arrays.equals(arr, reversed)) {
//            System.out.println("Array is a palindrome");
//        } else {
//            System.out.println("Array is not a palindrome");
//        }
//          int[] arr = {10, 20, 30, 40 , 50};
//          int key = 50;
//          Arrays.sort(arr);
//          System.out.println(key + " at the position of index: " + Arrays.binarySearch(arr, key));

class Main {
    public static int sum(int n) {
//        if(a%2==0){
//            System.out.println(a + "is even");
//        }else {
//            System.out.println(a + "is odd");
//        }
//        if(a<=0){
//            return 1;
//        }
//        return (a * fact(a-1));
//        if (a <= 1) return a;
//        return fib(a - 1) + fib(a - 2);
//}
//    public static void main(String args[]){
//        int num = 10;
//        System.out.println(fib(num));
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum(n / 10);

    }

    public static void main(String args[]) {
        int num = 10234354;
        System.out.println(sum(num));

    }
}


//        for (int i = 0; i <= arr.length; i++){
//            System.out.println(i + ":" +  arr[i]);
//        }
//        int max =arr[0];
//        for (int i = 1; i < arr.length; i++){
//            if(arr[i] < max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);




//class Main
//{
//    public static void main(String args[])
//    {
//        String str;
//
//        //Obtaining a reference to the console.
//        Console con = System.console();
//
//        // Checking If there is no console available, then exit.
//        if(con == null)
//        {
//            System.out.print("No console available");
//            return;
//        }
//
//        // Read a string and then display it.
//        str = con.readLine("Enter your name: ");
//        con.printf("Here is your name: %s\n", str);
//
//        //to read password and then display it
//        System.out.println("Enter the password: ");
//        char[] ch=con.readPassword();
//
//        //converting char array into string
//        String pass = String.valueOf(ch);
//        System.out.println("Password is: " + pass);
//    }
//}





////        System.out.println("Hellooo");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int x = sc.nextInt();
////        System.out.println("Enter the second number: ");
////        int y = sc.nextInt();
////        System.out.println(x + y);
//        if(x % 9 == 0){
//            System.out.println("YES");
//          }else {
//            System.out.println("NO");
//        }
//    }
//    }







