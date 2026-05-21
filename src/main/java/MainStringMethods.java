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
