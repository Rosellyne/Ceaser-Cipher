import java.io.Console;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Welcome to  Ceasar Cipher.What do you like to do? \n1.Encrypt \n2.Decrypt \n3.Quit");
        try {
            String navigateChoice = myConsole.readLine();
            if (navigateChoice.equals("1")) {
                System.out.println("Enter a text to be encrypted");
                String plainText = myConsole.readLine();
                System.out.println("Enter the shift key to shift your text");
                String shiftkey = myConsole.readLine();
                int intKey = Integer.parseInt(shiftkey);
                Encrypt encrypt = new Encrypt(plainText, intKey);
                System.out.println(String.format("Your encrypted test is %s.", encrypt.isEncrypt()));
                System.out.println("--------------------------------------------------------");
            } else if (navigateChoice.equals("2")) {
                System.out.println("Enter a text to be decrypted");
                String plainText = myConsole.readLine();
                System.out.println("Enter the shift key to shift your text");
                String shiftkey = myConsole.readLine();
                int intKey = Integer.parseInt(shiftkey);
                Decrypt decrypt = new Decrypt(plainText, intKey);
                System.out.println(String.format("Your decrypted test is %s.", decrypt.isDecrypt()));
                System.out.println("--------------------------------------------------------");
            } else if (navigateChoice.equals("3")) {
                System.out.println("Goodbye");
                System.out.println("--------------------------------------------------------");
            } else {
                System.out.println("you have entered the invalid input");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }

