
package br.edu.ifrs.canoas.jee.maven.dao;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifrs.canoas.jee.maven.dto.Product;

public class ProductDAOImplTest {

	private ProductDAO dao;

	@Before
	public void setup(){
		dao = new ProductDAOImpl();
	}

	@Test
	public void testCreateShouldCreateAProduct() {
		Product product = this.getProduct();

		//Busca o produto pelo Id
		Product retrievedProduct = dao.retrieve(product.getId());

		//Verifica que não existe o produto na camada de persistência
		assertThat(retrievedProduct).isNull();

		//Cria um novo produto
		dao.create(product);

		//Busca o produto pelo Id novamente
		retrievedProduct = dao.retrieve(product.getId());

		//Verifica que o produto de nome Phone agora existe.
		assertThat(retrievedProduct.getName()).isEqualTo("Phone");
	}

 	private Product getProduct(){
		Product product = new Product();
		product.setId(1);
		product.setName("Phone");
		product.setDescription("Awesome product!");
		product.setPrice(100.2f);
		return product;
	}

}
                       