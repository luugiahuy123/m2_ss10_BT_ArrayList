package ss10.BT.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list= new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list.get(1));
    }
}
