package org.example.string_stringbuilder;

import java.util.Scanner;

public class StringAndStringbuilder {
    public static void main(String[] args) {
        StringAndStringbuilder obj = new StringAndStringbuilder();
        //1.1 System.out.println(obj.concat("hello ", "world" ));
        //1.1 System.out.println(obj.concat1(new StringBuilder("hello "), new StringBuilder("world")));
        //1.2  System.out.println(obj.concat2(1, 2, "hello"));
        //1.2 System.out.println(obj.concat3(1, 2, new StringBuilder("hello")));
        //1.3 System.out.println(obj.concat4("1", 2, "hello"));
        //1.3 System.out.println(obj.concat5(new StringBuilder("1"), 2, new StringBuilder("hello")));
        //1.4 System.out.println(obj.concat6("hello", 1, 2, "world"));
        //1.4 System.out.println(obj.concat7(new StringBuilder("hello"), 1, 2, new StringBuilder("world")));
        //2. obj.newLine("We are living in");
        //3. obj.reverse("sample");
        //4. System.out.println(obj.countSubstring("Weanything", "thing"));
        //5. System.out.println(obj.stringToUppercase("Hello world"));
        //5. System.out.println((obj.sbToUppercase(new StringBuilder("Hello world"))));
        //6. System.out.println(obj.completeString());
        //7. System.out.println(obj.removeA("We are living in an yellow submarine"));
        //7. System.out.println(obj.removeAFromSb(new StringBuilder("We are living in an yellow submarine")));
        //8. System.out.println(obj.replaceAWithAsteriks("We are living in an yellow submarine."));
        //9. System.out.println(obj.longestWord("We are living in an yellow submarine"));
        //10. System.out.println(obj.longestWord("We are living in an yellow submarine"));
        //11. obj.printSubline("We are living", 4);
        //11. obj.printSubline1(new StringBuilder("We areliving"), 6);
        //12. System.out.println(obj.isEmptyOrNull(null));
        //13. System.out.println(obj.longestWordsByComma("We, are, living, in an, yellow, submarine, We don't, have anything"));

    }

    /**
     * 1․1  Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով․
     *
     * @param st1
     * @param st2
     * @return
     */
    public String concat(String st1, String st2) {
        return st1 + st2;
    }

    /**
     * 1.1 Նույնը  խնդիրը  StringBuilder-ով.
     *
     * @param st1
     * @param st2
     * @return
     */
    public StringBuilder concat1(StringBuilder st1, StringBuilder st2) {
        StringBuilder st = st1.append(st2);
        return st;
    }

    /**
     * 1.2 concat 1 , 2 , “hello”
     * @param a
     * @param b
     * @param st
     * @return
     */
    public String concat2(int a, int b, String st){
        return a + b + st;
    }

    /**
     * 1.2 concatenate 1, 2, "hello" using StringBuilder
     * @param a
     * @param b
     * @param sb
     * @return
     */
    public StringBuilder concat3(int a, int b, StringBuilder sb){
        return new StringBuilder(a + b + sb.toString());
    }

    /**
     * 1.3 concatenate “1” , 2 , “hello”
     * @param st1
     * @param a
     * @param st2
     * @return
     */
    public String concat4(String st1, int a, String st2){
        return st1 + a + st2;
    }

    /**
     * 1.3 concatenate “1” , 2 , “hello” using StringBuilder
     * @param sb1
     * @param a
     * @param sb2
     * @return
     */
    public StringBuilder concat5(StringBuilder sb1, int a, StringBuilder sb2){
        return new StringBuilder(sb1.toString() + a + sb2.toString());
    }

    /**
     * 1.4 concatenate   “hello”, 1 ,2, “world”
     * @param st1
     * @param a
     * @param b
     * @param st2
     * @return
     */
    public String concat6(String st1, int a, int b, String st2){
        return st1 + a + b + st2;
    }

    public StringBuilder concat7(StringBuilder sb1, int a, int b, StringBuilder sb2){
        return new StringBuilder(sb1.toString() + a + b + sb2.toString());
    }

