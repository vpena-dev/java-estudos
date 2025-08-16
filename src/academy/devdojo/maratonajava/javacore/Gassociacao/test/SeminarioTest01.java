package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Anfiteatro");


        Aluno aluno1 = new Aluno("Vinicius", 25);
        Aluno aluno2 = new Aluno("Sarah", 24);


        Seminario seminario1 = new Seminario("Matematica", local);
        Seminario seminario2 = new Seminario("Programação", local);
        Aluno[] alunosSeminario2 = {aluno1, aluno2};
        seminario2.setAlunos(alunosSeminario2);
        Seminario seminario3 = new Seminario("Programação Orientada a Objetos", local);
        Seminario seminario4 = new Seminario("Programação Web", local);

        Seminario[] seminarios1 = {seminario1};
        Seminario[] seminarios2 = {seminario2, seminario3, seminario4};

        Professor professor1 = new Professor("Girafales", "Matematica");
        professor1.setSeminarios(seminarios1);
        Professor professor2 = new Professor("Guanabara", "programação");
        professor2.setSeminarios(seminarios2);

        professor1.imprime();
        professor2.imprime();


    }
}
