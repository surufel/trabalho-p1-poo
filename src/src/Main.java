import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Inputs
        Turma turma_a = new Turma("Turma A"); // Turma da Manhã
        do{
            System.out.println("------------------------");
            System.out.println("  ESCOLA ABCXYZ | MENU  ");
            System.out.println("------------------------");
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno p/ matricula");
            System.out.println("4 - Remover aluno");
            System.out.println("5 - Calcular média da turma");
            System.out.println("6 - Sair");
            int n = input.nextInt();
            input.nextLine(); // Retira o buffer (explicação abaixo).
            // Descobri recentemente que o buffer do Scanner do Menu pega um '/n', deixando algumas coisas 'null'
            switch (n) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    Aluno novoestudante = new Aluno(nome);
                    novoestudante.setNome(nome);
                    System.out.print("Nota (0.0-10.0): ");
                    input.nextDouble();
                    novoestudante.setNota(input.nextDouble());
                    turma_a.adicionarAluno(novoestudante);
                    System.out.println("Aluno adicionado.");
            break;
                case 2:
                    turma_a.listarAlunos();
                    break;
                case 3:
                    System.out.print("Informe a matrícula: ");
                    int busca_da_matricula = input.nextInt();
                    Aluno resultado = turma_a.buscarAlunoPorMatricula(busca_da_matricula);
                    // Aluno "resultado" indica que na busca, resultou um aluno existente que possui matrícula
                    if(resultado != null){
                        resultado.exibirInfo();
                    }
                    else{
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Informe a matrícula a ser removida: ");
                    int removermatricula = input.nextInt();
                    turma_a.removerAluno(removermatricula);
                    break;
                case 5:
                    double media = turma_a.calcularMediaTurma();
                    System.out.println("Média da Turma: " + media);
                case 6:
                    System.out.println("Saindo...");
                    break;
                    default:
                    System.out.println("Opção Inválida.");
                    break;
            }
            if(n == 6){ break; }
            }while(true);
        }
    }