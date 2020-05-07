package leetcode;

/*Question Statement
Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. 
Notice that multiple kids can have the greatest number of candies.
*/
import java.util.*;
public class LeetCode_1431_KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args){
        int[] candies = {2,4,1,6,2,3};
        int extraCandies = 4;

        List<Boolean> result = new ArrayList<Boolean>();
        result = kidsWithCandiesMethod1(candies, extraCandies);
        for (boolean i : result) {
            System.out.println(i);
        }
    }
    static List<Boolean> kidsWithCandiesMethod1(int[] candies, int extraCandies) {
        int maxCandy = maxCandies(candies);
        List<Boolean> kidsMeter = new ArrayList<Boolean>();
        for(int kidNumber=0; kidNumber<candies.length;kidNumber++){
            if(candies[kidNumber]+extraCandies >= maxCandy){
                kidsMeter.add(Boolean.TRUE);
            }
            else
                kidsMeter.add(Boolean.FALSE);
        }
        return kidsMeter;
    }
    static int maxCandies(int[] candies){
        int maxCandiesCount=0;
        for(int kidNumber = 0; kidNumber<candies.length; kidNumber++){
            if(candies[kidNumber]>maxCandiesCount)
                maxCandiesCount = candies[kidNumber];
        }        
        return maxCandiesCount;
    }
}