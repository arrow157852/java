import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (InputMismatchException ex) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        } catch (ParametrosInvalidosException ex) {
            // imprimir a mensagem: Os parâmetros são inválidos.
            System.out.println("Os parâmetros são inválidos.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    // Implementação personalizada da exceção ParametrosInvalidosException
}

