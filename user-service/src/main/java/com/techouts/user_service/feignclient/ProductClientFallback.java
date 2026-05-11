package com.techouts.user_service.feignclient;

import com.techouts.user_service.dto.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductClientFallback implements ProductClient {


    @Override
    public ProductDTO updateProductDetails(ProductDTO newProductDetails) {
        return new ProductDTO("Product service is out");
    }

    @Override
    public ProductDTO addNewProductToCollection(ProductDTO newProduct) {
        return new ProductDTO("Product service is out");
    }
}
