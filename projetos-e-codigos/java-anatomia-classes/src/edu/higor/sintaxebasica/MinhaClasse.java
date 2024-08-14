package edu.higor.sintaxebasica;

public class MinhaClasse {
    public static void main (String [] args) {
    String primeiroNome = "Higor";
    String segundoNome = "Stuqui";
    
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
}

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
