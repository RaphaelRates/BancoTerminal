import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal("", 3.01, "", 0);

        System.out.println("Seja bem-vindo cliente novo, realize o seu cadastro:\n");

        String nome = "";
        Double saldo = 0.0;
        String agencia = "";
        int numero = 0;

        while (true) {
            System.out.print("Nome: ");
            try {
                nome = scan.nextLine();
                if (nome.trim().isEmpty()) {
                    throw new IllegalArgumentException("O nome não pode estar vazio.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Saldo: ");
            try {
                saldo = scan.nextDouble();
                if (saldo < 0) {
                    throw new IllegalArgumentException("O saldo não pode ser negativo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um número válido.");
                scan.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scan.nextLine();

        while (true) {
            System.out.print("Agência: ");
            try {
                agencia = scan.nextLine();
                if (agencia.trim().isEmpty()) {
                    throw new IllegalArgumentException("A agência não pode estar vazia.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Número: ");
            try {
                numero = scan.nextInt();
                if (numero <= 0) {
                    throw new IllegalArgumentException("O número da conta deve ser maior que zero.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um número inteiro válido.");
                scan.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        conta = new ContaTerminal(nome, saldo, agencia, numero);

        System.out.println("\nCadastro realizado com sucesso!");
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número: " + conta.getNumero());

        scan.close();
    }
}
