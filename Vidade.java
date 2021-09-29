import java.util.Scanner;

public class Vidade{
    public static void main (String[] args){
        int idade; 
        System.out.println("--------------------");
        System.out.println("|Digite o sua idade|");
        System.out.println("--------------------");
        Scanner input = new  Scanner (System.in);
        idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Parabéns vc já é de maior! Já pode dirigir entre outras coisas:");
        } else{
           if (idade < 18) {
                System.out.println("Você é de menor ainda:");
        } 
        }
    }
}