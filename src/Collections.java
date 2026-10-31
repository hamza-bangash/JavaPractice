import java.util.*;

public class Collections {

public static void main(String[] args) {

    //List is the interface

    // Decaler of Data type List
    List<Integer> numbers;

    // Array List is the impelementation of List
    // initilize ArrayList
    numbers = new ArrayList<Integer>(10);

    // add method which add at the top
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    // remove method which remove value based on index
    numbers.remove(1);
    numbers.remove(0);

    // this method clear the whole array
    numbers.clear();



    //Decaler List having String
    List<String> words;

    //intilize LinkedList
    words = new LinkedList<String>();
    words.add("Hello");
    words.add("World");


    // Set is   collection which store uniqe value only
    // where we have two type  HastSet and TreeSet
    // Hash set use Hashing to store and retire data using modulse its O(1) mostly
    // Tree set use Red-black tree the value store in sorted way O(log n)

    Set<Integer> numberSet1 ;

    numberSet1 = new HashSet<Integer>();

    Set<Integer> numberSet2 ;

    numberSet2 = new TreeSet<>();



    //Map Stores data as key-value pairs. Keys must be unique, values can be duplicated. {key=value , key2=value2 , key3=value3}
    // Map has different kind of implementation as well
    // HashMap , LinkedHasMap , TreeMap

    Map<String, Integer> map1;
    Map<String, String> map2;
    Map<Integer, String> map3;

    map1 = new TreeMap<>();
    map2 = new HashMap<>();
    map3 = new LinkedHashMap<>();





}
}
