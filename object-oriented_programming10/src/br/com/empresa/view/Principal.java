package br.com.empresa.view;

import br.com.empresa.dao.ClienteDAO;
import br.com.empresa.negocio.Cliente;
import java.util.ArrayList;
import java.util.List;
 
public class Principal {
 
  public static void main(String args[]) {
    listaTodosClientes();
 
    // Inserir um cliente novo no banco:
    // Cria a instância e seta os valores
    Cliente cliente = new Cliente();
    cliente.setCodigo(4444);
    cliente.setNome("Pedro");
 
    //Insere...
    ClienteDAO cD = new ClienteDAO();
    cD.insereCliente(cliente);
    System.out.println("\n\nCliente inserido!\n\n");
 
    //Vamos listar todos os clientes agora, para ver o novo cliente na lista...
    listaTodosClientes();
    }
 
    //Método de listagem de todos os clientes
    public static void listaTodosClientes() {
 
      //Cria uma instância de ClienteDAO na memória
      ClienteDAO cliente = new ClienteDAO();
 
      //Cria a lista de clientes local, que será preenchida
      List<Cliente> listaDeClientes = new ArrayList<Cliente>();
 
      //Obtém a lista de clientes através do objeto
      listaDeClientes = cliente.getListaClientes();
 
      //Começa a imprimir os dados
      System.out.println("Codigo\t|\tNome");
        System.out.println("----\t|\t-----");
        for (Cliente clienteLocal : listaDeClientes) { //Para cada cliente na lista de clientes...
            System.out.print(clienteLocal.getCodigo() + "\t|\t");
            System.out.print(clienteLocal.getNome());
            System.out.println();
        }
    }
}