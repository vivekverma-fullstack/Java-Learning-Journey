import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Demo1{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        // l.add(2);

        // get(index)
        // System.out.println(l.get(2));      //3
        
        // set(index, E value)
        // l.set(1, 5);
        // System.out.println(l);       //1 5 3

        // add(index, E value)
        // l.add(1, 6);
        // System.out.println(l);   //1 6 2 3

        // boolean addAll(index, Collection<? extends E>)
        // System.out.println(l.addAll(2,List.of(5,6,6)));
        // System.out.println(l);                //1 2 5 6 6 3

        //remove()
        // l.remove(2);
        // System.out.println(l);   // 1 2
        
        // indexOf(Object o)
        //System.out.println(l.indexOf(3));  //2
        // lastIndexOf(Object o)
        //System.out.println(l.lastIndexOf(2));     //last index of 2 ----> 3

        // ListIterator<Integer> it = l.listIterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());       // 1 2 3 
        // }/

        // ListIterator<Integer> it = l.listIterator(3);
        // while (it.hasPrevious()) {
        //     System.out.println(it.previous());      // 3 2 1 
        // }

        List<Integer> li = List.of(1,2,3,4,5,6,7,8);
        // System.out.println(li);
        // li.add(10);
        // System.out.println(li);  //Error
        List<Integer> li2 = List.copyOf(li);
        li2.add(105);
        System.out.println(li2);
    }
}