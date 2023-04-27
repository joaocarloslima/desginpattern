package model;

public class Aluno {

    private int id;
    private String nome;
    private String turma;
    private double nota;
    private int frequencia;

    public Aluno() {
    }

    public Aluno(int id, String nome, String turma, double nota, int frequencia) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
        this.frequencia = frequencia;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
