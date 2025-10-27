package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Stream<Integer> stream = list.stream();
        System.out.println(stream.count());

        list.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
        list.stream().filter(x->x%2==0).distinct().forEach(x->System.out.println(x));
        list.stream().filter(x->x%2==0).distinct().sorted().forEach(x->System.out.println(x));
        list.stream().filter(x->x%2==0).distinct().sorted().map(x->x*2).forEach(x->System.out.println(x));
        int sum = list.stream().filter(x->x%2==0).distinct().sorted().map(x->x*2).reduce(1,(a,b)->a+b);//here in reduce 1 is the initial value of sum
        System.out.println(sum);

        List<Integer> reslist = list.stream().filter(x->x%2==0).distinct().sorted().map(x->x*2).collect(Collectors.toList());
        System.out.println(reslist);
    }
}
