package org.example;

public class Consulta {
    Dao dao = new Dao();
    int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void materialTabela() {

       dao.realizarConsulta(id);
   }
}
