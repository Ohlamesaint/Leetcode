package question_136.single_number;

class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for(int i : nums){
            answer^=i;
        }
        return answer;
    }
}