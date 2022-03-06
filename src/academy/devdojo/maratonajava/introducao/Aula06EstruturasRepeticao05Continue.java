package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao05Continue {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // condiçao valorParcela >= 1000
         double valorTotal = 30000;
         for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
             double valorParcela = valorTotal / parcela;
             if (valorParcela < 1000){
                 continue;
             }
             System.out.println("parcela " + parcela + " R$ " + valorParcela);
         }
    }
}
