// Number.java
// Number object to store information about a number

import java.util.ArrayList;

public class Number {

     private int value; // Stores value of number
     private ArrayList<Integer> divisors = new ArrayList<Integer>(); // List for divisors (used to check for prime numbers and amicable pairs)

     public int getValue() {
          return value;
     }
     
     public void setValue(int val){
           value = val;
     }

     public void setDivisors(){

     }

     public ArrayList<Integer> getDivisors(){

     }

     public boolean isPrime(){

     }

}
