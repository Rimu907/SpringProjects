package nc;
import java.util.ArrayList;
import java.util.LinkedList;

class jz6{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        ArrayList<Object> list = new ArrayList<>();
        for (Integer i : linkedList) {
            list.add(0,i);
        }
        System.out.println(list);
    }
}