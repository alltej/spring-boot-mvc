package alltej.springframework.services.reposervices;


import alltej.springframework.commands.ProductForm;
import alltej.springframework.converters.ProductFormToProduct;
import alltej.springframework.domain.Product;
import alltej.springframework.repositories.ProductRepository;
import alltej.springframework.services.ProductService;
//import alltej.springframework.services.SendTextMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by at on 12/18/16.
 */
@Service
@Profile({"springdatajpa"})
public class ProductServiceRepoImpl implements ProductService {

    private ProductRepository productRepository;
    private ProductFormToProduct productFormToProduct;
    //private SendTextMessageService sendTextMessageService;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Autowired
    public void setProductFormToProduct(ProductFormToProduct productFormToProduct) {
        this.productFormToProduct = productFormToProduct;
    }

//    @Autowired
//    public void setSendTextMessageService(SendTextMessageService sendTextMessageService) {
//        this.sendTextMessageService = sendTextMessageService;
//    }

    @Override
    public List<?> listAll() {

        //sendTextMessageService.sendTextMessage("Listing Products");

        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add); //fun with Java 8
        return products;
    }

    @Override
    public Product getById(Integer id) {
        //sendTextMessageService.sendTextMessage("Requested Product ID: " + id);

        return productRepository.findOne(id);
    }

    @Override
    public Product saveOrUpdateProductForm(ProductForm productForm) {
        return saveOrUpdate(productFormToProduct.convert(productForm));
    }

    @Override
    public Product saveOrUpdate(Product domainObject) {
        return productRepository.save(domainObject);
    }

    @Override
    public void delete(Integer id) {
        productRepository.delete(id);
    }
}
