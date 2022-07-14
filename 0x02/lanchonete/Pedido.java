import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

//    @Override
//    public String toString() {
//        StringBuilder data = new StringBuilder();
//
//        for (ItemPedido pedido : itensForaCaixa) {
//            data.append("Fora da caixa: \n" + " - ").append(pedido.getTipo()).append(" ").append(pedido.getNome());
//        }
//
//        for (ItemPedido pedido : itensDentroCaixa) {
//            data.append("Dentro da caixa: \n" + " - ").append(pedido.getTipo()).append(" ").append(pedido.getNome());
//        }
//
//        return data.toString();
//    }

    @Override
    public String toString() {
        StringBuilder foraDaCaixa = new StringBuilder("\tFora da Caixa:\n");

        for (ItemPedido item : itensForaCaixa) {
            foraDaCaixa.append(String.format("\t\t- %s %s\n", item.getTipo(), item.getNome()));
        }
        StringBuilder dentroDaCaixa = new StringBuilder("\tDentro da Caixa:\n");
        for (ItemPedido item : itensDentroCaixa) {
            dentroDaCaixa.append(String.format("\t\t- %s %s\n", item.getTipo(), item.getNome()));
        }
        return foraDaCaixa + dentroDaCaixa.toString();
    }

    public HashSet<ItemPedido> getItensDentroCaixa() {
        return itensDentroCaixa;
    }

    public HashSet<ItemPedido> getItensForaCaixa() {
        return itensForaCaixa;
    }
}
