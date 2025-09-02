public class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    public Aluno(String nome){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = 0.0;
    }

    public String getNome(){
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirInfo(){
        System.out.println("-------------------");
        System.out.println("Nome:......" + getNome());
        System.out.println("Matrícula.." + getMatricula());
        System.out.println("Nota......." + getNota());
        System.out.println("-------------------");
    }
}
