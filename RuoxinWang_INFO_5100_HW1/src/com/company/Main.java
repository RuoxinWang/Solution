package com.company;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //Question 1

        int[] numQ1_1 = {1,2,3,2};
        int[] numQ1_2 = {1,1,1,1,1};
        int[] numQ1_3 = {1,2,3,4,5};
        sumOfUnique(numQ1_1);
        sumOfUnique(numQ1_2);
        sumOfUnique(numQ1_3);


        //Question 2

        int[] numQ2_1 = {-4,-1,0,3,10};
        int[] numQ2_2 = {-7,-3,2,3,11};
        sortedSquares(numQ2_1);
        sortedSquares(numQ2_2);


        //Question 3

        int[] numQ3_1 = {2,3,4,2,2,3,5,7};
        firstNonRepeated(numQ3_1);


        //Question 4

        String ransomNote1 = "a";
        String magazine1 = "b";
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println(canConstruct(ransomNote1, magazine1));
        System.out.println(canConstruct(ransomNote2, magazine2));
        System.out.println(canConstruct(ransomNote3, magazine3));




        //Question 5

        String str1 = "1A3d4s5t";
        String str2 = "A2bb2d4";
        followedBy(str1);
        followedBy(str2);



    }//end of main function



    //Question 1 Solution

    private static int sumOfUnique(int[] num1) {

        int[] uniqueFrequency = new int[255];
        int sum = 0;

        for(int i = 0; i < num1.length; i++){
            uniqueFrequency[num1[i]]++;
        }

        for(int i = 0; i < num1.length; i++){
            if(uniqueFrequency[num1[i]] == 1)
                sum += num1[i];
        }
        System.out.println(sum);

        return sum;

    }//End of Q1


    //Question 2 Solution


    private static int[] sortedSquares(int[] num2){

        int[] squares = new int[num2.length];
        int left_pointer = 0;
        int right_pointer = num2.length-1;

        for(int i = num2.length-1; i >=0; i--) {
            if(Math.abs(num2[left_pointer]) > num2[right_pointer]){
                squares[i] = num2[left_pointer] * num2[left_pointer];
                left_pointer++;
            }else{
                squares[i] = num2[right_pointer]* num2[right_pointer];
                right_pointer--;
            }
        }

        System.out.println(Arrays.toString(squares));

        return squares;



    }//End of Q2


    //Question 3 Solution

    private static int firstNonRepeated(int[] num3){

        int[] freq = new int[255];
        int firstNon = 0;

        for(int i = 0; i < num3.length; i++){
            freq[num3[i]]++;
        }
        for(int i = 0; i < num3.length; i++){
            if(freq[num3[i]] == 1){
                firstNon += num3[i];
                break;
            }
        }
        System.out.println(firstNon);
        return firstNon;

    }//End Of Q3


    //Question 4 Solution

    private static boolean canConstruct(String ransomNote, String magazine){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            int count = map.getOrDefault(ch, 0) + 1;
            map.put(ch, count);
        }
        for(char ch : ransomNote.toCharArray()){
            int count = map.getOrDefault(ch,0) - 1;
            map.put(ch, count);
            if (count < 0){
                return false;
            }
        }
        return true;

    }//End of Q4


    //Question 5 Solution

    private static void followedBy (String str) {

        char[] arr = str.toCharArray();
        for(int i = 0, j = 1; j < arr.length; i++, j++){
            if(Character.isLetter(arr[i]) != Character.isLetter(arr[j])){
                if(j == arr.length-1){
                    System.out.println("True");}
                continue;
            }else{
                System.out.println("False");
                break;
            }
        }




    }//End of Q5









} //End of Main class
