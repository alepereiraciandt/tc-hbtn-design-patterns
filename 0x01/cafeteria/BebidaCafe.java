import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida {

    @Override
    public List<String> obterIngredientes() {
        List<String> drink = new ArrayList<>();
        drink.add("cafe");
        return drink;
    }

    @Override
    public double obterPreco() {
        return 5.35;
    }
}
