package br.edu.ifrs.canoas.jee.maven.dto;

public interface ProductDAO {

	public abstract void create (Product product);
    public abstract Product retrieve (int id);
    public abstract void update(Product product);
    public abstract void delete(int id);

}
