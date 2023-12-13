package org.example;

import java.math.MathContext;
import java.util.Objects;

public class ContaBanco {
    public int numConta;
    protected String tipo;//(conta poupança ou conta corrente)
    private String dono;
    private float saldo;
    private boolean status;

    public void  estado(){
        System.out.println("-----------------------------------------");
        System.out.println("Numero da conta:"+this.getNumConta());
        System.out.println("Tipo:"+ this.getTipo());
        System.out.println("Dono"+this.getDono());
        System.out.println("Saldo: R$ "+this.getSaldo());
        System.out.println("Status: " +this.getStatus());
    }

    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0);
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);

        if (Objects.equals(tipo, "cc")){
            this.setSaldo(50);
        } else if (Objects.equals(this.getTipo(), "cp")) {
            this.setSaldo(150);
        }else {

            do {
                System.out.println("digite uma opção valida");
            }while (this.getTipo()!= "cc"  || this.getTipo()!= "cp");

        }
        System.out.println("você abriu sua conta "+ this.getTipo());


    }
    public void fecharConta(){
        while (this.getSaldo()!= 0){


            if (this.getSaldo() > 0) {
                System.out.println("retire seus R$ " + this.getSaldo());
            } else if (this.getSaldo() < 0) {
                System.out.println("pague a divida  no valor de R$ " + this.getSaldo());
            }
        }
        this.setStatus(false);
        System.out.println("conta fechada com suceso");
    }




    public void depositar(float v){
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("deposito relizado na conta de"+ this.getDono());
        }else {
            System.out.println("não é possivel realizar deposito em uma conta inexistente");
        }
    }
    public void sacar(float v){
        if(this.getStatus() && this.getSaldo() >= v)  {
            this.setSaldo(this.getSaldo()  - v);
            System.out.println("saque relizado na conta de"+ this.getDono());

        }else {
            System.out.println("não é possivel realizar sque saldo insufuciente");
        }

    }
    public void pagarMensal(){
        if (Objects.equals(this.getTipo(), "cc")){
            this.setSaldo(this.getSaldo()-12);
        } else if (Objects.equals(this.getTipo(), "cp")) {
            this.setSaldo(this.getSaldo()-20);
        }

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
