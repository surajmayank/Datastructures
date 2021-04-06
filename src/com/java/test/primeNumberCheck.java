package com.java.test;

public class primeNumberCheck {

    public static void main(String[] args) {
         int n =5;
         long result = prime(n);
         System.out.println(result);
    }

    private static long prime(int n) {
        long i;
        int counter=0;
        for( i=0;i>=0;i++){
            if(checkForPrime((int) i)){
                counter++;
            }
            if(counter==n){
                boolean digit=checkDigitPrime((int) i);
                if(digit){
                    break;
                }
                counter--;
            }
        }
        return i;

    }

    private static boolean checkDigitPrime(int num) {
        boolean check = true;
        while(num != 0) {
            int digit = num % 10;
          check=checkForPrime(digit);
           if(check==false){
              return false;
           }
            num /= 10;
        }
        return check;
    }

    public static  boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;

        if (inputNumber <= 1) {
            isItPrime = false;

            return isItPrime;
        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = false;

                    break;
                }
            }

            return isItPrime;
        }
    }
}
