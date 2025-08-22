package Produto;

import java.util.Scanner;
import Produto.PrecoInvalidoException;
import Produto.CategoriaInvalidaException;
import Produto.CodigoDuplicadoException;
import Produto.ProdutoNaoEncontradoException;


public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner sc = new Scanner(System.in);
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

            switch (opcao) {
                case 1:
                       try {
                        sistema.adicionarProduto(sc);
                        } catch (PrecoInvalidoException e) {
                        System.out.println("Preço inválido: " + e.getMessage());
                         } catch (CodigoDuplicadoException e) {
                        System.out.println("Código duplicado: " + e.getMessage());
                        } catch (CategoriaInvalidaException e) {
                        System.out.println("Categoria inválida: " + e.getMessage());
                        }
                            break;

                   case 2:
                    sistema.listarProdutos();
                    break;

                case 3:
                    try {
                        sistema.buscarProduto(sc);
                    } 
                    catch (ProdutoNaoEncontradoException e) {
                        System.out.println("Erro ao buscar produto: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        sistema.removerProduto(sc);
                    } 
                    catch (ProdutoNaoEncontradoException e) {
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
