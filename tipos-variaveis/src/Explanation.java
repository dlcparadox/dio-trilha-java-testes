public class Explanation {
    public static void main(String[] args) {
        
        String [] nomes;

        nomes = new String[5]; // Inicializa o array de strings com 5 elementos

        nomes[0] = "Joshuah"; // Atribui o valor "Joshuah" ao primeiro elemento do array
        nomes[1] = "Lucas"; // Atribui o valor "Lucas" ao segundo elemento do array
        nomes[2] = "Gustavo"; // Atribui o valor "Gustavo" ao terceiro elemento do array
        nomes[3] = "Gabriel"; // Atribui o valor "Gabriel" ao quarto elemento do array
        nomes[4] = "Matheus"; // Atribui o valor "Matheus" ao quinto elemento do array
        nomes[5] = "Lucas"; // Atribui o valor "Lucas" ao sexto elemento do array (isso causará um erro de ArrayIndexOutOfBoundsException, pois o array só tem 5 elementos)

        System.out.println("Nomes: " + nomes[0] + ", " + nomes[1] + ", " + nomes[2] + ", " + nomes[3] + ", " + nomes[4]); // Imprime os valores dos elementos do array
    }
}
