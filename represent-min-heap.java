class Solution {
    public boolean countSub(long arr[], long n)
        return trav(arr,0);

    public static long left(long i){return (2*i)+1;}
    public static long right(long i){return (2*i)+2;}
    public boolean trav(long arr[],long n){
        if(n>=arr.length)return true;
        long left=left(n);
        long right=right(n);
        
        if(left<arr.length){
            if(arr[(int)n]<arr[(int)left])return false;
        }
        if(right<arr.length){
            if(arr[(int)n]<arr[(int)left])return false;
        }
        return trav(arr,left)&&trav(arr,right);
    }
}
