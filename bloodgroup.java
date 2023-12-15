
    import java.util.*;
public class bloodgroup{
   public static void main(String ...sdfg){

    HashMap<String,Integer> map=new HashMap<>();
    int max=0;
    String[] a={"A","AB","O","AB","O","AB","B","AB","O}"};
    for(int i =0;i<a.length;i++){
        map.put(a[i],map.getOrDefault(a[i],0)+1);
    }
    for(int i:map.keySet()){
        if(map.get(i)>a.length/2){
            System.out.println("The Majority ELemtnt is :"+i);       
         }
    }
   }}

    
