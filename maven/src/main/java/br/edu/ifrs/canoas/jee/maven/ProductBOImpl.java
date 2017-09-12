package br.edu.ifrs.canoas.jee.maven.dto;

public class ProductBOImpl implements ProductBO{
	
	private ProductDAOImpl pDAO = new ProductDAOImpl();
	public void create (Product product){
		
		pDAO.create(product);
	}
	
	public Product find(Integer id){
		
		return pDAO.retrieve(id);
	}
}
