import java.util.Scanner;

//Hill Cipher, letteres correspond to numbers based on ascii code
//n = 2;
//TODO: make it work for n = x;

public class HillCipher {
    static Scanner sc = new Scanner(System.in);
    public static StringBuilder HillEncrypted(String input){
        int[][] keyMatrix = getKey();
        int[][] inputMatrix = new int[2][1];
        input = input.toUpperCase();
        if (input.length() % 2 != 0){
            input += "Z";
        }
        String[] inputArray = splitN(input);
        //for loop über inputArray teile, in jedem loop einmal die 2x1 matrix mit key multiplizieren
        StringBuilder encryptedString = new StringBuilder();
        for (String s : inputArray) {
            inputMatrix[0][0] = ((int) s.charAt(0)) - 65;
            inputMatrix[1][0] = ((int) s.charAt(1)) - 65;
            encryptedString.append(encrypt(inputMatrix, keyMatrix));
        }

        return encryptedString;
    }
    private static int[][] getKey(){
        String key;
        int[][] keyMatrix = new int[2][2];
        do {
            System.out.println("Enter key - 4 words");
            key = sc.nextLine();
        }while (key.length() != 4);
        int k=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                keyMatrix[i][j] = ((int) key.charAt(k))-97;
                k++;
            }
        }
        return keyMatrix;
    }

    private static String[] splitN(String input){
            return input.split("(?<=\\G.{2})");
        }

    private static StringBuilder encrypt(int[][] inputMatrix, int[][] keyMatrix){
        //multiplication
        int firstNumber = inputMatrix[0][0]*keyMatrix[0][0] + inputMatrix[1][0]*keyMatrix[1][0];
        int secondNumber = inputMatrix[0][0]*keyMatrix[0][1] + inputMatrix[1][0]*keyMatrix[1][1];
        //mod 26 und in char umwandeln
        firstNumber = firstNumber % 26;
        secondNumber = secondNumber % 26;
        char firstChar = (char) (firstNumber + 65);
        char secondChar = (char) (secondNumber + 65);
        return new StringBuilder().append(firstChar).append(secondChar);
    }
}



