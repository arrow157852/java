package org.example;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int raunds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1 , Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1!= l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);


        }else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }

    }
    public void lutar(){
        if (this.isAprovada()){
            
        }

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRaunds() {
        return raunds;
    }

    public void setRaunds(int raunds) {
        this.raunds = raunds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
