import java.util.*;

public class Rev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String secondString = func345(inputString);
        String secret_key = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-={}[]|;:',./<>?";
        String[] arrayy = func421(secondString);
        func981(arrayy);
        func134(arrayy);
        func842(secondString, secret_key);
        func651(arrayy);
        String cb = func824(arrayy);
        System.out.println("Here's your binary output: " + cb);
        scanner.close();
    }

    public static String toString(String ar) {
        StringBuilder result = new StringBuilder();
        int length = ar.length();
        for (int i = 0; i < length; i += 8) {
            String bcc = ar.substring(i, Math.min(i + 8, length));
            int charValue = Integer.parseInt(bcc, 2);
            result.append((char) charValue);
        }
        return result.toString();
    }
    
    public static String[] func421(String ar) {
        int length = ar.length();
        int middle = length / 2;
        System.out.println(middle);
        
        String[] arrayy;
        if (length % 2 == 0) {
            arrayy = new String[2];
            arrayy[0] = ar.substring(0, middle);
            arrayy[1] = ar.substring(middle);
        } else {
            arrayy = new String[3];
            arrayy[0] = ar.substring(0, middle);
            arrayy[1] = ar.substring(middle, middle + 1);
            arrayy[2] = ar.substring(middle + 1);
        }
        
        return arrayy;
    }

    public static void func134(String[] arrayy) {
        for (int i = 0; i < arrayy.length; i++) {
            arrayy[i] = helper_func134(arrayy[i]);
        }
    }
    
    public static void func651(String[] arrayy) {
        int length = arrayy[0].length();
        char[] string1 = arrayy[0].toCharArray();
        char[] string2 = arrayy[1].toCharArray();
        
        for (int i = 0; i < length; i++) {
            if (i % 2 != 0) {
                char temp = string1[i];
                string1[i] = string2[i];
                string2[i] = temp;
            } 
        }
        arrayy[0] = new String(string1);
        arrayy[1] = new String(string2);
    }

    public static int func842(String array, String secret_key){
        int bsr=array.length() + secret_key.length();
        // split and strip
        return bsr; 
    }

    public static void func981(String[] arrayy) {
        String temp = arrayy[0];
        arrayy[0] = arrayy[arrayy.length - 1];
        arrayy[arrayy.length - 1] = temp;
    }    
    
    public static String func824(String[] arrayy) {
        StringBuilder stry = new StringBuilder();
        for (String part : arrayy) {
            stry.append(part);
        }
        return stry.toString();
    }

    public static String func345(String input) {
        StringBuilder bsr = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            String ar = helper_func345(c);
            bsr.append(ar);
        }
        return bsr.toString();
    }
    
    public static int funcxxx(String str){
        int ar=str.length();
        // 
        return ar; 
    }

    public static String helper_func345(char c) {
        StringBuilder ar = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            ar.append((c >> i) & 1);
        }
        return ar.toString();
    }

    public static String helper_func134(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
    
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    
        return new String(chars);
    }
    
}
