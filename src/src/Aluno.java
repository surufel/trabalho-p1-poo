public class Aluno {
    private String nome;
    private int matricula;
    private double nota;



    public Aluno(String nome){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = 0.0;
    }

    // getters setters
    public String getNome(){return nome;}
    public int getMatricula(){return matricula;}
    public double getNota() {return nota;}
    public void setNota(double nota) {this.nota = nota;}
    public void setNome(String nome) {this.nome = nome;}
    public void setMatricula(int matricula) { this.matricula = matricula; }

    public void exibirInfo(){
        System.out.println("-------------------");
        System.out.println("Nome:......" + getNome());
        System.out.println("Matrícula.." + getMatricula());
        System.out.println("Nota......." + getNota());
        System.out.println("-------------------");
    }
}
