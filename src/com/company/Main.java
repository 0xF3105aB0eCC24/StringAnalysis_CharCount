package com.company;

public class Main {

    public static void main(String[] args) {
        String string = "I think this will be a new feature." +
                "Just don't tell anyone that it came about by accident.";

        System.out.println("Number of digits in a line : " + countDigits(string));
        System.out.println("Number of letters in a line : " + countLetters(string));
        System.out.println("Number of spaсes in a line : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишите тут ваш код
        int count = 0;
        char[] s = string.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (Character.isDigit(s[i]))
                count += 1;
        }
        return count;

    }
    public static int countLetters(String string) {
        //напишите тут ваш код
        int count = 0;
        char[] s = string.toCharArray();;
        for (int i = 0; i < s.length; i++) {
            if (Character.isLetter(s[i]))
                count += 1;
        }
        return count;
    }
    public static int countSpaces(String string) {
        //напишите тут ваш код
        int count = 0;
        char[] s = string.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (Character.isSpaceChar(s[i]))
                count += 1;
        }
        return count;
    }
    }