    /**
     * 2. Գրել method,  որը  ստանում է String պարամետր և տպում է ամեն դատարկ
     * սիվոլից նոր տողում օգտագործելով  String Literal ( \t, \b ….)․
     *
     * @param st
     */
    public void newLine(String st) {
        st = st.trim();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ') {
                System.out.print("\n");
            } else System.out.print(st.charAt(i));

        }
    }

    /**
     * 3․ Գրել method (reverse), որը  շուռ է տալիս String.
     *
     * @param st
     */
    public void reverse(String st) {
        StringBuilder sb = new StringBuilder();
        sb.append(st);
        sb.reverse();
        System.out.println(sb);
    }

    /**
     * 4. Գրել method, որը ստուգում է թե քանի անգամ է տրված
     * տեքստում հանդիպել token ենթատողը.
     *
     * @param line
     * @param token
     * @return
     */
    public int countSubstring(String line, String token) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (token.equals(line.substring(i, i + token.length()))) {
                i += token.length();
                count++;
            }
        }
        return count;
    }

    /**
     * 5․  Գրել method, որը  տեքստը սարքում է մեծատառերով գրված, օգտագործելով String.
     * @param st
     * @return
     */
    public String stringToUppercase(String st){
        String result = "";
        char stringMember;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z'){
                stringMember = (char)(st.charAt(i) - 32);
            }
            else {
                stringMember = (char)(st.charAt(i));
            }
            result = result + stringMember;
        }
        return result;
    }

    /**
     * 5. Նույնը  խնդիրը   StringBuilder-ով.
     * @param sb
     * @return
     */
    public StringBuilder sbToUppercase(StringBuilder sb){
        StringBuilder result = new StringBuilder();
        char stringMember;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z'){
                stringMember = (char)(sb.charAt(i) - 32);
            }
            else {
                stringMember = (char)(sb.charAt(i));
            }
            result = result.append(stringMember);
        }
        return result;
    }

    /**
     * 6․ Գրել method, որը console-ից կարդում է 20 երկարությամբ
     * սիմվոլների տող ,տպում այն եթե տողի երկարությունը պակաս է 20 ից
     * ապա պետք է տողը լռացնենք պակաս սիմվոլների փոխարեն գրելով «*» սիմվոլը.
     *
     * @return
     */
    public String completeString() {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        while (st.length() < 20) {
            st = st + "*";
        }
        return st;
    }

    /**
     * 7. Գրել method, որը տրված տեքստից հեռացնում է բոլոր « a »  սիմվոլները.
     * @param st
     * @return
     */
    public String removeA(String st) {
        st = st.replace("a", "");
        return st;
    }

    /**
     * 7. Նույնը խնդիրը  StringBuilder-ով
     * @param sb
     * @return
     */
    public StringBuilder removeAFromSb(StringBuilder sb){
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a'){
                sb.deleteCharAt(i);
            }
        }
        return sb;
    }

    /**
     * 8. Գրել method, որը տրված տեքստում բոլոր « a »
     * սիմվոլները փոխարինում է « * » , օգտագործելով String.
     * @param st
     * @return
     */
    public String replaceAWithAsteriks(String st){
        String result = "";
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a'){
                result += "*";
            }
            else {
                result += st.charAt(i);
            }
        }
        return result;
    }


    /**
     * 9. Գրել method, որը գտնում է տեքստում ամենաերկար բառը,
     * տեքստում բառերը անջատված են իրարից պռոբելով.
     *
     * @param st
     * @return
     */
    public String longestWord(String st) {
        String[] st1 = st.split(" ");
        String max = st1[0];
        for (int i = 0; i < st1.length; i++) {
            if (st1[i].length() > max.length()) {
                max = st1[i];
            }
        }
        return max;
    }

    /**
     * 10․ Գրել method, որը գտնում է թե, որերորդ ինդեքսում
     * է առաջին անգամ հանդիպել String c  սիմվոլը.
     *
     * @param st
     * @param c
     * @return
     */
    public int indexOfChar(String st, String c) {
        int index = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.toString(st.charAt(i)).equals(c)) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * 11․ Գրել method, որը գտնում և տպում է տրված տողի սկզբից
     * մինչև n-րդ ինդեքսը պարունակող ենթատողը, օգտագործելով String.
     *
     * @param line
     * @param n
     */
    public void printSubline(String line, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(line.charAt(i));
        }
        System.out.println();
    }

    /**
     * 11. Նույնը խնդիրը  StringBuilder-ով.
     *
     * @param line
     * @param n
     */
    void printSubline1(StringBuilder line, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(line.charAt(i));
        }
        System.out.println();
    }

    /**
     * 12. Գրել method, որը ստուգում է թե արդյոք
     * տրված  String պարամետրը  դատարկ և null չէ․
     *
     * @param st
     * @return
     */
    public boolean isEmptyOrNull(String st) {
        if (st == null || st.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * 13. Գրել method, որը տրոհում է նախադսությունը ըստ  ‘,’   և գտում ամեներկար բառը ․
     * @param st
     * @return
     */
    public String longestWordsByComma(String st) {
        String[] st1 = st.split(",");
        String max = st1[0];
        for (int i = 0; i < st1.length; i++) {
            if (st1[i].length() > max.length()) {
                max = st1[i];
            }
        }
        return max;
    }
}
