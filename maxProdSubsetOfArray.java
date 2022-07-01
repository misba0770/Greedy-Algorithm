class Solution {
    public static int findMaxProduct(int n, int[] arr) {
        // code here
        if(n==1)return arr[0];
        int neg=0;
        int zeroes=0;
        long prod=1;
        long maxNeg=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
            {zeroes++;
            continue;
            }
            if(arr[i]<0){
                neg++;
                maxNeg=Math.max(maxNeg,arr[i]);
            }
           
            prod=(prod*arr[i])%1000000007;
        }
      //  System.out.println(neg+"neg ");
        if(zeroes==n)return 0;
        if(neg%2==1){
            if(neg==1&&zeroes>0&&zeroes+neg==n)return 0;
             //System.out.println(prod);
            prod=prod/maxNeg;
           // System.out.println(prod);
        }
        return (int)prod%1000000007;
    }
}
        
