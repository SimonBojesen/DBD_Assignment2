package Entity;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;


public class BloomFilter{
    int[] array = new int[1024];

    private int hash1(String str) {
        int total = 0;

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int a = c;
            a = a * a;
            total += a;
        }
        return total % 1024;
    }

    private int hash2(String str) {
        int total = 0;

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int a = c;
            a = a^3 + 5;
            total += a;
        }
        return total % 1024;
    }

    private int hash3(String str) {
        int total = 0;

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int a = c;
            a = (a + 5) * a;
            total += a;
        }
        return total % 1024;
    }

    public void add(String str){
        int hashed1 = hash1(str);
        int hashed2 = hash2(str);
        int hashed3 = hash3(str);
        array[hashed1] = 1;
        array[hashed2] = 1;
        array[hashed3] = 1;
    }

    public boolean check(String str){
        int hashed1 = hash1(str);
        int hashed2 = hash2(str);
        int hashed3 = hash3(str);
        return array[hashed1] == 1 && array[hashed2] == 1 && array[hashed3] == 1;
    }
}