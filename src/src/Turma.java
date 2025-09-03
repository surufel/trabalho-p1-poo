import java.util.ArrayList;

public class Turma{
    public String nomeTurma;
    ArrayList<Aluno> lista_alunos = new ArrayList<Aluno>();

    public Turma(String nomeTurma){
        this.nomeTurma = nomeTurma;
    }

    public void adicionarAluno(Aluno aluno){
        lista_alunos.add(aluno);
    }

    public void listarAlunos(){
        if (lista_alunos.isEmpty()){
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        for (Aluno aluno : lista_alunos){
            aluno.getNome();
            aluno.getMatricula();
            aluno.getNota();
            System.out.println("- " + aluno.getNome() + " " + aluno.getMatricula() + " " + aluno.getNota());
        }
    }

    public Aluno buscarAlunoPorMatricula(int matricula) {
        return lista_alunos.get(matricula);
    }

    public void removerAluno(int matricula) {
        Aluno remover = buscarAlunoPorMatricula(matricula);
        lista_alunos.remove(matricula);
        System.out.println("Aluno removido.");
    }

    public double calcularMediaTurma() {
        if (lista_alunos.isEmpty()) {
            return 0.0;
        }
        double soma = 0.0;
        for (Aluno aluno : lista_alunos)
            soma += aluno.getNota();
        return soma / lista_alunos.size();
        }
    }