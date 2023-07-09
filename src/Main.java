import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        do {
            System.out.println("------------------------------------");
            System.out.println("what encyption would you like to use?");
            System.out.println("0. Exit");
            System.out.println("1. Caesar Cipher");
            System.out.println("2. MonoAlphabetic");
            System.out.printf("3. Polygram Cipher%n%n");
            System.out.println("------------------------------------");
            i = sc.nextInt();
            sc.nextLine();
            switch (i) {
                case 0 -> {
                    System.out.println("end program");
                    System.exit(0);
                }
                case 1 -> {
                    System.out.println("Enter String");
                    String input = sc.nextLine();
                    System.out.println("the encrypted String is: " + CaesarCypher.CCDecrypted(input));
                }
                case 2 -> {
                    System.out.println("Enter String");
                    String input = sc.nextLine();
                    System.out.println("the decrypted String is: " + MonoAlphabetic.MAEncypted(input));
                }
                case 3 -> {
                    System.out.println("Enter String");
                    String input = sc.nextLine();
                    System.out.println("the encrypted String is: " + HillCipher.HillEncrypted(input));
                }
                default -> System.out.println("Invalid input");
            }
        }while (!(i < -1 && i > 2));
    }
}