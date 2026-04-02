package az.edu.ada.wm2.lab6.repository;

// QUESTION2LAB6 — Spring Data repository for Category

import az.edu.ada.wm2.lab6.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
