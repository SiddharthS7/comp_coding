//https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1

class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i:arr) {
            if(i<0) {
                neg.add(i);
            }else{
                pos.add(i);
            }
        }
        int i=0,j=0,k=0;
        while(i<pos.size() && j<neg.size()) {
            arr[k++]=pos.get(i++);
            arr[k++]=neg.get(j++);
        }
        while(i<pos.size()) {
            arr[k++]=pos.get(i++);
        }
        while(j<neg.size()) {
            arr[k++]=neg.get(j++);
        }
    }
}
