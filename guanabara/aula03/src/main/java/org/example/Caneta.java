package org.example;

public class Caneta {
    public String cor ;
    public String modelo ;
    private float ponta;

   protected int carga;
   private boolean tampada;

   public void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Ponta "+this.ponta);
        System.out.println("Carga: "+this.carga);

        System.out.println(" está tampada? "+this.tampada);
    }

   public void  rabiscar (){
        if(this.tampada ){
            System.out.println("Erro, nao posso rabiscar");
        }else {
            System.out.println("Estou Rabiscando");
        }

    }
   public void tampar(){
        this.tampada= true;

    }
    public void destampar(){
        this.tampada= false;

    }

}
