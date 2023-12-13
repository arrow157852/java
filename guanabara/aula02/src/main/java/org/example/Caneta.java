package org.example;

public class Caneta {
    String cor ;
    String modelo ;
    float ponta;

    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Ponta "+this.ponta);
        System.out.println("Carga: "+this.carga);

        System.out.println(" está tampada? "+this.tampada);
    }

    void  rabiscar (){
        if(this.tampada ){
            System.out.println("Erro, nao posso rabiscar");
        }else {
            System.out.println("Estou Rabiscando");
        }

    }
    void tampar(){
        this.tampada= true;

    }
    void destampar(){
        this.tampada= false;

    }

}
