package demo;



import java.util.*;  
import java.util.stream.Collectors;  
  
public class Test {  
    public static void main(String[] args) {  
        List<Integer> productsList = new ArrayList<>();  
        //Adding Products  
        productsList.add(1);  
        productsList.add(2);  
        productsList.add(3);  
        productsList.add(4);  
        productsList.add(5);  
        List<Integer> pricesList =  productsList.stream()  
                    .filter(p -> p > 3).collect(Collectors.toList());  
        System.out.println(pricesList);  
    }  
}  