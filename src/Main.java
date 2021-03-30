import Entity.BloomFilter;

public class Main {
    public static void main(String[] args) {
        String str1 = "hej med dig";
        String str2 = "1234";

        BloomFilter bf = new BloomFilter();
        bf.add(str1);

        System.out.println(bf.check(str1));
        System.out.println(bf.check(str2));
    }
}
