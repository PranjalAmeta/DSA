public class basic{
    
    public static int getIth(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){ //dont write ==1 here. eg-00001000 = 8 != 1 
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIth(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;
    }

    public static int clearIth(int n,int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }

    public static int updateIth(int n,int i,int newbit){
        /*if(newbit==0){
            return clearIth(n,i);
        }else{
            return setIth(n,i);
        }*/

        n=clearIth(n,i);
        int bitmask=newbit<<i;
        return n | bitmask;
    }

    public static int clearLast(int n,int i){
        int bitmask= ~0<<i;
        return n & bitmask;
    }
    public static void main(String args[]){
        /*bitwise or
        System.out.println(5 | 6);

        //bitwise and
        System.out.println(5 & 6);

        //bitwise XOR
        System.out.println(5 ^ 6);

        //bitwise 1's complement 
        System.out.println(~4);

        //bitwise left shift
        System.out.println(6<<2);

        //bitwise right shift
        System.out.print(6>>3);
        */

        //Get ith
        //System.out.print(getIth(10,3));

        //set ith
        //System.out.print(setIth(9,2));

        //clear ith
        //System.out.print(clearIth(10,1));

        //update ith
        //System.out.print(updateIth(10,0,1));

        //clear last ith
        System.out.print(clearLast(15,2));
    }
}