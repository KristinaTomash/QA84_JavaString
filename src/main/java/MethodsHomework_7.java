public class MethodsHomework_7 {
    public static int getMaxCharIndex(String s){
        return 0;
    }
//    HW -> ADVANCED
    /*
    1.
                 i
        0123456789
    s->"ccbbbdddda"
    return 5

    currChar  =  'a'    maxChar = 'd'
    currCount  =  1     maxCount = 4

    s.indexOf('d')


    2.
    public static void printCapitals(String s)

    s-> "Hello Course QA 84"
    output:
    "HCQ8"

    3.public static void printLastReverse(String s)
        s-> "Hello Course QA 84"
        output:
        "4Aeo"

     4.  ADVANCED *****
     public static String insertFrom(String s, int index, String ins)
          012345678910
     s-> "Hello world"
     ins- > "my "
     index -> 6

     result str -> "Hello my world" to return
     */

    public static boolean isPalindrom(String str){
        if (str == null)
            return false;
        str = str.trim();
        str = str.toLowerCase();
        str = str.replace(" ","");

        for (int i = 0,j = str.length()-1;i < j;i++,j--){
            char ci = str.charAt(i);
            char cj = str.charAt(j);
            if (ci != cj)
                return false;
        }
        return true;
    }



    public static void printSentenceReverse2(String sentence){
        sentence = sentence.trim();
        String[] ar = sentence.split(" ");
        for (int i = ar.length -1;i>=0;i--){
            printStrReverse(ar[i]);
        }
        /*
        sentence -> "Hello course QA 84"
                     --i
               0      1     2   3
        ar->[Hello][course][QA][84]
        48
        AQ
        esruoc
        olleH

         */
    }
    public static void printStrReverse(String s){
        for (int i = s.length()-1; i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
    public static void printSentenceReverse1(String sentence){
        String[] ar = sentence.split(" ");
        for (int i = ar.length-1;i>=0;i--){
            System.out.println(ar[i]);
        }
    }
}
/*
sentence -> "Hello course QA 84"
                                i
               0      1     2   3
        ar->[Hello][course][QA][84]
    output:
    84
    QA
    course
    Hello


 */
