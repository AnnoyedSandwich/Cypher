import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class MonoAlphabetic {
    static final char[] keyArray = generateKey();
    static final char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static Map<String, StringBuilder> MAEncypted(String input){
        Map<String, StringBuilder> maMap = new HashMap<>();

        String key = String.valueOf(keyArray);
        StringBuilder encrypted = new StringBuilder();

        input = input.toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            char currentLetter = input.charAt(i);
            for (int j = 0; j < alphabet.length; j++) {
                if (currentLetter == alphabet[j]){
                    encrypted.append(keyArray[j]);
                }
            }
        }
        maMap.put(key, encrypted);
        return maMap;
    }

    private static char[] generateKey(){
        Random random = new Random();
        char[] asciiArray = new char[26];
        for (int i = 0; i < asciiArray.length; i++) {
            asciiArray[i] = (char)(random.nextInt(26) + 65);
        }
        return asciiArray;
    }
}
