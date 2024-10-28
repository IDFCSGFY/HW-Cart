package HW.ShoppingCart.service;

import java.util.List;

public interface CartService {
    List<Integer> addProducts(List<Integer> newProducts);

    List<Integer> getProducts();
}
