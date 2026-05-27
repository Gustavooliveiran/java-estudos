public class ControleEstoque {

    public static void main(String[] args) {

        String[] produtos = {"Notebook", "Mouse", "Teclado"};
        int[] estoque = {5, 20, 10};

        System.out.println("Controle de estoque:");

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i] + " - Quantidade: " + estoque[i]);
        }
    }
}
