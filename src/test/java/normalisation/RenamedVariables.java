package normalisation;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/**
 * This is a test class which acts as a base file for all the normalisation features to be tested on
 */
public class TestClass {


    /*  hello  */


    /*

     */
    static final int qqqqq = 0;
    static Map<String,Long> wwwwww = new HashMap<>();
    final String eeeeeeeeeeeee = "blah blah";
    boolean rrrr;


    public static void main(String[] tt) {
        cat("hbjjhbhjb",5);
        dog(null);
    }


    /**
     * Cat procedure abcd abcd
     * @param y
     * @param uuuuuuuuuuuuu
     */
    static public void cat(String y, int uuuuuuuuuuuuu){
        System.out.println(y+ " " + uuuuuuuuuuuuu);
        for (char c : y.toCharArray()) {
            System.out.println(c);
        }
    }

    /**
     * Dog function blah blah
     * @param iiiiiiii
     * @return
     */
    static boolean dog(Map<String,Integer> iiiiiiii){
        final AtomicInteger oooooooo = new AtomicInteger();

        iiiiiiii.keySet().forEach(new Consumer<String>() {
            @Override
            public void accept(String x) {
                oooooooo.addAndGet(iiiiiiii.get(x));
            }
        });

        iiiiiiii.keySet().forEach(x -> oooooooo.addAndGet(iiiiiiii.get(x)));


        iiiiiiii.keySet().forEach(x -> {
            oooooooo.addAndGet(iiiiiiii.get(x));
        });

        iiiiiiii.keySet().stream().map(x -> {
            return oooooooo.addAndGet(iiiiiiii.get(x));
        });

        return false;
    }

    /**
     * Elephant method zzzz zzzz
     * @return
     */
    private ArrayList<Double> elephant(){
        LinkedList<Double> ppppppppppppppppp = new LinkedList<>();
        ppppppppppppppppp.add(5d);
        ppppppppppppppppp.add(-1000d);
        ppppppppppppppppp.remove();
        for (Double aDouble : ppppppppppppppppp) {
            System.out.println(aDouble);
        }

        return new ArrayList<>(ppppppppppppppppp);
    }

    /**
     * Method to ensure bracket matching is resistant to strings containing brackets
     */
    protected void brackets(){
        String aaa = "{{()}{{{";

    }

    // bcdkscd cdsjcd cdscdc -
    void t(){
    }

}
