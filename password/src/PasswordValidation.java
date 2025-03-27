import java.util.Scanner;


public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o seu nome: ");
        String userName = sc.nextLine();
        String passwordInput;
        boolean done = false;

        do {
            System.out.print("Insira a sua senha: ");
            passwordInput = sc.nextLine();

            if(passwordInput.length() < 8) {
                continue;
            }

            int upperCount = 0;
            int specialCount = 0;
            int digitCount = 0;

            for(char c : passwordInput.toCharArray()) {
                if(Character.isUpperCase(c)) {
                    upperCount++;
                } else if(!(Character.isLetterOrDigit(c)) && !(Character.isWhitespace(c))) {
                    specialCount++;
                } else if(Character.isDigit(c)) {
                    digitCount++;
                }
            }

            if(upperCount == 0) {
                System.out.println("A senha deve conter ao menos uma letra maiúscula");
            } else if(specialCount == 0) {
                System.out.println("A senha deve conter ao menos um caracter especial");
            } else if(digitCount == 0) {
                System.out.println("A senha deve conter ao menos um número");
            } else {
                done = true;
            }


        } while(!done);
    }
}
