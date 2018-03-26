package wangyi2017;


import java.util.*;

/**
 * @author zenli
 */
public class DengChaShuLie {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i< num; i++){
            list.add(in.nextInt());
        }
        Collections.sort(list);
        int distance = list.get(1) - list.get(0);
        for(int i = 2;i < list.size(); i++){
            if(list.get(i) - list.get(i - 1) != distance) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }
}
