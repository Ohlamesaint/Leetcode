package question_279.perfect_square;


/**
 * <h2>Time complexity: O(n*sqrt(n))</h2>
 * <h2>Space complexity: O(n)</h2>
 * <small>beats 97.07%</small>
 * <p> </p>
 * @see <a href="https://leetcode.com/problems/perfect-squares/discuss/71495/An-easy-understanding-DP-solution-in-Java">
 *     https://leetcode.com/problems/perfect-squares/discuss/71495/An-easy-understanding-DP-solution-in-Java</a>
 */

class BestSolution {
    private static int[] array = new int[10000];
    static{
        for(int i=0; i<10000; i++){
            if(Math.pow(i+1, 0.5)==Math.round(Math.pow(i+1, 0.5))){
                array[i] = 1;
            } else {
                array[i] = 10000;
            }
        }
    }

    public int numSquares(int n) {
        if(array[n-1]==10000){
            for(int i=0; i<n; i++){
                if(array[i]==10000){
                    for(int j=1; j*j<=i; j++){
                        array[i] = Math.min(array[i], array[i-j*j]+1);
                    }
                }
            }
        }
        return array[n-1];
    }

}
