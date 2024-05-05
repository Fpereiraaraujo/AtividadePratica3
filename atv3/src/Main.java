import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            System.out.println("\nSistema de Gerenciamento de Funcionários");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Exibir Todos os Funcionários");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    adicionarFuncionario(scanner, funcionarios);
                    break;
                case 2:
                    removerFuncionario(scanner, funcionarios);
                    break;
                case 3:
                    exibirFuncionarios(funcionarios);
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private static void adicionarFuncionario(Scanner scanner, ArrayList<Funcionario> funcionarios) {
        System.out.println("\nAdicionar Funcionário");
        System.out.println("Escolha o tipo de funcionário:");
        System.out.println("1. Gerente");
        System.out.println("2. Desenvolvedor");
        System.out.println("3. Estagiário");
        System.out.print("Opção: ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada

        switch (tipo) {
            case 1:
                System.out.print("Bônus Anual: ");
                double bonusAnual = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer de entrada
                System.out.print("Equipe: ");
                String equipe = scanner.nextLine();
                funcionarios.add(new Gerente(nome, matricula, bonusAnual, equipe));
                break;
            case 2:
                System.out.print("Tecnologias Dominadas (separadas por vírgula): ");
                String[] tecnologias = scanner.nextLine().split(",");
                ArrayList<String> tecnologiasList = new ArrayList<>();
                for (String tecnologia : tecnologias) {
                    tecnologiasList.add(tecnologia.trim());
                }
                funcionarios.add(new Desenvolvedor(nome, matricula, tecnologiasList));
                break;
            case 3:
                System.out.print("Horas de Trabalho: ");
                int horasTrabalho = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer de entrada
                System.out.print("Supervisor: ");
                String supervisor = scanner.nextLine();
                funcionarios.add(new Estagiario(nome, matricula, horasTrabalho, supervisor));
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private static void removerFuncionario(Scanner scanner, ArrayList<Funcionario> funcionarios) {
        System.out.println("\nRemover Funcionário");
        System.out.print("Matrícula do funcionário a ser removido: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada

        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getMatricula() == matricula) {
                funcionarios.remove(i);
                System.out.println("Funcionário removido com sucesso.");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    private static void exibirFuncionarios(ArrayList<Funcionario> funcionarios) {
        System.out.println("\nLista de Funcionários:");
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.getNome() + " - Matrícula: " + funcionario.getMatricula());
            }
        }
    }
}
