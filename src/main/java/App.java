import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Enter the string to be encrypted");
        String plainText = myConsole.readLine();

        System.out.println("Enter the shift key");
        String shiftkey= myConsole.readLine();
        int intKey =Integer.parseInt(shiftkey);
        System.out.println("The  encrypted text +EncryptText(plainText,shiftkey"));

    }
}
