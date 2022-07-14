import java.util.ArrayList;
import java.util.List;

public class BebidaComLeite extends BebidaDecorator {

    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    List<String> obterIngredientes() {
        List<String> drink = super.obterIngredientes();
        drink.add("leite");
        return drink;
    }

    @Override
    double obterPreco() {
        return super.obterPreco() + 3.2;
    }

}
