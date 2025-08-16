package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("---------DADOS PROFESSOR------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (this.seminarios == null) return;
        System.out.println("### Seminários ##: ");
        for (Seminario seminario : seminarios) {
            System.out.println("  • " + seminario.getTitulo());
            System.out.println("   - Local: " + seminario.getLocal().getLocal());
            if (seminario.getAlunos() == null  || seminario.getAlunos().length == 0) {
                System.out.println("Sem alunos cadastrados");
                continue;
            } else {
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Nome: " + aluno.getNome() + " Idade: " + aluno.getNome());
            }
            System.out.println("----------------------");
        }}
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
