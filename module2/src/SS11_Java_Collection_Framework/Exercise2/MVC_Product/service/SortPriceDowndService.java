package SS11_Java_Collection_Framework.Exercise2.MVC_Product.service;

import SS11_Java_Collection_Framework.Exercise2.MVC_Product.model.Product;

import java.util.Comparator;

public class SortPriceDowndService implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int)(o2.getPrice() - o1.getPrice());
    }
}
