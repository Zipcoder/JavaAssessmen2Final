package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

/*




Ensure 100% success in the test class, WuTangConcatenatorTest.
 Create a class WuTangConcatenator which uses a composite Integer to identify divisibility.  Multiples of 3 are considered Wu numbers.
 Multiples of 5 are considered Tang numbers.
 Multiples of 3 and 5 are considered WuTang numbers.

 */
public class WuTangConcatenator {
    /*
    A composite number is a positive integer that can be formed by multiplying together
    two smaller positive integers. Equivalently, it is a positive integer
     that has at least one divisor other than 1 a
     */
    private Integer divisor;
    // private Integer numbersWu; /*multiples of 3*/
    // private Integer numbersTang; /* multiples of 5*/
    // private ArrayList<Integer> numbersWuTang; /*list of both wu and tang numbers;


    public WuTangConcatenator(Integer divisor) {
        this.divisor = divisor;
    }

    public boolean isWu() {
        if ((this.divisor % 3) == 0) {
            return true;
        }
        return false;
    }

    public boolean isTang() {
        if (this.divisor % 5 == 0) {
            return true;
        }
        return false;
    }

    public boolean isWuTang() {
        if (this.divisor % 15 == 0) {
            return true;
        }
        return false;
    }
}
