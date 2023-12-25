package devandroid.godoi.applista.model;

public class Pessoa {

    private String nome, sobrenome, curso;
    int telefone;

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getCurso() {
        return curso;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Pessoa() {}

}
