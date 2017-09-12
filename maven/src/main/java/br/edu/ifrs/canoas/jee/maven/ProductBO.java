package br.edu.ifrs.canoas.jee.maven.dto;

public interface ProductBO {
	
	public void create (Product product);
	public Product find (Integer id);
}
