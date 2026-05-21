public class MainHomeWork5 {
    public static void main(String[] args) {
        printStrReverse("kristina");

    }
    public static void printStrReverse(String s){

        for (int i = s.length()-1; i >=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
/*

public static void printStrReverse(String s)
s = "hello" to print "olleh"
--i
  01234     length() = 5
"hello"   "olleh"


 */




