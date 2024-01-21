package controle;

import java.sql.SQLException;

import Modelo.SpdaModelo;
import dao.SPDADao;

public class SPDAControle {
     private SpdaModelo planilha;

    public SPDAControle() {
        this.planilha = new SpdaModelo();
    }

    public void realizarConsulta(int id) {
        try {
        SPDADao planilhaDAO = new SPDADao();
            this.planilha = planilhaDAO.obterPorId(id);
        } catch (SQLException e) {
            System.out.println("Erro durante a consulta: " + e.getMessage());
        }
    }

   public String obterNomeMaterial(int id) {
        realizarConsulta(id);
        return this.planilha.getMaterial();
    }

    public float obterValorUnidade(int id) {
        realizarConsulta(id);
        return this.planilha.getValorUnidade();
    }
}
