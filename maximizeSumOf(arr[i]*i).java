class Solution{
    
    int Maximize(int arr[], int n)
    {
         Arrays.sort(arr);
        long res = 0;
        int m = (int)1e9+7;
        for(int i = 0;i< arr.length;i++)res = (res + (long)arr[i] * i)%m;
        return (int)res;
        
    }   
}
