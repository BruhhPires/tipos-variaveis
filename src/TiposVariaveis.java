public class TiposVariaveis {
    
    public static void main(String[] args) {
        
        short numeroPequento = 1;
        int numeroMaior = numeroPequento;
        short numeroPequento2 = (short) numeroMaior; // SÓ ACEITARÁ COM O CAST, POIS NÃO PODE DE INT PRA SHOT APENAS DE SHOT PRA INT

        int numero = 5;
        numero = 10;

        System.out.println(numero);

        final double PI =  3.14;  // <--- A CONSTANTE É DEFINIDA POR 'FINAL' TODAVIA POR CONVENSÃO É ULTILIZADO CAIXA ALTA PARA CONSTANTES

    }
}
