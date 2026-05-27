public class MethodsHomeWork_08 {

    public static String insertFrom(String s, int index, String ins){
        StringBuilder sb = new StringBuilder(s);
        sb.insert(index,ins);
        return sb.toString();

    }

    /*

          012345678910
     s-> "Hello world"  sb-> "Hello my world"
     ins- > "my "
     index -> 6

     result str -> "Hello my world" to return

     */





    public static void printLastReverse1(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String st  = sb.toString();
        printCapitals(st);

    }


    public static void printLastReverse(String s){
        String[] ar = s.split(" ");
        for (int i = ar.length-1; i>=0; i--){
            int len = ar[i].length();
            System.out.println(ar[i].charAt(len-1));
        }
        System.out.println();
    }
    public static void printCapitals(String s){
        String[] ar = s.split(" ");
        for (String st: ar){
            System.out.print(st.charAt(0));
        }
        System.out.println();
    }
/*
        s-> "Hello Course QA 84"
                                  --i
                0      1      2    3
        ar->  [Hello][Course][QA][84]-> "84 AQ esruoC olleH"
        output:
        01
       "84" 2-1=1
        01
       "QA"2-1=1
       012345
      "Course"6-1=5
       01234
      "Hello"5-1=4

        "4Aeo"



 */
}






