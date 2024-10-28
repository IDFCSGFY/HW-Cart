package HW.ShoppingCart.service;

import HW.ShoppingCart.model.Cart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class CartServiceImpl implements CartService {
    private final Cart cart;

    public CartServiceImpl() {
        this.cart = new Cart();
    }

    @Value("${maxExistingID}")
    private String maxExistingID;

    @Override
    public List<Integer> addProducts(List<Integer> newProducts) {
        if (newProducts.isEmpty()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < newProducts.size(); i++) {
            if (newProducts.get(i) <= 0 || newProducts.get(i) > Integer.parseInt(maxExistingID)) {
                newProducts.remove(i);
            }
        }
        cart.addProducts(newProducts);
        return List.copyOf(newProducts);
    }

    @Override
    public List<Integer> getProducts() {
        return List.copyOf(cart.getProducts());
    }
}
