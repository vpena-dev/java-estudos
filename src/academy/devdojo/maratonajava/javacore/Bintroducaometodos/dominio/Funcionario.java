package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println("-------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (this.salarios == null) {
            return;
        }
        for (double salario : this.salarios) {
            System.out.print(salario + " ");
        }
        imprimeMediaSalarios();
    }

    public void imprimeMediaSalarios() {
        if (this.salarios == null) {
            return;
        }
        media = 0;
        for (double salario : this.salarios) {
            media += salario;
        }
        media /= this.salarios.length;
        System.out.println("\nMédia salarial: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
