import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        double num1 = 0;
        double num2 = 0;
        boolean dadosRedefinidos = true;

    while (continuar) {
        if (dadosRedefinidos) {
        System.out.println("Calculadora");
        System.out.println("Operadores:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Divisão");
        System.out.println("4. Multiplicação");
        System.out.println("0. Sair");
        }
        System.out.println("Escolha um operador(1/2/3/4/0 para sair): ");
        int escolha = scanner.nextInt();

        if (escolha == 0) {
            System.out.println("Saindo da calculadora.");
            continuar = false;
        }
        else if (escolha >=1 && escolha <=4){
            if (dadosRedefinidos) {
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();
        dadosRedefinidos = false;
            }

        double resultado;

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                System.out.println("O resultado é: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado é: " + resultado);
                break;
            case 3:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                else {
                    System.out.println("Não é possivel dividir por zero");
                }
                break;
            case 4:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            }

            System.out.print("Deseja redefinir os dados? (S/N) ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("S")) {
                dadosRedefinidos = true;
            }
        }
        else {
            System.out.println("Escolha invalida.");
        }
    }

        scanner.close();
}

}