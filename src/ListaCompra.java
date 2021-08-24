import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCompra {
    public static void main(String[] args) throws Exception {
        ArrayList<String> listaProduto = new ArrayList();
        Scanner ler = new Scanner(System.in);
        String opcao;
        do {
            escreverMenu();
            opcao = ler.nextLine();
            switch (opcao) {
                case "1":
                    listaProduto.add(AdicionarProduto());
                    break;
                case "2":
                    alterarProduto(listaProduto);
                    break;
                case "3":
                    listaProduto.remove(excluirProduto());
                    break;
                case "4":
                    exibitLista(listaProduto);
                    break;
                default:
                    System.out.println("Valor Digitado inválido!");
                    break;
            }
        } while (true);
    }

    public static void escreverMenu() {
        System.out.println("|-------- Lista de compras ---------|");
        System.out.println("|1 - Cadastrar produto e quantidade |");
        System.out.println("|2 - Alterar produto e quantidade   |");
        System.out.println("|3 - Excluir Produto                |");
        System.out.println("|4 - Exibir Lista                   |");
        System.out.println("|-----------------------------------|");
    }

    public static String AdicionarProduto() {

        return preencherProduto();
    }

    public static void exibitLista(List listaCompra) {
        int contador = 1;
        System.out.println("\n|-------- Lista de compras ---------|");
        System.out.println("|Indice - Nome - Quantidade - Marca |");
        for (int i = 0; i < listaCompra.size(); i++) {
            System.out.println("| (" + contador + ") - " + listaCompra.get(i).toString().replace("|", " - "));
            contador++;
        }

        System.out.println("|-----------------------------------|\n");
    }

    public static void alterarProduto(List listaCompra){
        Scanner ler = new Scanner(System.in);
        exibitLista(listaCompra);
        System.out.println("Digite o numero do produto que deseja alterar!");
        int indice = ler.nextInt() - 1;
        listaCompra.set(indice, preencherProduto());
    }

    public static int excluirProduto(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero do produto que deseja alterar!");
        int indice = ler.nextInt() - 1;
        return indice;
    }

    public static String preencherProduto(){
        String produto, marca, quantidade;


        Scanner ler = new Scanner(System.in);
        System.out.println("DIgite o nome do produto!");
        produto = ler.nextLine();
        System.out.println("DIgite a quantidade do produto!");
        quantidade = ler.nextLine();
        produto = produto + "|" + quantidade;
        System.out.println("Digite a marca de preferencia!");
        marca = ler.nextLine();
        
        if (marca.equals(""))
            marca = "Nenhuma Marca";
        produto = produto + "|" + marca;
        
        return produto;
    }
}
