public class ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao tamanho, int totalPaginas, int totalPaginasColoridas, boolean ehFrenteVerso) {
        return new Impressao(totalPaginas, totalPaginasColoridas, ehFrenteVerso, tamanho);
    }
}
