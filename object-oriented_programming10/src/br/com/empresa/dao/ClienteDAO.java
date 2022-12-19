package br.com.empresa.dao;

import br.com.empresa.negocio.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
 
public class ClienteDAO {
 
  //Método que retorna a lista de clientes do sistema
  public List<Cliente> getListaClientes() {
 
    try {
      //Conecta ao banco através da classe de conexão
      Conecta con = new Conecta();
      con.getConecta();
 
      //Select na tabela cliente
      String sql = "select * from cliente;";
 
      //Executa a query
      PreparedStatement comando = con.getConecta().prepareStatement(sql);
      ResultSet resultado = comando.executeQuery();
 
      //Prepara a lista de lientes para retornar
      List<Cliente> listaCliente = new ArrayList<Cliente>();
 
      //para cada item retornado no select, faça...
      while (resultado.next()) {
        Cliente c = new Cliente(); //Cria um cliente novo na memória
        c.setCodigo(resultado.getInt("codigo")); //Seta o Codigo
        c.setNome(resultado.getString("nome")); //Seta o nome
 
        //insere o cliente na lista local
        listaCliente.add(c);
      }
 
      //Ao terminar o laço, fecha a conexão
      resultado.close();
      comando.close();
      con.getConecta().close();
 
      //Retorna a lista de clientes
      return listaCliente;
 
    } catch (Exception e) { //Se der algum excessão...
       System.out.println(e.getMessage());
       return null;
    }
  }

  public boolean insereCliente(Cliente c) {
    try {
      Conecta conexao = new Conecta();
      conexao.getConecta();
 
         String sql = "";
         sql += "insert into cliente (codigo,nome)";
         sql += " values";
         sql += "(" + c.getCodigo() + ",'" + c.getNome() + "')";
 
         PreparedStatement comando = conexao.getConecta().prepareStatement(sql);
         comando.executeUpdate(sql);
         return true; // se inseriu, retorna verdadeiro.
 
        } catch (Exception e) { // Se deu algum erro...
           System.out.println(e.getMessage());
           return false;
      }
   }
}
