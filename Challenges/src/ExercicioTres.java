import java.util.Scanner;

public class ExercicioTres {

    public void solution3() {
        var scanner = new Scanner(System.in);
        var keepVerifying = true;

        System.out.println("Exercício 3");

        while (keepVerifying) {
            System.out.println("Escolha entre números pares ou ímpares: (par/ímpar) ou digite 'exit' para sair");
            String numberType = scanner.next();

            if (numberType.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Informe um número: ");
            int number1 = scanner.nextInt();

            System.out.println("Informe um segundo número maior que o primeiro: ");
            int number2 = scanner.nextInt();


            if (number1 > number2) {
                System.out.println("O segundo número deve ser maior que o primeiro");
                continue;
            } else if (numberType.equalsIgnoreCase("par")) {
                for (int i = number1; i <= number2; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                        continue;
                    }
                }
            } else if (numberType.equalsIgnoreCase("ímpar")) {
                for (int i = number1; i <= number2; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                        continue;
                    }
                }
            }
        }
    }
}
