package br.edu.ifrs.canoas.jee.maven.dto;

public class Product {
	 
	private int id;
	private String name;
	private String description;
	private double price;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price < 0){
			
			throw new IllegalArgumentException("Preço não pode ser negativo.");
		}
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
        if (description == null){
			
			throw new NullPointerException("Descrição deve ser preenchida.");
		}
        
       if (description == ""){
			
			throw new IllegalArgumentException("Descrição não pode estar em branco.");
		}
		this.description = description;
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
        if (name == null){
			
			throw new NullPointerException("Nome deve ser preenchido.");
		}
        
        if (name == ""){
			
			throw new IllegalArgumentException("Nome não pode estar em branco.");
		}
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
        if (id <= 0){
			
			throw new NullPointerException("ID deve ser Maior que Zero.");
		}
		this.id = id;
	}
	
}
