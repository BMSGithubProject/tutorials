package com.bms.loops;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class InfiniteLoops {

    public void infiniteLoopUsingWhile() {
        while (true) {
            System.out.println("Infinite loop using while");
        }
    }

    public void infiniteLoopUsingFor() {
        for (;;) {
            System.out.println("Infinite loop using for");
        }
    }

    public void infiniteLoopUsingDoWhile() {
        do {
            System.out.println("Infinite loop using do-while");
        } while (true);
    }

}
