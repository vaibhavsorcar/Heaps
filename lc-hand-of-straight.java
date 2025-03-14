class Solution {
    public boolean func(int[] hands, int groupSize, int i, int n){
        int f = hands[i] +1;
        hands[i] = -1;
        int cnt = 1;
        i+=1;
        while(i < n && cnt < groupSize){
        if(hands[i] == f){
            f = hands[i] +1;
            hands[i] = -1;
            cnt++;
        }
        i++;
    }
    if(cnt!=groupSize)
    return false;
    else
    return true;
}
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n % groupSize != 0)
        return false;
        Arrays.sort(hand);
        int i = 0;
        for(; i < n ; i++){
            if(hand[i] >=0 ){
                if(!func(hand, groupSize, i , n)){
                    return false;
                }
            }
        }
        return true;
    }
}
