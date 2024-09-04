import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinhocompra;

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhocompra.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaremover = new ArrayList<>();
        for (Item item : carrinhocompra){
            if (item.getNome().equals(nome)){
                listaremover.add(item);
            }
        }
        carrinhocompra.removeAll(listaremover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Item item : carrinhocompra){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }


    public void exibirItens(){
        for (Item item : carrinhocompra){
            System.out.println("Nome: " + item.getNome() + " Preço: " + item.getPreco() +" Quantidade: " + item.getQuantidade());
        }
    }

}

