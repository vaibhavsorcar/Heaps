class solution  {
  public static int rod(int prices[]) {
    int n = prices.length;
    int dp[] = new int[n+1];
    for(int i = 1; i <= n; i++) {
    for(int j = 1; i <= i; j++) {
      dp[i] = Math.max(dp[i], prices[j-1] + dp[i-j]);
      }
    }
    return dp[n];
  }
}
  
