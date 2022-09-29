//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int z=0,o=0,t=0;
        for(int i:a) {
            if(i==0)z++;
            if(i==1)o++;
            if(i==2)t++;
        }
        int k=0;
        for(int i=0;i<z;i++)a[k++]=0;
        for(int i=0;i<o;i++)a[k++]=1;
        for(int i=0;i<t;i++)a[k++]=2;
    }
}
