public class MainStringTasks {

    public static void main(String[] args) {
        printSentenceReverse("Hello course QA");

    }
    public static void printSentenceReverse(String s){
        String[] ar = s.split(" ");
        for (int i = ar.length-1;i >=0;i--){
            System.out.print(ar[i]+" ");
        }
        System.out.println();

    }
    /*
     s-> "Hello course QA"
         i--
         0        1       2
     ["Hello"]["course"]["QA"]-> split

     output:
     "QA course Hello"
     */

    /*
               HW
    #1
    public static void printSentenceReverse1(String sentence)
    sentence -> "Hello course QA 84"
    output:
    84
    QA
    course
    Hello

    #2 advanced
    public static void printSentenceReverse2(String sentence)
    sentence -> "Hello course QA 84"
    48
    AQ
    esruoc
    olleH

    #3 advanced
    public static boolean isPalindrom(String str)
    str -> "Level"

    #4 advanced ***
    public static boolean isPalindrom(String str)
    str -> "Name now one man"

     */
}
