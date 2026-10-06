import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

class Demo1{
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> list = new LinkedList<>();
        // Collection<Integer> list = new HashSet<>();
        // Collection<Integer> list = new ArrayDeque<>();
        Collection<Integer> list = new TreeSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

// 10, 20, 30, 40, 50