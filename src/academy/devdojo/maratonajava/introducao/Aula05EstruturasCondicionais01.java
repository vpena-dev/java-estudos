package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // ! e else
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcóolica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcóolica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcóolica");
        }


    }
}
