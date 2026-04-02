package az.edu.ada.wm2.lab6.model.mapper;

import az.edu.ada.wm2.lab6.model.Category;
import az.edu.ada.wm2.lab6.model.Product;
import az.edu.ada.wm2.lab6.model.dto.ProductRequestDto;
import az.edu.ada.wm2.lab6.model.dto.ProductResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toEntity(ProductRequestDto dto) {
        return Product.builder()
                .productName(dto.getProductName())
                .price(dto.getPrice())
                .expirationDate(dto.getExpirationDate())
                .build();
    }

    @Override
    public ProductResponseDto toResponseDto(Product product) {
        List<String> names = new ArrayList<>();
        if (product.getCategories() != null) {
            for (Category c : product.getCategories()) {
                if (c != null && c.getName() != null) {
                    names.add(c.getName());
                }
            }
        }
        return ProductResponseDto.builder()
                .id(product.getId())
                .productName(product.getProductName())
                .price(product.getPrice())
                .expirationDate(product.getExpirationDate())
                .categoryNames(names)
                .build();
    }
}
