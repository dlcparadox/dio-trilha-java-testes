public class metodos {
    
    public static void main(String[] args) {
        // Métodos devem ser nomeados como verbos, começando com letra minúscula e usando camelCase.
        // O nome do método deve indicar o que ele faz.
        // Métodos funcionam como funções, mas são chamados de métodos em Java.
        // Se um método não retorna valor, ele deve ser declarado como void.
        // Ficar atento se o método não possui uma exceção, pois isso pode causar erros.
        // throw Exception é usado para lançar uma exceção, enquanto throws Exception é usado para declarar que um método pode lançar uma exceção.


        // Chamando o método
        int resultado = soma(10, 20);
        System.out.println("Resultado da soma: " + resultado);
        
        // Chamando o método com retorno void
        imprimirMensagem("Olá, mundo!");
    }
    
    // Método que retorna um valor inteiro
    public static int soma(int a, int b) {
        return a + b;
    }
    
    // Método que não retorna valor (void)
    public static void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

}
