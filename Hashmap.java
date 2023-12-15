import java.util.*;
public class Hashmap {
   public static void main(String ...sdfg){
    /*//HashMap<K,V> <Character,Integer> map =new hashMap=<>();
    
   map.put('a',2);//setting corresponding key value
   map.getOrDefault('a',0); // key avialble return value else return 0
   map.KeySet();
   for(char c:map.keySet()){
    System.out.println(c);
    map.get(c);*/
    HashMap<Integer,Integer> map=new HashMap<>();
    int max=0;
    int[] a={1,2,2,1,1,3,5,1,1,1};
    for(int i =0;i<a.length;i++){
        map.put(a[i],map.getOrDefault(a[i],0)+1);
    }
    for(int i:map.keySet()){
        if(map.get(i)>a.length/2){
            System.out.println("The Majority ELemtnt is :"+i);
            return;
        }
    }
   }
}
