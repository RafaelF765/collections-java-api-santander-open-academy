import carrinho_compras.Compra;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Compra compras = new Compra();
        compras.adicinarProduto("Arroz", 5.50, 3);
        compras.adicinarProduto("Feijão", 8.50, 1);
        compras.adicinarProduto("Açucar", 10.50, 1);
        compras.adicinarProduto("Macarrão", 3.50, 3);
        compras.adicinarProduto("Leite", 6.50, 5);

        compras.obterlistaCompras();
        System.out.println(compras.obterSubTotal());
    }
}