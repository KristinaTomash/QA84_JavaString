public class MethodsString_HomeWork_6 {

    public static int substringIndex(String s, String sub){
        return s.indexOf(sub);

    }
    /*       i++
          01234567               012
    s =  “abcdefgh”       sub = “def”

    return 3 if nit exists return -1

     */


    public static void printCharIndex(String str, char sym){
       for (int i = 0; i< str.length();i++){
           char curr = str.charAt(i);
           if (curr ==sym)
               System.out.print(i + " ");
       }
        System.out.println();
    }
}
/*
          i++
        012345678910
str -> "hello world"     sym = 'l'






 */
