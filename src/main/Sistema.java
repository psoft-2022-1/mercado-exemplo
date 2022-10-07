package main;

import main.facades.Facade;

public class Sistema {
	
	public static void main(String[] args) {
		
		String jsonP1 = "{\"nome\":\"Leite integral\", \"fabricante\":\"Parmalat\", \"preco\":10.5}";
		
		Facade mercadoFacade = new Facade();
		
		// Adicionando produto ao cat�logo		
		String idP1 = mercadoFacade.criaProduto(jsonP1);
				
		String jsonL1 = "{\"idProduto\":\"" + idP1 + "\", \"quantidade\":10}";;
		
		// Adicionando lote ao cat�logo
		mercadoFacade.criaLote(jsonL1);
		
		// Lista produtos no cat�logo
		System.out.println(mercadoFacade.listaProdutos());
		
		// Lista lotes no cat�logo
		System.out.println(mercadoFacade.listaLotes());
	}
}
