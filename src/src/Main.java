import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Inputs
        Aluno estudante = new Aluno("Ronaldo");
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
            switch (n) {
                case 1:
                    break; // WIP
                case 2:
                    break; // WIP
                case 3:
                    break; // WIP
                case 4:
                    break; // WIP
                case 5:
                    break; // WIP
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
            }while(true);
        }
    }