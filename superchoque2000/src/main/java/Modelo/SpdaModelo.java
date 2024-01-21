/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario03
 */
public class SpdaModelo {
   private String material;
    private float valorUnidade;

    public String getMaterial() {
    return material;
}

public void setMaterial(String material) {
    this.material = material;
}

   
    // Construtores, getters e setters

    public float getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(float valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    // Método para popular a classe a partir do ResultSet
    public void popularDados(ResultSet rs) throws SQLException {
        while (rs.next()) {
            this.material = rs.getString("material");
            this.valorUnidade = rs.getFloat("valor_unidade");
        }
    }
}
