package az.edu.ada.wm2.lab6.model.dto;

// QUESTION3LAB6

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class ProductRequestDto {

    private String productName;
    private BigDecimal price;
    private LocalDate expirationDate;
    private List<UUID> categoryIds;

    public static Builder builder() {
        return new Builder();
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

    public List<UUID> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<UUID> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public static class Builder {
        private String productName;
        private BigDecimal price;
        private LocalDate expirationDate;
        private List<UUID> categoryIds;

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

        public Builder categoryIds(List<UUID> categoryIds) {
            this.categoryIds = categoryIds;
            return this;
        }

        public ProductRequestDto build() {
            ProductRequestDto dto = new ProductRequestDto();
            dto.setProductName(productName);
            dto.setPrice(price);
            dto.setExpirationDate(expirationDate);
            dto.setCategoryIds(categoryIds);
            return dto;
        }
    }
}
