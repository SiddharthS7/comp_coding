class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res=merge(nums1,nums2);
        int mid=res.length/2;
        double median=0.0;
        
        int l=res.length;
        if(l%2==1)
            median = res[mid];
        else{
            median = (res[mid] + res[mid-1])/2.0;
        }
        return median;
    }
    
    public static int[] merge(int[] nums1, int[] nums2){
        int n1l=nums1.length;
        int n2l=nums2.length;
        
        int[] res=new int[n1l+n2l];
        int i=0,j=0,k=0;
        
        while(i<n1l && j<n2l){
            if(nums1[i] < nums2[j])
                res[k++]=nums1[i++];
            else
                res[k++]=nums2[j++];
        }
        
        while(i<n1l){
            res[k++]=nums1[i++];
        }
        
        while(j<n2l){
            res[k++]=nums2[j++];
        }
        
        return res;
    }
}
