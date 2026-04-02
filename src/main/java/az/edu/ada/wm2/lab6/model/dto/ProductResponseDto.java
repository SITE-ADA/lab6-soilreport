package az.edu.ada.wm2.lab6.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductResponseDto {

    private UUID id;
    private String productName;
    private BigDecimal price;
    private LocalDate expirationDate;
    private List<String> categoryNames = new ArrayList<>();

    public static Builder builder() {
        return new Builder();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public List<String> getCategoryNames() {
        return categoryNames;
    }

    public void setCategoryNames(List<String> categoryNames) {
        this.categoryNames = categoryNames;
    }

    public static class Builder {
        private UUID id;
        private String productName;
        private BigDecimal price;
        private LocalDate expirationDate;
        private List<String> categoryNames;

        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder expirationDate(LocalDate expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder categoryNames(List<String> categoryNames) {
            this.categoryNames = categoryNames;
            return this;
        }

        public ProductResponseDto build() {
            ProductResponseDto dto = new ProductResponseDto();
            dto.setId(id);
            dto.setProductName(productName);
            dto.setPrice(price);
            dto.setExpirationDate(expirationDate);
            if (categoryNames != null) {
                dto.setCategoryNames(categoryNames);
            }
            return dto;
        }
    }
}
