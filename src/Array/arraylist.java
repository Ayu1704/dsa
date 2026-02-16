import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//syntax-
        ArrayList<Integer> list = new ArrayList<>(10);  //INITIAL CAPACITY IS default size
//        list.add(67);
//        list.add(674);
//        list.add(6700);
//        list.add(267);
//        list.add(607);
//        System.out.println(list);
//        list.set(2,567);
//        list.remove(4);
//        System.out.println(list);
//        System.out.println(list.contains(674));

//input
for (int i=0;i<5;i++){
    list.add(sc.nextInt());
}
// get item at any index
        for(int i =0 ; i < 5 ; i++){
            System.out.println(list.get(i)); // pass index here
        }
        System.out.println(list);

    }
}
