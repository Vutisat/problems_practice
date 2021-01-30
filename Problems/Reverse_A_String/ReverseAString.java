package Reverse_A_String;

public class ReverseAString {

    public static void main(String[] args) {
        String input = "ThisStringShouldBeReversed24";
        System.out.println(reverseString(input));
        System.out.println(reverseString2(input));
    }

    private static String reverseString(String input){
        byte[] strAsByteArray = input.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        //Reverse the bits
        for (int i = 0; i < strAsByteArray.length; i++){
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }

        return new String(result);
    }

    private static String reverseString2(String input){
        return new StringBuilder(input).reverse().toString();
    }
}
