import java.util.Scanner;


public class Funsalario {
    public static void main (String[] args){
        double salario;

        System.out.println("Digite o seu salario");
        Scanner input = new  Scanner (System.in);
        salario = input.nextDouble();

        if ( salario >= 1101){
            System.out.println("Seu salario é mais que um salario minimo:");
        } else {
            if ( salario == 1100){
                System.out.println("Seu salario é equivalente á um salario minimo:");
            } else{
                if ( salario <= 1099 ){
                    System.out.println("Seu salario é inferior á um salario minimo:");
                }
            }
        }
    }
}