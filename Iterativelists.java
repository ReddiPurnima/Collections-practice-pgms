import java.util.*;
public class Iterativelists{
  public static void main(String[] args){
    List<Integer> a=new ArrayList<>();
    a.add(12);
    a.add(23);
    a.add(12);
    a.add(45);
    System.out.println("using for loop:");
    for(int i=0;i<a.size();i++){
      System.out.println(a.get(i));
    }
    System.out.println("using for each loop:");
    for(Integer s:a){
      System.out.println(s);
    }
    System.out.println("using while loop:");
    int i=0;
    while(i<a.size()){
      System.out.println(a.get(i));
      i++;
    }
    System.out.println("using do while loop:");
    int j=0;
    do{
      System.out.println(a.get(j));
      j++;
    }
      while(j<a.size());{
   }
  }
}