package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Vinícius");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{1200, 1300, 1500});

        funcionario.imprime();
        System.out.println(funcionario.getMedia());
    }
}
