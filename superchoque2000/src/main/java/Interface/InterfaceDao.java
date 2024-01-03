/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import java.sql.SQLException;

/**
 *
 * @author Usuario03
 */
public interface InterfaceDao {
    public void salvarDao(Object... valores);
    public void consultarDao(Object... valores)throws SQLException;
    public void excluirDao(int id);
}
