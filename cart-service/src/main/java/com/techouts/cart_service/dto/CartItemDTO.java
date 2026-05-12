package com.techouts.cart_service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CartItemDTO {

    @Schema(
            description = "Unique identifier of the cart item",
            example = "10",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private int id;

    @Schema(
            description = "Unique identifier of the product",
            example = "101",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private int productId;

    @Schema(
            description = "Quantity of the product to add",
            example = "2",
            minimum = "1",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private int quantity;

}
