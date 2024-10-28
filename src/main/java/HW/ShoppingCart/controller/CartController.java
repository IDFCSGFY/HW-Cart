package HW.ShoppingCart.controller;

import HW.ShoppingCart.service.CartServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartServiceImpl cartService;

    public CartController(CartServiceImpl cartService) {
        this.cartService = cartService;
    }

    @GetMapping(path = "/add")
    List<Integer> addProductsToCart(@RequestParam(value = "ID", required = false) List<Integer> products) {
        return cartService.addProducts(products);
    }

    @GetMapping(path = "/get")
    List<Integer> getProductsFromCart() {
        return cartService.getProducts();
    }
}
