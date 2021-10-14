package question_279.perfect_square;

/**
 * <i><h1>Perfect Square</h1></i>
 * <p>Given an integer n, return the least number of perfect square numbers that sum to n.</p>
 *
 * <small>A perfect square is an integer that is the square of an integer
 * in other words, it is the product of some integer with itself.
 * For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.</small>
 *
 * @see <a href="https://leetcode.com/problems/perfect-squares">
 *     https://leetcode.com/problems/perfect-squares</a>
 */

class Solution {
    private static int[] array = new int[10000];
    static{
        for(int i=0; i<10000; i++){
            if(Math.pow(i+1, 0.5)==Math.round(Math.pow(i+1, 0.5))){
                array[i] = 1;
            }
        }
    }

    public int numSquares(int n) {
        if(array[n-1]!=0) return array[n-1];
        else return setArray(n-1);
    }

    public int setArray(int n){
        if(array[n]!=0) return array[n];
        else {
            int min = 10000;
            int temp = 0;
            for(int i=0; i<n; i++){
                temp = setArray(i)+setArray(n-1-i);
                if(min>temp){
                    min = temp;
                }
            }
            array[n] = min;
            return min;
        }
    }
}
