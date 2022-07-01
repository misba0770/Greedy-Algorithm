class Solution {

    public static long maximizeSum(long a[], int n, int k)
    {
        // Your code goes here   
        Arrays.sort(a);
        long sum=0;
        int i=0;
        while(k>0&&i<n){
            if(a[i]>=0)break;
            a[i]=-1*a[i];
            i++;
            k--;
        }
        if(k>0){
            Arrays.sort(a);
            a[0]*=Math.pow(-1,k);
        }
        for( i=0;i<n;i++)sum+=a[i];
        return sum;
    }
}
