package com.example.product_api.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    
    @Test
    public void testProductCreation() {
        // Membuat instance product
        Product product = new Product(1L, "Laptop", 15000000.0, 10);

        // Memverifikasi nilai-nilai
        assertEquals(1L, product.getId());
        assertEquals("Laptop", product.getName());
        assertEquals(15000000.0, product.getPrice());
        assertEquals(10, product.getStock());
    }

    @Test
    public void testNoArgsConstructor(){
        // Membuat instance dengan constructor kosong
        Product product = new Product();
        assertNotNull(product);
    }
}
