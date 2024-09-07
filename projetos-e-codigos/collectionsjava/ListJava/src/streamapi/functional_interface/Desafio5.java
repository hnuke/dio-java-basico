package streamapi.functional_interface;

import java.util.*;

public class Desafio5 {


    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);



        int soma = numeros.stream().filter(n -> n > 5).reduce(0,(a,b)->a+b);

        int qtd = (int) numeros.stream().filter(n -> n > 5).count();
        
        System.out.println("A quantidade de números maiores que 5 são : " + qtd + " , a soma é " + soma + " , e a média é " + (soma / qtd));


    }

}
