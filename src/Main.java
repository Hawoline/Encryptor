import java.util.Scanner;

public class Main {
    private static final int KEY = 28;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pleace enter text for encryption:");
        if (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            
            Encryptor encryptor = new Encryptor(text.toCharArray(), KEY, EncryptionAlgorithm.XOR);
            System.out.println(new String(encryptor.encrypt()));
        }
        scanner.close();
    }
}
