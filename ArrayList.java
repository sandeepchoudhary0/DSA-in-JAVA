import java.util.*;
public class main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList(Arrays.asList(13,12,12));
        System.out.println(ar);
        //Insertion
        ar.add(2,3);
        System.out.println(ar);
        //Accessing
        System.out.println(ar.get(0));
        System.out.println(ar.get(1));
        //Traversing
        for (int i = 0; i <ar.size(); i++) {
            System.out.println( ar.get(i));
        ArrayList<String> stringlist = new ArrayList<String>(Arrays.asList("A","B","C","D"));
        for(String letters:stringlist){
            if (letters.equals()) {
                System.out.println("It is present in the LIST");
                break;
                
            }
        }
            
    int index =stringList.indexOf("F");
    System.out.println("The element in found at index: " + index); 
        }
    }
}



