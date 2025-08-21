
//importar biblioteca

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[]args){

        Scanner x = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade:");
        idade =x.nextInt();

        String resultado = (idade>=18) ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);
        
        System.out.println("A sua idade é:" + idade + "\n" + "Você é " + resultado);


    }

    
}
