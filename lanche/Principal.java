package lanche;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	static List<String> ingredientes = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		menuPrincipal();
		
		int opt = sc.nextInt();
		switch(opt) {
			case 1:
				Sanduiche sand = menuSanduiche();
				if(sand.getPreco() == 0.0) {
					System.out.println("Venda cancelada!");
					break;
				}
				finalizarPedido(sand); 
				break;
			case 2:
				Massa massa = menuMassa();
				finalizarPedido(massa);
				break;
			case 3:
				Bolo bolo = menuBolo();
				finalizarPedido(bolo);
				break;
		}
		
	}
	
	
	private static void menuPrincipal() {
		
		System.out.println("+++++++++++Lanchonete!+++++++++++");
		System.out.println("+      [1] -> Sanduiches        +\n+      [2] -> Massas            +\n+      [3] -> Bolos             +");
		System.out.println("++++++++Escolha uma opcao++++++++");
	}
	
	
	private static Sanduiche menuSanduiche() {
		
		boolean bool = true;
		System.out.println("Entre com os ingredientes desejados:\nS - Para fechar o pedido:");
		while(bool) {
			String ingrediente = sc.next();
			if(ingrediente.contains("S")) {
				if(ingredientes.size()==0) {
					Sanduiche sand = new Sanduiche(ingredientes,0.0);
					return sand;
				}
				Sanduiche sand = new Sanduiche(ingredientes,(3.5 * ingredientes.size()));
				return sand;
			}
			adicionarIngrediente(ingredientes, ingrediente);
			System.out.println("\n\nItem: " + ingrediente + " adicionado a lista de ingredientes: \n" + ingredientes);
		}
		Sanduiche sand = new Sanduiche(ingredientes,(3.5 * ingredientes.size()));
		return sand;
		
	}
	
	
	public static boolean adicionarIngrediente(List<String> ingredientes, String ingrediente) {
		
		if(ingredientes.size() >= 12) {
			System.out.println("Limite de ingredientes atingido!");
			return false;
		}
		ingredientes.add(ingrediente);
		return true;
	}
	
	
	private static Bolo menuBolo() {
		
		System.out.println("Digite o sabor da massa:");
		String saborMassa = sc.next();
		System.out.println("Digite o recheio desejado:");
		String recheioBolo = sc.next(); 
		System.out.println("Digite a cobertura do bolo:");
		String coberturaBolo = sc.next();
		List<String> boloToppingsList = new ArrayList<>();
		boloToppingsList.add(coberturaBolo);
		boloToppingsList.add(recheioBolo);
		boloToppingsList.add(saborMassa);
		int peso = pesoBolo(boloToppingsList);
		Bolo bolo = new Bolo((peso * 9.90),saborMassa,recheioBolo,coberturaBolo);
		return bolo;
		
	}
	
	
	private static int pesoBolo(List<String> boloToppings) {
		
		int peso = 0;
		for (String string : boloToppings) {
			if(!string.isEmpty()) {
				peso += 1;
			}
		}return peso;	
	}

	
	private static Massa menuMassa() {
		TipoMassa massa = defineMassa();
		System.out.println("Qual o molho de sua preferencia?");
		String molho = sc.next();
		Massa pedidoMassa = new Massa(30.00,molho,massa);
		return pedidoMassa;
		

		
	}
	
	private static TipoMassa defineMassa() {
		TipoMassa massa = null;
		System.out.println("Qual tipo de massa deseja?\n1-Pizza\n2-Lasanha\n3-Macarrao");
		int massaOpt = sc.nextInt();
		switch(massaOpt) {
			case 1:
				 massa = TipoMassa.PIZZA;
			break;
			case 2:
				 massa = TipoMassa.LASANHA;
			break;
			case 3:
				 massa = TipoMassa.MACARRAO;
			break;
			default:
				System.out.println("Opcao invalida!");
			break;
		}
		return massa;
	}
	
	
	public static void finalizarPedido(Lanche lanchePedido) {
		
		System.out.println("Qual sua distancia do restaurante?");
		int distancia = sc.nextInt();
		System.out.println("Seu pedido sera entregue em "+ lanchePedido.tempoEntrega(distancia)+ " minutos\nValor total: " + lanchePedido.getPreco() + "\nAbaixo os dados do pedido:" + lanchePedido);
	}
}
