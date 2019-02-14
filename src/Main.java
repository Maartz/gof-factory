public class Main {

    public static void main(String[] args) {
        Factory client = new Factory();
        Produit product = client.getProduit(1);
        System.out.println(product.Operation1());
        Produit product2 = client.getProduit(22);
        System.out.println(product2.Operation1());
    }
}
