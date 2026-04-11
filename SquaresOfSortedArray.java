public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int arr[]={-7,-3,2,3,11};
        int res[]=new int[arr.length];

       int i=0;
       int j=arr.length-1;
       int k=res.length-1;
       while (i<=j) 
        {
                if((arr[i]*arr[i]>(arr[j]*arr[j]))){
                    res[k]=arr[i]*arr[i];
                    i++;
                }else{
                    res[k]=arr[j]*arr[j];
                    j--;
                }
                k--;
            }
       for (int ele : res) {
        System.out.print(ele+" ");
       }

    }
    
}
