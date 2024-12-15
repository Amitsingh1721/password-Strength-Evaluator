import java.util.Scanner;

public class PasswordStrengthEvaluator {

    
    public static boolean isStrongPassword(String password) {
        // Check if the password length is at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

       
        String specialCharacters = "!@#$%^&*()-+";

        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (specialCharacters.contains(String.valueOf(c))) {
                hasSpecialChar = true;
            }

            
            if (hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
                return true;
            }
        }

        
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a password to evaluate: ");
        String password = scanner.nextLine();

        
        if (isStrongPassword(password)) {
            System.out.println("The password is STRONG.");
        } else {
            System.out.println("The password is WEAK.");
        }

        scanner.close();
    }
}
