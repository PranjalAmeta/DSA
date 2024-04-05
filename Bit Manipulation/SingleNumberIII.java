public class SingleNumberIII{
    public static int[] sNumIII(int nums[]){
        int b1=0;
        int b2=0;
        long XOR=0;
        for(int i=0;i<nums.length;i++){
            XOR^=nums[i];
        }
        long rightmost= (XOR & (XOR-1)) ^ XOR;
        for(int i=0;i<nums.length;i++){
            if((nums[i] & rightmost) != 0){
                b1=b1^nums[i];
            }else{
                b2=b2^nums[i];
            }
        }
        return new int[] {b1,b2};
    }
    public static void main(String args[]){
        int arr[]={2,3,2,5,7,13,3,7};
        int ar[]=sNumIII(arr);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}