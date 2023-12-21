package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
    private Scanner scan = new Scanner(System.in);

    ArrayList<Float> resultados = new ArrayList<Float>();
    Dao dao = new Dao();

    private int nivelDeProtecao;
    private String edificacao;
    private String blocos, material;
    private float perimetro, altura, perimetroCaptor;

    public Calculadora() {
        // Adicione um construtor se necessário
    }

    public void perguntas() {
        System.out.println("Qual o serviço a ser realizado?");
        String servico = scan.nextLine();

        if (servico.equalsIgnoreCase("SPDA")) {
            System.out.println("Qual a altura da edificação?");
            altura = scan.nextFloat();
            System.out.println("Qual o perímetro da edificação?");
            perimetro = scan.nextFloat();
            System.out.println("Qual o perímetro do captor?");
            perimetroCaptor = scan.nextFloat();
            System.out.println("Qual o nível de proteção?");
            nivelDeProtecao = scan.nextInt();
            System.out.println("Qual o material a ser usado?");
            material = scan.next();
        } else if (servico.equalsIgnoreCase("laudo")) {
            System.out.println("São blocos ou outros?");
            edificacao = scan.nextLine();
            if (edificacao.equalsIgnoreCase("blocos")) {
                System.out.println("Quantos blocos são?");
                blocos = scan.nextLine();
            } else if (edificacao.equalsIgnoreCase("outros")) {
                System.out.println("Entre com o perímetro da edificação");
                blocos = scan.nextLine();
            }
        } else if (servico.equalsIgnoreCase("aterramento")) {
            System.out.println("Entre com o perímetro do aterramento");
            perimetro = scan.nextFloat();
            System.out.println("Entre com a quantidade de pontos de aterramento");
            int pontosAterramento = scan.nextInt();
            scan.nextLine();  // Consumir a quebra de linha pendente
            System.out.println("Qual o material a ser usado?");
            material = scan.nextLine();
        }
    }

    public void calcular() {
        int distDescida = 0;
        int distCaptor = 0;

        if (nivelDeProtecao == 1 || nivelDeProtecao == 2) {
            distDescida = 12;
            distCaptor = 10;
        } else if (nivelDeProtecao == 3) {
            distDescida = 18;
            distCaptor = 15;
        } else if (nivelDeProtecao == 4) {
            distDescida = 24;
            distCaptor = 20;
        }

        if (material.equalsIgnoreCase("barra chata")) {
            double quantDescidas = Math.ceil(perimetro / distDescida);
            double quantAnel = (Math.ceil(altura / distCaptor)) - 1;

            double barra = Math.ceil(((perimetro / 6) * quantAnel) + (perimetroCaptor / 6) + ((altura / 6) * quantDescidas));
            double diasCaptor = ((barra * 6) / 108);
            double diasAnel = ((barra * 6) / 36);
            double diasDescidas = ((barra * 6) / 48);
            double diasAterramento = (diasDescidas / 6);
            double diasProtecaoMecanica = (diasDescidas / 6);

            dao.realizarConsulta(9);
            resultados.add((float) (quantDescidas*2));
            dao.realizarConsulta(17);
            resultados.add((float)(quantAnel+1));
            dao.realizarConsulta(24);
            resultados.add((float)(quantDescidas*2));









        } else if (material.equalsIgnoreCase("cobre")) {
            // Cálculos relacionados ao material "cobre"
        }
    }
}


