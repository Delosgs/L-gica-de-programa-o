package com.Tipos.Strings;

public class Main {

    public static void main(String[] args) {


    // Tres formas de utilizar a String
	String nome; // variavel declarada do tipo String de nome nome
    nome = new String();  // String instanciada
    nome = "Maça";  // Aqui ela foi inicializada com o conteudo Maça
        System.out.println(nome);


    //  Aqui uma outra forma de instanciar e inicializar a variavel String nome2 em uma unica linha
    String nome2 = new String("Maça");
        System.out.println(nome2);


    //  Aqui vc declara a variavel mas não intancia com o operador new
    String nome3 = "Maça";
        System.out.println(nome3);

    // Aqui  esta vazio
   // String nome4 = null;
   // System.out.println(nome4.length());


    // \n pula a linha
    String descricao =  "Tipo de gala \nA maça mais doce do mercado";
        System.out.println(descricao);

    // \t dar espaço como tabe
    descricao = "Tipo de gala \tA maça mais doce do mercado";
        System.out.println(descricao);

    // \"" Deixa o texto entre aspas duplas
    descricao = "Tipo de gala \"A maça mais doce do mercado\"";
        System.out.println(descricao);

    // Varias formas de contatenar as Strings
    String nome5 = new String("Maça");
    String descricao1 = new String();
    descricao1 = "Tipo gala, a maça mais doce do mercado";

    // Exemplo 1
    String propaganda = nome5 + " " + descricao1;
        System.out.println(propaganda);

    // Exemplo 2
    propaganda = nome5.concat(" ").concat(descricao1);
        System.out.println(propaganda);

    propaganda += "!";
        System.out.println(propaganda);
    }
}
