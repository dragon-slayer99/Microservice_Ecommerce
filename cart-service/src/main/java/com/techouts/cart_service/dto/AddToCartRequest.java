package com.techouts.cart_service.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "Request object for adding a product to cart")
public class AddToCartRequest {

    @Schema(
            description = "Unique identifier of the product",
            example = "101",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private Integer productId;

    @Schema(
            description = "Quantity of the product to add",
            example = "2",
            minimum = "1",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private Integer quantity;

}
