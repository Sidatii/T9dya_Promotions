package com.marjane.marjanepromotion.Product;
import com.marjane.marjanepromotion.Product.DTO.ProductRequestDTO;
import com.marjane.marjanepromotion.Product.DTO.ProductResponseDTO;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/all")
    public Page<ProductResponseDTO> GetProductList(Pageable pageable){
        return productService.getProducts(pageable);
    }

    @PostMapping(path = "/create")
    public ProductResponseDTO Add(@RequestBody @Valid ProductRequestDTO productRequestDTO){
        return productService.addProduct(productRequestDTO);
    }
}
