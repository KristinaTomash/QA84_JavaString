public class MainStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        System.out.println(sb);

        sb.delete(2,6);
        System.out.println(sb);

        sb.insert(2,"llo ");
        System.out.println(sb);

        sb.insert(0,"Hi, ");
        System.out.println(sb);

        sb.replace(0,2,"Bye");
        System.out.println(sb);

        //sb.delete(2,sb.length());
        //System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        String st = "Hello course";
        StringBuilder sbl = new StringBuilder(st);
        //sbl->"Hello course"
        sbl.reverse();
        //System.out.println(sbl);
        st = sbl.toString();
        System.out.println(st);
        boolean res = isPalindrome("l eveL");
        System.out.println(res);
    }
    public static boolean isPalindrome(String s){
        // s= s.trim();
       // s = s.toLowerCase();
        s = s.replace(" ","");
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        return s.equalsIgnoreCase(rev);
    }
    /*
    s -> "level" sb-> "level"-> rev-> "level"


     */
}
/*
       012345678910                     immutable    mutable
sb -> "Hi, Hello world" -> "Hello world"

 "hello" s = s.toUpperCase()  s-> "HELLO"


 */


