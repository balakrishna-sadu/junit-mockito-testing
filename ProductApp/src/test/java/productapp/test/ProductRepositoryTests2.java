package productapp.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import productapp.Product;
import productapp.ProductRepository;

@DataJpaTest
public class ProductRepositoryTests2 {
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private ProductRepository repository;
	
	@Test
	public void testSaveNewProduct() {
		entityManager.persist(new Product("iPhone 10", 1099));
				
		Product product = repository.findByName("iPhone 10");
		
		assertThat(product.getName()).isEqualTo("iPhone 10");
	}
}
