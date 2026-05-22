public class MainStringMethodsLesson10 {

    public static void main(String[] args) {
        //
        String s = " hello world   ";
        //s = "bye";
        //immutable - неизменяемый
        s = s.toUpperCase();
        //s=s.toUpperCase();альтернатива -> String s1 = s.toUpperCase();
        System.out.println(s);

        s= s.toLowerCase();
        System.out.println(s);
        s = s.replace("ll","tl");
        System.out.println(s);

        s = s.trim();
        System.out.println(s);
        //s.strip();-> new same s.trim()

        // 012345678910
        //"hetlo world"
       String s1 = s.substring(6);
        System.out.println(s1);
        s1 = s.substring(3,7);
        System.out.println(s1);

        s = "Hello course QA";
        String[] ar = s.split(" ");
        //         0        1       2
        //ar-> ["Hello"]["course"]["QA"]
        for (String st: ar){
            System.out.println(st);
        }
        String s4 = "hello world";
        char[] ar1 = s4.toCharArray();
        //['h']['e']['l']['l'][][]...........['d']
        for (char sym: ar1){
            System.out.print(sym + " ");
        }
        String s5 = "bye";
        boolean res  = s5.equals("Bye");
        System.out.println(res);
        res = s5.equalsIgnoreCase("BYE");
        System.out.println(res);

    }
}
/*
         01234
      s->"hello"   "bye"  "BYE"
        "hetto"

 */
