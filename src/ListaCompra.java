import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCompra {
    public static void main(String[] args) throws Exception {
        ArrayList<String> listaProduto = new ArrayList();
        Scanner ler = new Scanner(System.in);
        String opcao;
        do {
            new Telas().escreverMenu();
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
                    new Telas().exibitLista(listaProduto);
                    break;
                default:
                    System.out.println("Valor Digitado inválido!");
                    break;
            }
        } while (true);
    }

    public static String AdicionarProduto() {

        return preencherProduto();
    }

    public static void alterarProduto(List listaCompra){
        Scanner ler = new Scanner(System.in);
        new Telas().exibitLista(listaCompra);
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
