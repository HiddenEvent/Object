package study.ch02;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "a";
        System.out.println("s1 : "+System.identityHashCode(s1));
        s1 = s1 + "c";
        System.out.println("s1 : "+System.identityHashCode(s1));

        String s2 = "b";
        System.out.println("s2 : "+System.identityHashCode(s2));
        s2 = s2 + "c";
        System.out.println("s2 : "+System.identityHashCode(s2));


        StringBuilder sb = new StringBuilder("a");
        System.out.println(sb);
        sb.append("b");
        System.out.println(sb);


    }
}

