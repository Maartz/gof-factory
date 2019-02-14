public class Factory {
    Produit getProduit(int id){
        if (id % 2 == 0){
            return new ProductA();
        } else {
            return new ProductB();
        }
    }
}
