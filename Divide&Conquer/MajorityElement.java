public class MajorityElement{
    public static int isExist(int arr[]){
        int count=0;
        int el=0;
        // Applying Moore's law
        for(int i=0;i<arr.length;i++){
            if(count==0){
                el=arr[i];
                count+=1;
            }else if(arr[i]==el){
                count++;
            }else{
                count--;
            }
        }
        // Check for Majourity
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==el){
                count++;
            }
        }
        if(count>arr.length/2){
            return el;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={7,7,5,5};
        int element=isExist(arr);
        if(element==-1){
            System.out.print("Majority element doesnt exist");
        }else{
            System.out.print("Majority element is:"+element);
        }
    }
}