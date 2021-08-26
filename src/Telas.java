import java.util.List;

public class Telas {

  public static void escreverMenu() {
    System.out.println("|-------- Lista de compras ---------|");
    System.out.println("|1 - Cadastrar produto e quantidade |");
    System.out.println("|2 - Alterar produto e quantidade   |");
    System.out.println("|3 - Excluir Produto                |");
    System.out.println("|4 - Exibir Lista                   |");
    System.out.println("|-----------------------------------|");
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
}
