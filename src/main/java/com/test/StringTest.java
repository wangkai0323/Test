package com.test;

/**
 * Created by aries on 3/18/14.
 */
public class StringTest {

    public static void main(String[] args) {
       new StringTest().hashCode("1111111111111111111a1111");
    }

    public int hashCode(String s) {
        int hash;
        int h = 0;
        int len = s.length();
        if (h == 0 && len > 0) {
            int off = 0;
            char val[] = s.toCharArray();

            for (int i = 0; i < len; i++) {
                System.out.println(off);
                System.out.println(val[off]);
                h = 31*h + val[off++];
                System.out.println(h);
            }
            hash = h;
            System.out.println(hash);
        }
        return h;
    }
}
