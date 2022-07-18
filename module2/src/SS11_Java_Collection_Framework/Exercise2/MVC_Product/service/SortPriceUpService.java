package SS11_Java_Collection_Framework.Exercise2.MVC_Product.service;

import SS11_Java_Collection_Framework.Exercise2.MVC_Product.model.Product;

import java.util.Comparator;

public class SortPriceUpService implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
