package com.techouts.user_service.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class ProductUpdateRequest {


    @NotNull
    private Integer id;

    @NotBlank
    private String name;

    @Min(value = 1)
    private float price;

    @NotBlank
    private String productDescription;

    @NotBlank
    private String category;

    @NotBlank
    private String productImage;

    @Min(value = 0)
    private int stock;

}
