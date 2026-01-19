package StramApiQuestions;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOfNumN {

    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1=List.of(12,15,5,18,20,16,10,22);

        //Multiple of 5

        List<Integer> mulOfFive=list1.stream().filter(i -> i%5==0).toList();
        System.out.println("Multiple of Five : "+mulOfFive);

        //Sorted order
        List<Integer> list2=new ArrayList<>();
        list2=List.of(12,15,5,18,20,16,10,22);

        List<Integer> mulOfFive2=list2.stream().sorted().filter(i -> i%5==0).toList();
        System.out.println("sorted order : "+mulOfFive2);

        //ReveredOrder
        List<Integer> list3=new ArrayList<>();
        list3=List.of(12,15,5,18,20,16,10,22);

        List<Integer> mulOfFive1=list3.stream().filter(i -> i%5==0).toList().reversed();
        System.out.println("Revered order : "+mulOfFive1);//  this not giving correct resversed order




    }
}
