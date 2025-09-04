import java.util.ArrayList;

public class Turma{
    public String nomeTurma;
    ArrayList<Aluno> lista_alunos = new ArrayList<Aluno>();
    private int num_matricula = 1;

    public Turma(String nomeTurma){
        this.nomeTurma = nomeTurma;
    }

    public void adicionarAluno(Aluno aluno){
        aluno.setMatricula(num_matricula++); // 1, 2, ...
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
            System.out.println("- " + aluno.getNome() + " | Matrícula: "  + aluno.getMatricula() + " | Nota: " + aluno.getNota());
        }
    }

    public Aluno buscarAlunoPorMatricula(int matricula) {
        for (Aluno aluno : lista_alunos) {
            if (aluno.getMatricula() == matricula){
                return aluno;
            }
        }
        return null;
    }

    public void removerAluno(int matricula) {
        for (int i = 0; i < lista_alunos.size(); i++) {
            Aluno aluno = lista_alunos.get(i);
            if (aluno.getMatricula() == matricula) {
                lista_alunos.remove(i);
                System.out.println("Aluno removido: " + aluno.getNome());
                return;
            }
        }
        System.out.println("Matrícula não encontrada.");
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