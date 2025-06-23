package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a
seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>

 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Vinícius";
        String endereco = "Rua Araxá, 426 - Centro";
        double salario = 4803.85;
        String dataRecebimento = "16/06/2025";

        System.out.println("Eu " +nome+", morando no endereço " +endereco+
                ", confirmo que recebi o salário de R$"+salario+", na data "+dataRecebimento);
    }
}
