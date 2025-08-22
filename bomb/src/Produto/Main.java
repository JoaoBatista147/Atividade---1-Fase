package Produto;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Sistema sistema=new Sistema();
		Scanner sc=new Scanner (System.in);
		int opcao;
		 do {
	            System.out.println("---Menu----");
	            System.out.println("1 - Adicionar");
	            System.out.println("2 - Listar");
	            System.out.println("3 - Buscar");
	            System.out.println("4 - Remover");
	            System.out.println("5 - Sair");
	            System.out.println("\nDigite a sua opção:");
	            opcao = sc.nextInt();
	            sc.nextLine();
		
	            switch(opcao) {
	            case 1:
	    case 2:
			sistema.listarProdutos();
			break;
		case 3:
			sistema.buscarProduto(sc);
			break;
		case 4:
		    try {
		        sistema.removerProduto(sc);
		    } catch (Exception e) {
		        System.out.println("Erro ao remover produto: " + e.getMessage());
		    }
		    break;
         default:
             break;
	    }
	        } while (opcao != 5);
		 	System.out.println("Saindo do Sistema!");

	        sc.close();
		 }
	}
