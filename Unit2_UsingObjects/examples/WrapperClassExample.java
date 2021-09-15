package Unit2_UsingObjects.examples;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class WrapperClassExample {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        //creates a wrapped int
        Integer wrappedInt = new Integer(7);

        int insideValue = wrappedInt.intValue();
        System.out.println(insideValue);

        //BETTER WAY
        //SAME THING AS
        //Integer wrappedInt = new Integer(7);
        Integer newWrappedInt = 8;
        System.out.println(newWrappedInt);

        Double wrappedDouble = 5.56245556;
        System.out.println(wrappedDouble);

        //print the min/max Integer (int) value
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println(minValue);
        System.out.println(maxValue);
    }
}
