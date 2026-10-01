import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 3500.00));
        produtos.add(new Produto("Mouse", 120.50));
        produtos.add(new Produto("Teclado", 250.00));
        produtos.add(new Produto("Monitor", 1800.00));

        System.out.println("Produtos ordenados pelo preço:");

        ListaUtil.ordenarExibir(produtos);
    }
}