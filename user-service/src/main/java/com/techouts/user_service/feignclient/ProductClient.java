package com.techouts.user_service.feignclient;

import com.techouts.user_service.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.techouts.user_service.dto.ProductDTO;

import jakarta.validation.Valid;


@FeignClient(name = "PRODUCT-SERVICE",
        configuration = FeignConfig.class,
        fallback = ProductClientFallback.class
)
public interface ProductClient {

    @PatchMapping("{id}/update")
    ProductDTO updateProductDetails(@Valid @ModelAttribute ProductDTO newProductDetails);

    @PostMapping("add")
    ProductDTO addNewProductToCollection(@Valid @ModelAttribute ProductDTO newProduct);

}
