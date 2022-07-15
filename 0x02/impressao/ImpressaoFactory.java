public class ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao tamanho, int totalPaginas, int totalPaginasColoridas, boolean ehFrenteEVerso) {
        return new Impressao(totalPaginas, totalPaginasColoridas, ehFrenteEVerso, tamanho);
    }
}
