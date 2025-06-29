import java.util.Scanner;

public class ExercicioDois {

    public void solution2() {
        var scanner = new Scanner(System.in);

        System.out.println("Informe sua altura em metros: ");
        double height = scanner.nextDouble();

        System.out.println("Informe o seu peso em quilogramas: ");
        int weight = scanner.nextInt();

        double imc = weight / (height * height);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau II (Severa)");
        } else if (imc >= 40.0) {
            System.out.println("Obesidade grau III (Mórbida)");
        }
    }
}
