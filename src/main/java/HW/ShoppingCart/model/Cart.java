package HW.ShoppingCart.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Integer> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProducts(List<Integer> newProducts) {
        products.addAll(newProducts);
    }

    public List<Integer> getProducts() {
        return products;
    }
}
