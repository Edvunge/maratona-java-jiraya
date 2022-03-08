package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisOpTernarioExercicio {
    public static void main(String[] args) {

        double nota = 10.0 * Math.random();

        String resultado = nota >= 5 ? "aprovado" : " reprovado";
        System.out.println(nota >= 5 ? "aprovado" : "reprovado");
    }
}
