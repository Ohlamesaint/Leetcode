package question_169.majority_element;

import java.util.Stack;

class Solution {
    public int majorityElement(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();

        // stack can simply substitue with a counter
        for(int i : nums){
            if(stack.empty()) stack.push(i);
            else if(stack.peek()!=i) stack.pop();
            else stack.push(i);
        }
        return stack.peek();
    }
}