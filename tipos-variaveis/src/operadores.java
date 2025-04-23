public class operadores {
    
    public static void main(String[] args) {
        // Operadores Aritméticos
        int a = 10;
        int b = 20;
        int soma = a + b; // Adição
        int subtracao = a - b; // Subtração
        int multiplicacao = a * b; // Multiplicação
        double divisao = (double) a / b; // Divisão
        int resto = a % b; // Módulo

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
        System.out.println("1" + (1+1));

        // Operadores de Comparação
        boolean maiorQue = a > b; // Maior que
        boolean menorQue = a < b; // Menor que
        boolean igual = a == b; // Igualdade
        boolean diferente = a != b; // Diferente

        System.out.println("Maior que: " + maiorQue);
        System.out.println("Menor que: " + menorQue);
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
    }
}
