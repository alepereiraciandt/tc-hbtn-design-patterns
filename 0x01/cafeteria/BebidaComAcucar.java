import java.util.ArrayList;
import java.util.List;

public class BebidaComAcucar extends BebidaDecorator {
    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }


    @Override
    List<String> obterIngredientes() {
        List<String> drink = super.obterIngredientes();
        drink.add("acucar");
        return drink;
    }

    @Override
    double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
