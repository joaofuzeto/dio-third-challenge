import java.util.Scanner;

public class ExercicioUm {

    public void solution1(){
        var scanner = new Scanner(System.in);

        System.out.println("Exercício 1");

        System.out.println("Informe um número que deseja saber sua tabuada até o 10: ");
        int number = scanner.nextInt();
        int multiplier = 1;

        for (int i = multiplier; i <= 10 ; i++) {
            int result = i * number;
            System.out.printf("Seu número escolhido foi %s e multiplicado por %s é %s \n", number, i, result);
        }
    }
}
