package VKS_08;

import java.util.Arrays;
import java.util.HashMap;


public class Solution {

    public boolean isPalindrome(String sentence){
        char[] letters = sentence.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray();
        if(letters.length == 0){
            return true;
        }
        int firstPoint = 0, secondPoint = letters.length - 1;
        while(firstPoint < secondPoint){
            if(letters[firstPoint] == letters[secondPoint]){
                firstPoint++;
                secondPoint--;
            }else {
                return false;
            }
        }
        return true;
    }


    public boolean haveDublicate(int[] numbers){
        int[] uniqueNumbers =  Arrays.stream(numbers).distinct().toArray();
        return uniqueNumbers.length != numbers.length;
    }

    public int[] twoSum(int[] nums, int solution){
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int numberToFind = solution - nums[i];
            if(numbers.containsKey(numberToFind)){
                return new int[]{numbers.get(numberToFind), i};
            }
            numbers.put(nums[i], i);
        }
        return new int[0];
    }
}
