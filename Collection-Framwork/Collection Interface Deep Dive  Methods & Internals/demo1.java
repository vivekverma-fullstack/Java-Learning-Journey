import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class demo1{
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);

        // size()
        // System.out.println(c.size());   //3

        //isEmpty
        // System.out.println(c.isEmpty());   //false

        // boolean contains(Object o)   --> 1, 2, 3 --> equals()
        // System.out.println(c.contains(2));  //true
        
        // iterate()  --> iterator

        // object toArray()
        // Object[] obj = c.toArray();
        // for(Object o : obj){
        //     System.out.println(o);
        // }

        // T[] toArray(T[] a)
        // Integer[] arr = new Integer[0];
        // Integer[] s = c.toArray(new Integer[0]);
        // for(Integer n : s){
        //     System.out.println(n);
        // }

        //boolean add(E a)
        // boolean b = c.add(4);
        // System.out.println(b);  //true

        // boolean remove(object obj)
        // System.out.println(c.remove(2));   //true --> 1, 3

        //boolean addAll(Collection<? extends E> c)
        // c.addAll(List.of(1,2,3,4,5));
        // System.out.println(c);

        // boolean containsAll(Collection<?> c)
        // System.out.println(c.containsAll(List.of(1,2,3)));  //true
        // System.out.println(c.containsAll(List.of(4,5,6)));  //false

        // boolean removeAll(Collection<?> c)
        //System.out.println(c.removeAll(List.of(2,3)));   //true
        //System.out.println(c);

        // boolean retainAll(Collection <?> c)
        // System.out.println(c.retainAll(List.of(1,3)));
        // System.out.println(c);
        
        // clear()
        // c.clear();
        // System.out.println(c);    //Empty-->[]

        // equals(), hashCode()   ---> Override

    } 
}