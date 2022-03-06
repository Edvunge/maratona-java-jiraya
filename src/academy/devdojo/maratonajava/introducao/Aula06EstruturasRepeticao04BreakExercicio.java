package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao04BreakExercicio {
    public static void main(String[] args) {

        // dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // condiçao valorParcela >= 1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000){
                System.out.println("parcela " + parcela+ "R$" + valorParcela);
            } else {
                break;
            }
        }
    }
}
