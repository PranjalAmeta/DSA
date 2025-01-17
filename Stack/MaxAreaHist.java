import java.util.*;
public class MaxAreaHist {
    public static int[] smallRight(int hist[]){
        Stack<Integer> s=new Stack<>();
        int nsr[]=new int[hist.length];
        nsr[hist.length-1]=hist.length;
        s.push(hist.length-1);
        for(int i=nsr.length-2;i>=0;i--){
            while(!s.isEmpty() && hist[i]<=hist[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=hist.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        return nsr;
    }

    public static int[] smallLeft(int hist[]){
        Stack<Integer> s=new Stack<>();
        int nsl[]=new int[hist.length];
        nsl[0]=-1;
        s.push(0);
        for(int i=0;i<nsl.length;i++){
            while(!s.isEmpty() && hist[i]<=hist[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        return nsl;
    }

    public static int maxArea(int hist[]){
        int nsr[]=smallRight(hist);
        int nsl[]=smallLeft(hist);
        int ans[]=new int[hist.length];
        int maxAr=0;
        for(int i=0;i<ans.length;i++){
            int height=hist[i];
            int width=nsr[i]-nsl[i]-1;
            int ar=height*width;
            maxAr=Math.max(ar,maxAr);
        }
        return maxAr;
    }
    public static void main(String[] args) {
        int hist[]={2,1,5,6,2,3};
        System.out.print(maxArea(hist));
    }
}
