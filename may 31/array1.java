package LabTest;

 
import java.util.*;  



class array11{  
   public static void main(String args[]){  
      ArrayList<String> list=new ArrayList<String>();  
      list.add("Emp1");
      list.add("Emp2");
      list.add("Emp3");
      list.add("Emp4");
      list.add("Emp5");
      
  
      
      System.out.println(list);
  
     
      list.add(4, "EMp7");
      
      System.out.println(list);
      list.set(2, "EMp6");
      System.out.println(list);
      list.clear();
   }  
}
