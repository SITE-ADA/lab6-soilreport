package az.edu.ada.wm2.lab6.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(exclude = "products")
public class Category {

    @Id
    @EqualsAndHashCode.Include
    private UUID id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "categories")
    private List<Product> products = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public Category(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    @PrePersist
    void prePersist() {
        if (this.id == null) {
            this.id = UUID.randomUUID();
        }
    }
}
