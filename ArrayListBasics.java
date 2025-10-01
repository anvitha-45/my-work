import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Enumeration;
public class ArrayListBasics {
    public static void main(String args[]){
        //Creating an ArrayList => ArrayList<Type> arrList = new ArrayList<>();
        ArrayList<String> player=new ArrayList<>();
        //Adding elements to ArrayList => arrListObject.add(index, element);
        player.add("alice");
        player.add("bob");
        player.add(1,"ena");
        System.out.println("Names of the Players : "+player);
        //Accessing an element from ArrayList => arrListObject.get(index);
        String res=player.get(2);        
        System.out.println("Accessing element using get() method : "+res);
        //Modifying elements in ArrayList => arrListobject.set(index,element);
        player.set(1,"jay");
        System.out.println("Modified ArrayList using set() method : "+player);
        /*Removing elements from the arrayList => 
        arrListObject.remove(index); (or) arrListObject.remove(E element);*/
        player.remove("jay");
        System.out.println("Removed a player using remove(value) name : "+player);
        player.remove(0);
        System.out.println("Removed a player using remove(index) position : "+player);
        //Completely removes all the elements from ArrayList => arrListObj.clear();
        player.clear();
        System.out.println("Removed all the players using clear() method : "+player);
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("elements : "+arr);
        //Removing element by index
        arr.remove(4);
        System.out.println("Removed ele using remove(index) : "+arr);
        //Removing element by element 
        arr.remove((Integer)3);
        System.out.println("Removed ele using remove((wrapperclass)value) : "+arr);
        //Size of ArrayList => arrListObj.size();
        System.out.println("Size of the ArrayList : "+arr.size());
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        System.out.println("ArrayList1 : "+arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(6);
        arr2.add(7);
        arr2.add(8);
        arr2.add(9);
        arr2.add(10);
        System.out.println("ArrayList2 : "+arr2);
        //Concatination of ArrayLists => arrListObj1.addAll(arrListObj2);
        arr1.addAll(arr2);
        System.out.println("After concatenation ArrayList1 : "+arr1);
        //ArrayList slicing => arrListobj.subList(startIndex,endIndex);
        System.out.println("Elements : "+arr1);
        System.out.println("sliced elements : "+arr1.subList(1,4));
        //Converting array to ArrayList => Arrays.isList(arrObj);
        System.out.println("Converting Array to ArrayList");
        Integer[] num={1,2,3,4,5};
        System.out.println("Array : "+Arrays.toString(num));
        System.out.println("Before converting to arrayList : "+num.getClass().getSimpleName());
        ArrayList<Integer> numal=new ArrayList<>(Arrays.asList(num));
        System.out.println("ArrayList : "+numal);
        System.out.println("After converting into ArrayList : "+numal.getClass().getSimpleName());
        //Converting ArrayList to array => arrayListobj.toArray(arrObj);
        System.out.println("Converting arrayList to Array");
        System.out.println("ArraList : "+arr);
        System.out.println("Before converting to Array : "+arr.getClass().getSimpleName());
        Integer[] num2=new Integer[arr.size()];
        arr.toArray(num2);
        System.out.println("Array : "+Arrays.toString(num2));
        System.out.println("After converting to Array : "+num2.getClass().getSimpleName());
        //Contain elements or not => arrListObj.Contains(E element);
        System.out.println("Element 4 contains or not : "+arr1.contains((Integer)4));
        //Finding index of an element => arrListObj.indexOf(obj);
        System.out.println("ArrayList : "+arr1);
        System.out.println("Index of element 4 in ArrayList : "+arr1.indexOf((Integer)4));
        //Frequency of an element => Collections.frequency(arrListobj,value);
        System.out.println("Frequncy of 4 : "+Collections.frequency(arr1,(Integer)4));
        ArrayList<Integer> arr4=new ArrayList<>();
        arr4.add(4);
        arr4.add(2);
        arr4.add(34);
        arr4.add(23);
        arr4.add(12);
        arr4.add(341);
        arr4.add(34);
        //Sorting => Collections.sort(arrListObj);
        Collections.sort(arr4);
        System.out.println("Ascending order : "+arr4);
        Collections.sort(arr4,Collections.reverseOrder());
        System.out.println("Descending order : "+arr4);
        //arrListObj.isEmpty()
        System.out.println("ArrayList is empty or not : "+arr1.isEmpty());
        //Removing elements b/w two indices => arrListObj.removeIf(condition);
        arr4.removeIf(n->n%2==0);
        System.out.println("After Removing elements from inde 2 to 5 : "+arr4);
        ArrayList<Integer> alist=new ArrayList<>();
        alist.addAll(arr1);
        //Accessing elements of an ArrayList 
        //Method 1 : Using for loop
        System.out.println("Accessing elements of ArrayList using for loop");
        for(int i=0;i<alist.size();i++){
            System.out.println(alist.get(i));
        }
        //Method 2 : Using for each loop
        System.out.println("Accessing elements of ArrayList using for each loop");
        for(int n : alist){
            System.out.println(n);
        }
        //Method 3 : Using  Iterator
        System.out.println("Accessing elements using Iterator");
        Iterator<Integer> it=alist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Method 4 : Using ListIterator
        System.out.println("Accessing elements using ListIterator");
        ListIterator<Integer> lit=alist.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
        //Method 5 : Using Enumeration
        System.out.println("Accessing elements using Enumeration");
        Enumeration<Integer> e=Collections.enumeration(alist);
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
