package normalisation;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;


public class TestClass {

    static final int foo = 0;
    static Map<String,Long> bar = new HashMap<>();
    final String pop = "blah blah";
    boolean dolphin;


    public static void main(String[] args) {
            cat("hbjjhbhjb",5);
            dog(null);
    }



    static public void cat(String hat, int j){
        System.out.println(hat+ " " + j);
        for (char c : hat.toCharArray()) {
            System.out.println(c);
        }
    }


    static boolean dog(Map<String,Integer> l){
        final AtomicInteger sum = new AtomicInteger();

        l.keySet().forEach(new Consumer<String>() {
            @Override
            public void accept(String x) {
                sum.addAndGet(l.get(x));
            }
        });

        l.keySet().forEach(x -> sum.addAndGet(l.get(x)));


        l.keySet().forEach(x -> {
            sum.addAndGet(l.get(x));
        });

        l.keySet().stream().map(x -> {
            return sum.addAndGet(l.get(x));
        });

        return false;
    }


    private ArrayList<Double> elephant(){
        LinkedList<Double> o = new LinkedList<>();
        o.add(5d);
        o.add(-1000d);
        o.remove();
        for (Double aDouble : o) {
            System.out.println(aDouble);
        }

        return new ArrayList<>(o);
    }


    protected void brackets(){
        String brackets = "{{()}{{{";

    }

    void t(){
    }

}
