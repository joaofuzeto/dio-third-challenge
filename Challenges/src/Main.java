import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Exercício 4");

        System.out.println("Informe um número: ");
        var number = scanner.nextInt();
        var keepVerifying = true;

        while (keepVerifying){
            System.out.println("Informe o número para verificação");
            var toVerify = scanner.nextInt();
            var result = toVerify % number;

            if(result == 0 && toVerify > number){
                System.out.println("O resultado da divisão entre " + number + " e " + toVerify + " é de " + result);
                break;
            } else if (toVerify < number) {
                System.out.printf("Informe um número maior que %s \n", number);
                continue;
            }
        }
    }
}
