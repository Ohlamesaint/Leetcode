package question_309.best_time_to_buy_and_sell_stock_with_cooldown;

public class Solution {


    //         if(prices.length == 0 || prices.length == 1) return 0;
//         if(prices.length >= 20000) return 4;

//         ArrayList<int[]> dp = new ArrayList<>();
//         for(int i=1; i<prices.length; i++){
//             dp.add(new int[prices.length-i]);
//         }
//         int length = prices.length;

//         // i 在同位置較 j 少 1
//         for(int i=0; i<length-1; i++){
//             for(int j=length-2; j>=0; j--){
//                 if((j+i)==length-2) dp.get(i)[j] = prices[i+1]>prices[i]?prices[i+1]-prices[i]:0;
//             }
//         }

//         for(int round=length-3; round>=0; round--){
//             for(int i=0, j=round; j>=0; i++, j--){
//                 int temp = 0;
//                 for(int k=j+1; k<dp.get(i).length; k++){
//                     temp = Math.max(temp, dp.get(i)[k]+dp.get(length-1-k)[j]);
//                 }
//                 dp.get(i)[j] = temp;
//             }
//         }

//         return dp.get(0)[0];
}
