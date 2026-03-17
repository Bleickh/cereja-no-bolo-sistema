package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Produto;
import util.Conexao;

public class ProdutoDAO {

    public void cadastrarProduto(Produto produto) {

        String sql = "INSERT INTO produto(nome, preco, categoria_id) VALUES (?, ?, ?)";

        try {

            Connection conn = Conexao.conectar();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getPreco());
            ps.setInt(3, produto.getCategoriaId());

            ps.execute();

            ps.close();
            conn.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}