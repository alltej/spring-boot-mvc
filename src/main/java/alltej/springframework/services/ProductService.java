package alltej.springframework.services;

import alltej.springframework.commands.ProductForm;
import alltej.springframework.domain.Product;

/**
 * Created by at on 11/6/16.
 */
public interface ProductService extends CRUDService<Product> {

    Product saveOrUpdateProductForm( ProductForm productForm );

}
