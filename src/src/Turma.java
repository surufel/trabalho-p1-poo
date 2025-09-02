import java.util.Scanner;
import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    Scanner input = new Scanner(System.in);
    ArrayList<String> alunos = new ArrayList<String>();

    public void adicionarAluno(Aluno aluno) {
        System.out.println("Digite o nome do novo aluno:");
        String novonome = input.nextLine();
        alunos.add(novonome);
    }

    public void listarAlunos() {
        for(int i = 0; i < alunos.size(); i++){
            System.out.println(alunos.get(i));
        }

    }

    public String buscarAlunoPorMatricula(int matricula){
        System.out.println("Digite o número correspondente ao do aluno:");
        matricula = input.nextInt();
        return alunos.get(matricula);
    } // retorna o aluno correspondente

    public void removerAluno(int matricula){
        System.out.println("Digite o número correspondente ao do aluno:");
        int excluiraluno = input.nextInt();
        alunos.remove(excluiraluno);
        System.out.println("Aluno removido.");
    }

    public void calcularMediaTurma(){

    } // calcula e retorna média da nota da turma
}
