package org.example.untitled;

public class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int [] arr = new int [n];
        int type1 = fruits[0];
        int type2 = -1;
        int cnt1 = 0, cnt2 = 0;
        int ans = 0;
        for(int i = 0 , j = 0; i < n ; i++){
            if(fruits[i] == type1){
                cnt1++;
            }else if(type2 == -1){
                type2 = fruits[i];
                cnt2++;
            }else if(fruits[i] == type2){
                cnt2++;
            }else{
                while(j < i && (cnt1 > 0 && cnt2 > 0)){
                    if(fruits[j] == type1){
                        cnt1--;
                    }else if(fruits[j] == type2){
                        cnt2--;
                    }
                    j++;
                }
                if(cnt1 == 0){
                    type1 = fruits[i];
                    cnt1++;
                }
                if(cnt2 == 0){
                    type2 = fruits[i];
                    cnt2++;
                }
            }
            // cout<<cnt
            ans = Math.max(ans,cnt1 + cnt2);
        }
        return ans;
    }
}
