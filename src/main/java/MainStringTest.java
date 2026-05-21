public class MainStringTest {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("hello");
        String s3 = "Hello";
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        printStrColumn("performance");
    }

    public static void printStrColumn(String s)
    {
        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }


    /*      i++
          01234             01234
    s1->["Hello"]     s2->["hello"]
    s3->["Hello"]


    h
    e
    l
    l
    o




     */
}
