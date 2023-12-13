package org.example;

import java.math.MathContext;

public class ContaBanco {
    public int numConta;
    protected String tipo;//(conta poupança ou conta corrente)
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0);
    }

    public void abrirConta(){
        setStatus(true);

        if (this.getTipo()== contaCorrente){
            this.setSaldo(50);
        } else if (this.getTipo()== contaPoupanca) {
            this.setSaldo(150);
        }else {

            do {
                System.out.println("digite uma opção valida");
            }while (this.getTipo()!= contaCorrente  || this.getTipo()!= contaPoupanca);

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
    }




    public void depositar(){
        if(this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + deposito);
        }

    }
    public void sacar(){
        if(this.getStatus() && this.getSaldo() > 0)  {
            this.setSaldo(this.getSaldo()  - saque);
        }

    }
    public void pagarMensal(){
        if (this.getTipo() == contaCorrente){
            this.setSaldo(this.getSaldo()-12);
        } else if (this.getTipo() == contaPoupaca) {
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
