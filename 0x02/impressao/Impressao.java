public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;

    private boolean ehFrenteVerso;
    private TamanhoImpressao tamanhoImpressao;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao(int paginasTotais, int paginasColoridas, boolean ehFrenteVerso, TamanhoImpressao tamanhoImpressao) {
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.tamanhoImpressao = tamanhoImpressao;
    }

    public double calcularTotal() {
        int paginasPretoEBranco = (paginasTotais - paginasColoridas);
        double valorTotal = 0.0;


        if (tamanhoImpressao == TamanhoImpressao.A2 && !ehFrenteVerso) {
            valorTotal += 0.22 * paginasPretoEBranco;
            valorTotal += 0.32 * paginasColoridas;
        }
            if (tamanhoImpressao == TamanhoImpressao.A2 && ehFrenteVerso) {
                valorTotal += 0.18 * paginasPretoEBranco;
                valorTotal += 0.28 * paginasColoridas;
            }

        if (tamanhoImpressao == TamanhoImpressao.A3 && !ehFrenteVerso) {
            valorTotal += 0.20 * paginasPretoEBranco;
            valorTotal += 0.30 * paginasColoridas;
        }
            if (tamanhoImpressao == TamanhoImpressao.A3 && ehFrenteVerso) {
                valorTotal += 0.15 * paginasPretoEBranco;
                valorTotal += 0.25 * paginasColoridas;
            }
        if (tamanhoImpressao == TamanhoImpressao.A4 && !ehFrenteVerso) {
            valorTotal += 0.15 * paginasPretoEBranco;
            valorTotal += 0.25 * paginasColoridas;
        }
            if (tamanhoImpressao == TamanhoImpressao.A4 && ehFrenteVerso) {
                valorTotal += 0.10 * paginasPretoEBranco;
                valorTotal += 0.20 * paginasColoridas;
            }

        return valorTotal;
    }


    @Override
    public String toString() {
        String pageInfo = "frente apenas";
        if (ehFrenteVerso) {
            pageInfo = "frente e verso";
        }
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                paginasTotais, paginasColoridas, (paginasTotais - paginasColoridas), pageInfo, calcularTotal());
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public void setTamanhoImpressao(TamanhoImpressao tamanhoImpressao) {
        this.tamanhoImpressao = tamanhoImpressao;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public TamanhoImpressao getTamanhoImpressao() {
        return tamanhoImpressao;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }
}
