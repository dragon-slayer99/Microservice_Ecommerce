package com.techouts.cart_service.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Schema(description = "Request object for updating cart item quantity")
public class UpdateCartRequest {
    @Schema(
            description = "Updated quantity for the cart item",
            example = "3",
            minimum = "1",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private Integer quantity;
}
