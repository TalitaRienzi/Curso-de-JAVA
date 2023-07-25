public class Funcoes_string {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase();
        //altera todos os caracteres para letras minusculas//

        String s02 = original.toUpperCase();
        //altera todos os caracteres para letras maiuscula//

        String s03 = original.trim();
        //Tira os espaços em braco no inicio ou final da frase//

        String s04 = original.substring(2);
        //Faz um corte no inicio da frase, no exemplo irá aparecer a partir do 2º caracter//

        String s05 = original.substring(2,9);
        //Faz um corte no inicio e no final da frase, no exemplo irá aparecer a partir do 2º caracter até o 9º caracter//

        String s06 = original.replace('a','x');
        // substitui um caracter por outro, o primeiro é o caracter a ser substituido e o segundo é qual será o nov caracter//

        String s07 = original.replace("abc", "xyz");

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        //Qual posição está indexada os caracteres acima//

        //Operação split//
        //divide a string e armazena em um vector usando o separador declarado em parenteses//
        String s = "potato apple lemon orange";

        String [] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);

        System.out.println();

        System.out.println("original:  -" + original + "-");
        System.out.println();
        System.out.println("toLowerCase:  -" + s01 + "-");
        System.out.println();
        System.out.println("toUpperCase:  -" + s02 + "-");
        System.out.println();
        System.out.println("trim:  -" + s03 + "-");
        System.out.println();
        System.out.println("substring:  -" + s04 + "-");
        System.out.println();
        System.out.println("substring:  -" + s05 + "-");
        System.out.println();
        System.out.println("replace('a', 'x'):  -" + s06 + "-");
        System.out.println();
        System.out.println("replace('abc', 'xyz'):  -" + s07 + "-");
        System.out.println();
        System.out.println("Index of 'bc':  " + i );
        System.out.println();
        System.out.println("Index last 'bc':  " + j );

    }
}
