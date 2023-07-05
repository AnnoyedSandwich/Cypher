import java.util.Scanner;

public class CaesarCypher {
    static Scanner sc = new Scanner(System.in);
    public static StringBuilder CCEncypted(String input){
        System.out.println("Enter shift");
        int shift = sc.nextInt();
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            encrypted.append((char) (letter + shift));
        }
        return encrypted;
    }

    public static StringBuilder CCDecrypted(String input){
        System.out.println("Enter shift");
        int shift = sc.nextInt();
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            decrypted.append((char) (letter - shift));

        }
        return decrypted;
    }

}
