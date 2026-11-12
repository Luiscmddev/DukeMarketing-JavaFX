package br.dev.luis.dukemarket.javafx.DAO;

import br.dev.luis.dukemarket.javafx.model.Cliente;
import br.dev.luis.dukemarket.javafx.model.Produto;
import connection.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sesi2dib
 */
public class ClienteDAO {
    
    private static final String SQL_INSERT = "INSERT INTO Produtos(codBarras, "
            + "descricao, qtd, ValorCompra, ValorVenda)"
            + "VALUES (?, ?, ?, ?, ?)";

    private static final String SQL_SELECT_ALL = "SELECT * FROM Produtos";
    private static final String SQL_SELECT_ID = "SELECT * FROM Produtos "
            + "WHERE id = ?";

    private static final String SQL_UPDATE = " UPDATE Produtos SET codBarras = ?, "
            + "descricao = ?, qtd = ?, valorCompra = ?, valorVenda = ? "
            + "WHERE id = ?";

    private static final String SQL_DELETE = "DELETE FROM Produtos WHERE id = ?";
    
    public void create(Produto p) {

        Connection conn = MySQLConnection.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, p.getCodBarras());
            stmt.setString(2, p.getDescricao());
            stmt.setDouble(3, p.getQtd());
            stmt.setDouble(4, p.getValorCompra());
            stmt.setDouble(5, p.getValorVenda());

            int auxRetorno = stmt.executeUpdate();

            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null,
                    "inclusao: " + auxRetorno);

        } catch (SQLException sQLException) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null,
                    sQLException);
        } finally {
            MySQLConnection.closeConnection(conn, stmt);
        }

    }
    
}
