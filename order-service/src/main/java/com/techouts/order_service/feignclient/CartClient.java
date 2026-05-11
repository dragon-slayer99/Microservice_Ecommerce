package com.techouts.order_service.feignclient;

import com.techouts.order_service.config.FeignConfig;
import com.techouts.order_service.dto.CartResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "CART-SERVICE",
                configuration = FeignConfig.class,
                fallback = CartClientFallback.class)
public interface CartClient {

    @GetMapping("/api/cart")
    CartResponseDTO serveCartItems(@RequestHeader("X-User-Id") Integer userId);


    @PostMapping("/api/cart/empty")
    public ResponseEntity<CartResponseDTO> emptyUserCart(@RequestHeader("X-User-Id") Integer userId);
}
