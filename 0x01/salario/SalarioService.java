import java.util.UUID;

public class SalarioService {
    private final CalculadorSalarioService calculador = CalculadorSalarioService.getCalculadorSalarioService();

    double calcular(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao) {
        return calculador.calcularSalarioLiquido(salarioBruto, valorDescontos, valorVendas, percentualComissao);
    }

    public UUID getUuid() {
        return calculador.uuid;
    }
}
