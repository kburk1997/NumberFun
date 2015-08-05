// Number.java
// Number object to store information about a number

import java.util.ArrayList;

public class Number {

     private int value; // Stores value of number
     private ArrayList<Integer> divisors = new ArrayList<Integer>(); // List for divisors (used to check for prime numbers, perfect numbers, and amicable pairs)

     public int getValue() {
          return value;
     }
     
     public void setValue(int val){
           value = val;
           setDivisors();
     }

     public void setDivisors(){
           //first clear ArrayList

          //loop through all numbers from 1 to value
         //if value mod number = 0, add to ArrayList
     }

     public ArrayList<Integer> getDivisors(){
            return divisors;
     }

     public boolean isPrime(){

            //number is prime if it has 2 divisors, 1 and itself

            if (divisors.size() == 2) { //Assuming divisors are 1 and value, therefore returning false for value of 1

                     return true;
            }
            else{
                     return false;
            }
     }
     
     //"Perfect" numbers are numbers whose sum of divisors add up to the number, not including the number itself

     public boolean isPerfect(){

            int sum =0; // Sum is 0 by default

            for (int i =0; i<divisors.size()-1; i++) { //Loops through ArrayList of divisors, making sure to end before the number itself

                    sum += divisors (i); //adds divisors at I to sum

            }
            if (sum == value) {
                     return true;
            }
            else{
                     return false;
            }
     }

        //"Abundant" numbers are numbers whose sum of divisors is greater than the number, not including the number itself

     public boolean isPerfect(){

            int sum =0; // Sum is 0 by default

            for (int i =0; i<divisors.size()-1; i++) { //Loops through ArrayList of divisors, making sure to end before the number itself

                    sum += divisors (i); //adds divisors at I to sum

            }
            if (sum > value) {
                     return true;
            }
            else{
                     return false;
            }
     }
     
     public boolean isEven(){
            if (value % 2 == 0){
                     return true;
            }
            else{
                     return false;
            }
     }

     //constructor
     
     public Number(int val){
           value = val;
           setDivisors(); // Sets divisors by default
     }

}
