// File name should be: UserInputs.java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // char arr[] = new char[7];
        // arr[0] = 't';
        // arr[1] = 'e';
        // arr[2] = 's';   
        // arr[3] = 't';
        // arr[4] = 'i';
        // arr[5] = 'n';
        // arr[6] = 'g';
        char arr1[] = {'b', 'a', 'b', 'y', 's','c','r','e','a','m'};
        char arr2[] = Arrays.copyOf(arr1, 5); 
        int startingIndex = 1;
        int endingIndex = 6;
        Arrays.fill(arr1, 'o'); // Fill arr1 with 'a'
        char arr3[] = Arrays.copyOfRange(arr1,startingIndex,endingIndex); // Copy first 5 elements of arr1 to arr2
        Arrays.fill(arr1,'n');
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(arr1 == arr2); // false, because they are different arrays
        for (int i = 0; i <=30;i++){
            System.out.println(i);
        }
        int a[] = {1,2,3,4,5,6,7,8,9,10,12,233,2332};
        int sum = 0;
        for (int index=0;index < a.length ;index++) {
            sum += a[index];
        }
        System.out.println(sum);
        int t=10;
        for (int multiplier = 0;multiplier <=t;multiplier++){
            System.out.printf("%d x %d = %d \n",t,multiplier,t*multiplier);
        }
        for (int numb=1;numb <= 10;numb++){
            for(int multi=1;multi <= 10;multi++){
                System.out.printf("%d x %d = %d \n",numb,multi,numb*multi);
            }

        }
        for (int number=1;number <= 10;number++){
            if (number % 2 == 1) {
                System.out.println("number is odd:" + number);
            }else{
                System.out.println("number is even:" + number   );
            }    
        }

        //ARRAYLIST TOPIC
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10); // Adds 10 to the ArrayList
        numbers.add(20);
        numbers.add(50);
        numbers.add(22);
        numbers.add(2,44);
        numbers.remove(1); // Removes the element at index 1
        System.out.println("ArrayList: " + numbers);
        System.out.println("that one freakin value: " + numbers.get(1));// Gets the element at index 1
        System.out.println("Size of ArrayList: " + numbers.size());// Gets the size of the ArrayList
        numbers.set(0,22332233);
        // numbers.clear();
        numbers.set(1,334);
        System.out.println("is array empty :" + numbers.isEmpty());// Checks if the ArrayList is empty
        System.out.println("Index of 22332233: " + numbers.indexOf(22332233)); // Gets the index of the first occurrence of 22332233
        System.out.println("Last index of 334: " + numbers.lastIndexOf(334));// Gets the index of the last occurrence of 334
        System.out.println("ye 22 hai list me :" + numbers.contains(22));// Checks if 22 is present in the ArrayList
        System.out.println("Updated ArrayList: " + numbers);
        Collections.sort(numbers); // Sorts the ArrayList in ascending order
        System.out.println("Sorted ArrayList: " + numbers);
        Collections.sort(numbers,Collections.reverseOrder());// Sorts the ArrayList in descending order
        System.out.println(numbers);
        numbers.forEach(number -> {
            System.out.println("numbers in the shity list: " + numbers);
        });


        // char key = 'b';
        // Arrays.sort(arr1);
        // int foundIndex = Arrays.binarySearch(arr1, key);
        // Arrays.sort(arr1, startingIndex,endingIndex); 
        // System.out.println(foundIndex);//matlb startingIndex se endingIndex tak sort kr dega
        // System.out.println("Sorted array: " + Arrays.toString(arr1));
        // Pehle poora array sort karo
        // Arrays.fill(arr1,startingIndex,endingIndex,'l'); // Array ab {'a', 'b', 'b', 's', 'y'} hoga
        // int foundIndex1 = Arrays.binarySearch(arr1, key);
        
        System.out.println("Sorted array: " + Arrays.toString(arr1));
        // System.out.println("Found 'a' at index: " + foundIndex1); // 'a' index 0 pe hog
        // System.out.println(arr.length);







        // System.out.print("Enter the first number: ");
        // double num1 = scanner.nextDouble();

        // System.out.println("Enter the second number: ");
        // double num2 = scanner.nextDouble();

        // System.out.println("What operation u want to perofrm? (add, subtract, multiply, divide)");
        // String operation = scanner.next();

        


        // if (operation.equals("addition")) {
        //     System.out.println("sum:" + (num1 + num2));
        // }
        // else if (operation.equals("multiply")) {
        //     System.out.println("product:" + (num1 * num2));
        // }
        // else if (operation.equals("substraction")) {
        //     System.out.println("diff : " + (num1 - num2));
        // }
        // else if (operation.equals("division")){
        //     if (num2 == 0) {
        //         System.out.println("Error: Division by zero is not allowed.");
        //     }else {
        //     System.out.println("division:" + (num2/num1));
        //     }
        // }
        // else if (operation.equals("remainder")){ 
        //     System.out.println("power: " + (num1 % num2));
        // }
        
        scanner.close();
        
    }
}
