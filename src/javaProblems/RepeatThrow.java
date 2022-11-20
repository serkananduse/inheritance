package javaProblems;

public class RepeatThrow {
    public static void main(String[] args) {
       /* In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated
        more than once, but retain the first occurrence of any case-insensitive repeated word.
        For example, the words love and to are repeated in the sentence I love Love to To tO code.
        Can you complete the code in the editor so it will turn I love Love to To tO code into I love to code?*/

        String input = "I love Love to To code";
        System.out.println(input.replaceAll(" Love", "").replaceAll(" To", ""));


    }

}
