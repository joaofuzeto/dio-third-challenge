import java.util.Scanner;

public class ExercicioQuatro {

    public void solution4() {
        var scanner = new Scanner(System.in);

        System.out.println("Exercício 4");

        System.out.println("Informe um número: ");
        var number = scanner.nextInt();
        var keepVerifying = true;

        while (keepVerifying) {
            System.out.println("Informe o número para verificação");
            var toVerify = scanner.nextInt();
            var result = toVerify % number;

            if (result == 0 && toVerify > number) {
                System.out.println("O resto da divisão entre " + toVerify + " e " + number + " é de " + result);
                continue;
            } else if (toVerify < number) {
                System.out.printf("Informe um número maior que %s \n", number);
                continue;
            } else if (result != 0){
                System.out.printf("O resto da divisão entre %s e %s é diferente de 0 \n", toVerify, number);
                break;
            }
        }
    }
}