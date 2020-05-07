package leetcode;

class LeetCode_1342_NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args){
        int num = 1;
        int steps = countSteps(num);
        System.out.println("Number of Steps: "+steps);
    }
    public static int countSteps(int number){
        int stepsCounter = 0;
        while(number != 0){
            if(number % 2 == 0)
                number = number / 2; 
            else
                number = number - 1;
                
            stepsCounter++;
        }
        return stepsCounter;
    }
}