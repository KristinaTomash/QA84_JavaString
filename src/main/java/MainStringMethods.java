public class MainStringMethods {
    public static void main(String[] args) {
        //          01234
        String s = "hello";
        boolean res = s.contains("llo");
        System.out.println(res);

        int i =  s.indexOf("llo");
        System.out.println("i = " + i);

        i = s.lastIndexOf("l");
        System.out.println("i = " + i);

        s ="";
        res = s.isBlank();//or empty or only space or Tab
        System.out.println(res);

        res = s.isEmpty();//Only empty -> s =""; not NULL
        System.out.println(res);
        // 12
        int n = Integer.parseInt("12");
        // "12"
        String st = String.valueOf(12);

       int count =  findChar("hello world",' ');
        System.out.println("Count = " + count);
        res = isPalindrome("level");
        if (res == true)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }

    public static boolean isPalindrome(String str){
        for (int i = 0, j = str.length()-1; i < j; i++, j--){
            char ci = str.charAt(i);
            char cj = str.charAt(j);
            if (ci != cj)
                return false;
        }
        return true;
    }
    /*
              i++
           012345     str.length()= 6
   str->  "levvel"  "kazak"  "anna"
             j--
    i = 3 j =  2 ci = 'v' cj = 'v'


     */
    public static int findChar(String str,char sym){
        int count = 0;
        for (int i = 0;i < str.length(); i++){
            char curr = str.charAt(i);
            if (curr == sym)
                count ++;
        }
        return count;
    }
    /*
                 i++
            01234                  str lenght() = > 5
    srt -> "hello"      sym "l"    return 2

    i = 5   count = 2  sym = 'l'  curr = 'o'

     */
}
/*
                HW
       1.
       public static void printCharIndex(String str, char sym)
               012345678910
       str  = "hello world" sum = 'l'
       output:
       2 3 9


       2.try to write isPalindrome()

       3.advanced

       Write a function that gets two string and return the index where the 2nd string begins.
       For example the function will get 2 strings: “abcdefgh” and “def” and will return 3 since “def” is inside “abcdefgh”
       and begins in index 3.

            DON’T USE PYTHON BUILT IN FUNCTIONS:

                substring_index(str a, str b);

                    { }

    public static int substringIndex(String s, String sub)
          01234567
    s =  “abcdefgh”       sub = “def”

    return 3 if nit exists return -1




 */

