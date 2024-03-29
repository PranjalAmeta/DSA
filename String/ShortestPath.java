import java.util.*;
public class ShortestPath{
    public static float SP(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            if(dir=='N'){
                y+=1;
            }else if(dir=='S'){
                y-=1;
            }else if(dir=='E'){
                x+=1;
            }else if(dir=='W'){
                x-=1;
            }else{
                return (float)-1.0;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String str="NS";
        float dis=SP(str);
        if(dis==-1.0){
            System.out.print("Enter valid direction.");
        }else{
            System.out.print("Distance="+dis);
        }
    }
}