package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) {
        List<DadosPlanilha> dadosList = DatabaseOperations.consultarDados();
        List<Integer> quantidadeList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Chatbot perguntas = new Chatbot();
        int distancia_descidas;
        int distancia_captor;
        int quantidade_captor, perimetro, captor;
        int quantidade_aterramento;
        int qdp;
        float altura;
        float imp = 0;
        int somaimp;
        String natureza;

        System.out.println("Entre com o tipo de serviço (1-laudo/2-aterramento ou 3-spda): ");
        String servico = scanner.nextLine();

        if (servico.equals("spda")) {
            System.out.println("Entre com a altura da edificação: ");
            altura = scanner.nextInt();
            System.out.println("Entre com o perimetro da edificação: ");
            perimetro = scanner.nextInt();
            System.out.println("Entre com o perimetro do captor: ");
            captor = scanner.nextInt();





            if (np == 1 || np == 2) {
                distancia_descidas = 12;
                distancia_captor = 12;
            } else if (np == 3) {
                distancia_descidas = 18;
                distancia_captor = 18;
            } else {
                distancia_descidas = 24;
                distancia_captor = 24;
            }

            int quantidade_descidas = (int) Math.round(perimetro / (double) distancia_descidas);
            int quantidade_anel = (int) Math.round(altura / (double) distancia_captor);
            if (nature.equals("barra chata")) {
                int barra = (int) Math.round((perimetro / 6.0) * quantidade_anel + (captor / 6.0) + (altura / 6.0) * quantidade_descidas);
                quantidade_captor = (int) Math.round(barra * 6 / 108.0);
                quantidade_anel = (int) Math.round(barra * 6 / 36.0);
                quantidade_descidas = (int) Math.round(barra * 6 / 48.0);
                quantidade_aterramento = (int) Math.round(quantidade_descidas / 6.0);
                qdp = (int) Math.round(quantidade_descidas / 6.0);
                quantidadeList.set(2, (quantidade_descidas * 2));
                quantidadeList.set(5, (quantidade_anel + 1));
                quantidadeList.set(7, (quantidade_descidas * 2));
                quantidadeList.set(8, (quantidade_aterramento * 2));
                quantidadeList.set(11, (quantidade_descidas));
                quantidadeList.set(13, (int) Math.round(captor * 0.03));
                quantidadeList.set(14, (barra));
                quantidadeList.set(15, (4 * quantidade_descidas));
                quantidadeList.set(16, (quantidade_descidas));
                quantidadeList.set(17, (quantidade_descidas));
                quantidadeList.set(18, (quantidade_descidas));
                quantidadeList.set(24, 2 * quantidadeList.get(14));
                quantidadeList.set(25, (int) Math.round(4 * quantidade_descidas));
                quantidadeList.set(26, 8 * quantidadeList.get(14));
                quantidadeList.set(27, 3);
                quantidadeList.set(33, (int) Math.round(((float) (quantidade_anel + quantidade_captor + quantidade_descidas) / 2) + quantidade_aterramento + qdp));
                quantidadeList.set(34, quantidadeList.get(33));
            } else if (nature.equals("cobre")) {
                quantidadeList.set(1, (int) Math.round((altura * quantidade_descidas) + (perimetro * quantidade_anel) + captor));
                quantidade_captor = (int) Math.round(quantidadeList.get(1) / 120.0);
                quantidade_anel = (int) Math.round(quantidadeList.get(1) / 36.0);
                quantidade_descidas = (int) Math.round(quantidadeList.get(1) / 48.0 / quantidade_descidas);
                quantidade_aterramento = (int) Math.round(quantidade_descidas / 6.0);
                qdp = (int) Math.round(quantidade_descidas / 6.0);
                quantidadeList.set(30, quantidadeList.get(1));
                quantidadeList.set(26, quantidadeList.get(1));
                quantidadeList.set(33, (((quantidade_anel + quantidade_captor + quantidade_descidas) / 3) + quantidade_aterramento + qdp));
                quantidadeList.set(34, (int) quantidadeList.get(33));
            }
        } else if (servico.equals("aterramento")) {
            System.out.println("Entre com o perimetro da malha de aterramento: ");
            perimetro = scanner.nextInt();
            System.out.println("Entre com a quantidade de pontos de aterramento: ");
            int pat = scanner.nextInt();
            System.out.println("Qual o tipo de material (cordoalha ou cobre): ");
            natureza = scanner.nextLine();

            if (natureza.equals("cobre")) {
                quantidadeList.set(1, (perimetro * pat));
                quantidadeList.set(3, ((perimetro / 3) * pat));
                quantidadeList.set(4, ((perimetro / 3) * pat));
                quantidadeList.set(5, pat);
                quantidadeList.set(6, 4 * pat);
                quantidadeList.set(10, pat);
                quantidadeList.set(31, ((perimetro / 3) * pat));
                quantidadeList.set(12, quantidadeList.get(31));
            } else if (natureza.equals("cordoalha")) {
                quantidadeList.set(2, (perimetro * pat));
                quantidadeList.set(3, ((perimetro / 3) * pat));
                quantidadeList.set(4, ((perimetro / 3) * pat));
                quantidadeList.set(5, pat);
                quantidadeList.set(6, 4 * pat);
                quantidadeList.set(11, pat);
                quantidadeList.set(31, ((perimetro / 3) * pat));
                quantidadeList.set(12, quantidadeList.get(31));
            }
            quantidadeList.set(33, pat);
            quantidadeList.set(34, pat);
        } else if (servico.equals("laudo")) {
            System.out.println("Sao blocos ou outros?");
            String edificio = scanner.next();
            if (edificio.equals("blocos")) {
                System.out.println("Quantos blocos sao?");
                int qb = scanner.nextInt();
                quantidadeList.set(33, qb / 9);
                // Ajuste no valor multiplicado ao índice 33 quando o serviço é "laudo"
                quantidadeList.set(33, Math.multiplyExact(quantidadeList.get(33), dadosList.get(33).getValor()));
            } else if (edificio.equals("outros")) {
                System.out.println("Entre com o perimetro da edificação: ");
                perimetro = scanner.nextInt();
                quantidadeList.set(33, (perimetro / 30));
            }
        }

        System.out.println("Qual a alíquota de imposto %");
        int aliquota = scanner.nextInt();


            // Obter a quantidade da lista
        for (int i = 0; i < quantidadeList.size(); i++) {
            // Obter a quantidade da lista
            int quantidade = quantidadeList.get(i);

            // Ajuste na multiplicação do valor pelo índice correspondente na lista dadosList
            float valorCalculado = Math.multiplyExact(dadosList.get(i).getValor(), quantidade);

            // Calcular o imposto
            float imposto = (aliquota / 100.0f) * valorCalculado;

            // Somar o imposto ao valor calculado
            float valorComImposto = valorCalculado + imposto;

            // Adicionar o valor final à lista
            quantidadeList.set(i, Math.round(valorComImposto));
        }
        int somaTotal = 0;

        for (int i = 0; i < quantidadeList.size(); i++) {
            int quantidade = quantidadeList.get(i);

            // Verificar se a quantidade é diferente de 0
            if (quantidade != 0) {
                float valorCalculado = Math.multiplyExact(dadosList.get(i).getValor(), quantidade);
                float imposto = (aliquota / 100.0f) * valorCalculado;
                float valorComImposto = valorCalculado + imposto;

                // Adicionar o valor final à lista
                quantidadeList.set(i, Math.round(valorComImposto));

                // Imprimir o item
                System.out.println(dadosList.get(i) + " / " + quantidadeList.get(i));

                // Adicionar à soma total
                somaTotal += quantidadeList.get(i);
            }
        }

        System.out.println("Soma Total com Imposto: " + somaTotal);







    }}