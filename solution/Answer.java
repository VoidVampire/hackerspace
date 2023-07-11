import java.util.*;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputBinary = scanner.nextLine();
        String[] splitParts = func421(inputBinary);
        func651(splitParts);
        func134(splitParts);
        func981(splitParts);
        String combinedString = func824(splitParts);
        System.out.println("Result: " + binaryToString(combinedString));
    }
    
    public static String[] func421(String binary) {
        int length = binary.length();
        int middle = length / 2;
        System.out.println(middle);
        
        String[] splitParts;
        if (length % 2 == 0) {
            splitParts = new String[2];
            splitParts[0] = binary.substring(0, middle);
            splitParts[1] = binary.substring(middle);
        } else {
            splitParts = new String[3];
            splitParts[0] = binary.substring(0, middle);
            splitParts[1] = binary.substring(middle, middle + 1);
            splitParts[2] = binary.substring(middle + 1);
        }
        
        return splitParts;
    }
    
    public static void func981(String[] splitParts) {
        String temp = splitParts[0];
        splitParts[0] = splitParts[splitParts.length - 1];
        splitParts[splitParts.length - 1] = temp;
    }
    
    public static void func134(String[] splitParts) {
        for (int i = 0; i < splitParts.length; i++) {
            splitParts[i] = reverseString(splitParts[i]);
        }
    }
    
    public static String reverseString(String str) {
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
    
    public static void func651(String[] splitParts) {
        int length = splitParts[0].length();
        char[] string1 = splitParts[0].toCharArray();
        char[] string2 = splitParts[1].toCharArray();
        
        for (int i = 0; i < length; i++) {
            if (i % 2 != 0) {
                char temp = string1[i];
                string1[i] = string2[i];
                string2[i] = temp;
            } 
        }
        splitParts[0] = new String(string1);
        splitParts[1] = new String(string2);
    }
    
    public static String func824(String[] splitParts) {
        StringBuilder combinedBinary = new StringBuilder();
        for (String part : splitParts) {
            combinedBinary.append(part);
        }
        return combinedBinary.toString();
    }
    
    public static String toString(String binary) {
        StringBuilder result = new StringBuilder();
        int length = binary.length();
        for (int i = 0; i < length; i += 8) {
            String binaryChar = binary.substring(i, Math.min(i + 8, length));
            int charValue = Integer.parseInt(binaryChar, 2);
            result.append((char) charValue);
        }
        return result.toString();
    }

    public static String binaryToString(String binaryString) {
        StringBuilder result = new StringBuilder();
            for (int i = 0; i < binaryString.length(); i += 8) {
            String group = binaryString.substring(i, Math.min(i + 8, binaryString.length()));
            int decimal = Integer.parseInt(group, 2);
            char character = (char) decimal;
            result.append(character);
        }
    
        return result.toString();
    }

}
