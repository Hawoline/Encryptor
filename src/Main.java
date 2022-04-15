import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pleace enter text for encryption:");
        if (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            
            Encryptor encryptor = new Encryptor(text.toCharArray(), 28, EncryptionAlgorithm.XOR);
            System.out.println(new String(encryptor.encrypt()));
        }
        scanner.close();
    }
}
