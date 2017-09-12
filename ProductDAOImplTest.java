package br.edu.ifrs.canoas.jee.maven.dto;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import br.edu.ifrs.canoas.jee.maven.dto.Product;

public class ProductDAOImplTest {

	private ProductDAO dao;
	private Product p;

	@Before
	public void setup(){
		p = getProduct();
		dao = new ProductDAOImpl();
	}


 	private Product getProduct(){
		Product product = new Product();
		product.setId(1);
		product.setName("Phone");
		product.setDescription("Awesome product!");
		product.setPrice(100.2f);
		return product;
			
	}
 	
 	@Test (expected = IllegalArgumentException.class)
 	public void testIDEquals(){
 		dao.create(p);
 		
 		try{
 			dao.create(p);
 			
 		}catch (IllegalArgumentException e){
 			assertThat("ID de produto já existe.", e.getMessage(), is("ID de produto já existe."));
 			throw e;
 		}
 	}
 	
 	@Test (expected = IllegalArgumentException.class)
 	public void testeRetrieveID(){
 
 		try{
 			dao.retrieve(5);
 			
 		}catch(IllegalArgumentException e){
 			assertThat("ID de produto não existe.", e.getMessage(), is("ID de produto não existe."));
 			throw e;
 		}
 	}
 	
 	@Test (expected = IllegalArgumentException.class)
 	public void testDeleteID(){
 
 		try{
 			dao.delete(5);
 			
 		}catch(IllegalArgumentException e){
 			assertThat("ID de produto não existe.", e.getMessage(), is("ID de produto não existe."));
 			throw e;
 		}
 	}
 	
 	@Test (expected = IllegalArgumentException.class)
 	public void testPreco(){
 		
 		try{
 			p.setPrice(-1);
 			
 		}catch (IllegalArgumentException e){
 			
 			assertThat("Preço não pode ser negativo.", e.getMessage(), is("Preço não pode ser negativo."));
 			throw e;
 		}
 	}
 	
 	@Test (expected = NullPointerException.class)
 	public void testDescricaoNull(){
 		
 		try{
 			p.setDescription(null);
 			
 		}catch (NullPointerException e){
 			
 			assertThat("Descrição deve ser preenchida.", e.getMessage(), is("Descrição deve ser preenchida."));
 			throw e;
 		}
 		
 	}
 	
 	@Test (expected = IllegalArgumentException.class)
 		public void testDescricaoBranco(){
 			
 			try{
 	 			p.setDescription("");
 	 			
 	 		}catch (IllegalArgumentException e){
 	 			
 	 			assertThat("Descrição não pode estar em branco.", e.getMessage(), is("Descrição não pode estar em branco."));
 	 			throw e;
 	 		}
 			
 		}
 	
 	@Test (expected = NullPointerException.class)
 	public void testNameNull(){
 		
 		try{
 			p.setName(null);
 			
 		}catch (NullPointerException e){
 			
 			assertThat("Nome deve ser preenchido.", e.getMessage(), is("Nome deve ser preenchido."));
 			throw e;
 		}
 		
 	}
 	
 	@Test (expected = IllegalArgumentException.class)
 		public void testNameBranco(){
 			
 			try{
 	 			p.setName("");
 	 			
 	 		}catch (IllegalArgumentException e){
 	 			
 	 			assertThat("Nome não pode estar em branco.", e.getMessage(), is("Nome não pode estar em branco."));
 	 			throw e;
 	 		}
 			
 		}
 	@Test (expected = NullPointerException.class)
 	public void testIDMaiorqueZero(){
 		try{
	 			p.setId(-1);
	 			
	 		}catch (NullPointerException e){
	 			
	 			assertThat("ID deve ser Maior que Zero.", e.getMessage(), is("ID deve ser Maior que Zero."));
	 			throw e;
	 		}
 		
 	}
 		
 	}


