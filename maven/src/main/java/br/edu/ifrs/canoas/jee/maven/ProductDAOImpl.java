package br.edu.ifrs.canoas.jee.maven.dto;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifrs.canoas.jee.maven.dto.Product;

public class ProductDAOImpl implements ProductDAO{

		private Map <Integer, Product> products = new HashMap<Integer, Product>();
		
		
		public void create(Product product) {
			
			products.put(product.getId(), product);
			if (products.containsKey(product.getId())){
				
				throw new IllegalArgumentException("ID de produto já existe.");
			}
		}

		public Product retrieve(int id) {
			
			if (!products.containsKey(id)){
				
				throw new IllegalArgumentException("ID de produto não existe.");
				
			}
			return products.get(id);
		}

		public void update(Product product) {
			products.replace(product.getId(), product);

		}

		public void delete(int id) {
			if (!products.containsKey(id)){
				
				throw new IllegalArgumentException("ID de produto não existe.");
				
			}
			products.remove(id);
		}
}
