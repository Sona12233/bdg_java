package string_stringbuilder;

import java.util.ArrayList;
import java.util.List;

public class StringAndStringbuilder2 {
    /**
     * 1. return "oz" if the string starts with "oz", "o" if it starts with "o",
     * return "z" if 2nd character is "z"
     *
     * @param st
     * @return
     */
    public String oz(String st) {
        if (st.startsWith("oz")) {
            return "oz";
        } else if (st.startsWith("o")) {
            return "o";
        } else if (st.charAt(1) == 'z') {
            return "z";
        } else return "";
    }

    /**
     * 2. Count the number of "xx" in the given string.
     * We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     *
     * @param st
     * @return
     */
    public int xx(String st) {
        int count = 0;
        for (int i = 0; i < st.length() - 1; i++) {
            if (st.charAt(i) == 'x' && st.charAt(i + 1) == 'x') {
                count++;
            }
        }
        return count;
    }

    /**
     * 3. A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
     * Write a method that detects if a string is a palindrome.
     *
     * @param st
     * @return
     */
    public boolean palindrome(String st) {
        StringBuilder sb = new StringBuilder(st);
        boolean isPalindrome = false;
        sb.reverse();
        String sbRev = sb.toString();
        if (st.equals(sbRev)) {
            return !isPalindrome;
        } else {
            return isPalindrome;
        }
    }

    /**
     * 4. Given a list of strings, write a method that returns a list of all strings that
     * start with the letter 'a' (lower case) and have exactly 3 letters.
     *
     * @param st
     * @return
     */
    public String[] lisOfStrings(String... st) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < st.length; i++) {
            if (st[i].length() == 3 && st[i].startsWith("a")) {
                list.add(st[i]);
            }
        }
        String[] newArr = new String[list.size()];
        newArr = list.toArray(newArr);
        return newArr;
    }

    /**
     * 5. Write a method that returns a comma-separated string based on a given list of integers.
     * if the input list is (3,44), the output should be 'o3,e44'.
     *
     * @param arr
     * @return
     */
    public String oddOrEven(int[] arr) {
        String st = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                st = st + "e" + arr[i] + ",";

            } else st += "o" + arr[i] + ",";
        }
        return st;
    }

    /**
     * 6. Make a Caeser cipher method
     *
     * @param st
     * @param key
     * @return
     */
    public String Caeser(String st, int key) {
        st = st.toLowerCase();
        String newString = "";
        char newStMembers = st.charAt(0);
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) >= 97 && st.charAt(i) <= 122 - key) {
                newStMembers = (char) (st.charAt(i) + key);
            }
            if (st.charAt(i) + key >= 122 && st.charAt(i) <= 122) {
                newStMembers = (char) (st.charAt(i) + key - 26);
            }
            newString += newStMembers;
        }
        return newString;
    }

    /**
     * 9. Given two strings, find the number of common characters between them.
     *
     * @param a
     * @param b
     * @return
     */
    public int commonChars(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = i; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 10. reverses characters in (possibly nested) parentheses in the input string.
     *
     * @param st
     * @return
     */
    public String reversedCharsInParentheses(String st) {
        StringBuilder stringB = new StringBuilder(st);
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '(') {
                arr.add(i);
            }
        }

        Integer[] intArray = new Integer[arr.size()];
        intArray = arr.toArray(intArray);

        for (int i = intArray.length - 1; i >= 0; i--) {
            int j = intArray[i];
            int k = stringB.indexOf(")");
            StringBuilder temp = new StringBuilder(stringB.substring(j + 1, stringB.indexOf(")")));
            stringB.replace(j + 1, k, temp.reverse().toString());
            stringB.deleteCharAt(stringB.indexOf(")"));
            stringB.deleteCharAt(j);
        }
        return stringB.toString();
    }


    public static void main(String[] args) {
        StringAndStringbuilder2 obj = new StringAndStringbuilder2();
        //1. System.out.println(obj.oz("aja"));
        //2. System.out.println(obj.xx("xxx"));
        //3. System.out.println(obj.palindrome("abcba"));

//4.        String[] st = obj.lisOfStrings("a5z", "bcv", "ammm");
//        for (int i = 0; i < st.length; i++) {
//            System.out.print(st[i]);
//        }


        //6. System.out.println(obj.Caeser("gyz", 2));
        //9. System.out.println(obj.commonChars("abc", "aeb"));
        //10. System.out.println(obj.reversedCharsInParentheses("foo(bar(baz))"));
    }

}
