package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        /*pratica
        * crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
        *
        * eu <nome> , morando no endereço <endereço>,
        * confirmo que recebi o salario de <salario>, na data <data> */

        String name = "edvaldo";
        String address = "rua candido oliveira 14 3E";
        double salary = 1.789;
        String dateSalary = " 05 / mar / 2022 ";


        System.out.printf(" eu %s , morando no endereço %s , " , name , address);
        System.out.printf("%n confirmo que recebi o salario de %.4f  , na data %s " , salary , dateSalary);
    }
}
