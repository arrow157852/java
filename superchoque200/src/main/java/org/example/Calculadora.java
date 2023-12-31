package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculadora {
    private Scanner scan = new Scanner(System.in);

    private ArrayList<Float> resultados = new ArrayList<>();
    private ArrayList<Float> valor = new ArrayList<>();
    private List<Integer> indices;
    private Dao dao = new Dao();
    double soma = 0.0;

    private int nivelDeProtecao, pontosAterramento, blocos;
    private String edificacao;
    private String material, servico;
    private float perimetro, altura, perimetroCaptor;
    private double quantDescidas, quantAnel, barra, diasCaptor, diasAnel, diasDescidas, diasAterramento, diasProtecaoMecanica, aliquota;
    double valorImposto = 0.0;
    double porcemtagemMaterial = 20.0 / 100;
    double porcemtagemMaodeObra = 40.0 / 100;
    double margemMaterial = 0;
    double margemMaodeObra = 0;
    double tudo=0;
    double comissao = 10.0 / 100;
    double valorComissao= 0;
    double total = 0.0;


    public Calculadora() {
        // Adicione um construtor se necessário
    }

    public void perguntas() {
        System.out.println("Qual o serviço a ser realizado?");
        servico = scan.nextLine();
        if (servico.equalsIgnoreCase("aterramento") || servico.equalsIgnoreCase("spda")) {
            System.out.println("Qual o material a ser usado?");
            material = scan.nextLine();
        }
        System.out.println("Qual o aliquota?");
        aliquota = scan.nextDouble();

        if (servico.equalsIgnoreCase("SPDA")) {
            System.out.println("Qual a altura da edificação?");
            altura = scan.nextFloat();
            System.out.println("Qual o perímetro da edificação?");
            perimetro = scan.nextFloat();
            System.out.println("Qual o perímetro do captor?");
            perimetroCaptor = scan.nextFloat();
            System.out.println("Qual o nível de proteção?");
            nivelDeProtecao = scan.nextInt();

        } else if (servico.equalsIgnoreCase("laudo")) {
            System.out.println("São blocos ou outros?");
            edificacao = scan.next();
            if (edificacao.equalsIgnoreCase("blocos")) {
                System.out.println("Quantos blocos são?");
                blocos = scan.nextInt();
            } else if (edificacao.equalsIgnoreCase("outros")) {
                System.out.println("Entre com o perímetro da edificação");
                perimetro = scan.nextFloat();
            }
        } else if (servico.equalsIgnoreCase("aterramento")) {
            System.out.println("Entre com o perímetro do aterramento");
            perimetro = scan.nextFloat();
            System.out.println("Entre com a quantidade de pontos de aterramento");
            pontosAterramento = scan.nextInt();
            scan.nextLine();  // Consumir a quebra de linha pendente
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

        if (servico.equalsIgnoreCase("spda")) {
            quantDescidas = Math.ceil(perimetro / distDescida);
            quantAnel = (Math.ceil(altura / distCaptor)) - 1;
            if (material.equalsIgnoreCase("barra chata")) {


                barra = Math.ceil(((perimetro / 6) * quantAnel) + (perimetroCaptor / 6) + ((altura / 6) * quantDescidas));
                diasCaptor = ((barra * 6) / 108);
                diasAnel = ((barra * 6) / 36);
                diasDescidas = ((barra * 6) / 48);
                diasAterramento = (diasDescidas / 6);
                diasProtecaoMecanica = (diasDescidas / 6);

                resultados.add((float) (quantDescidas * 2)); // cordoalha de 70mm²
                resultados.add((float) (quantAnel + 1)); // caixa de bep 9
                resultados.add((float) (quantDescidas * 2)); // clips de 1"
                resultados.add((float) (quantDescidas * 1.5)); // terminal de compressao de 70mm.
                resultados.add((float) (quantDescidas * 0.03)); // veda calha.
                resultados.add((float) (barra)); // barra chata.
                resultados.add((float) (quantDescidas * 4)); // abraçadeira
                resultados.add((float) (quantDescidas)); // eletroduto
                resultados.add((float) (quantDescidas)); // luva de emenda 70mm
                resultados.add((float) (quantDescidas)); // caixa de inspeção suspença
                resultados.add((float) (barra * 2)); // parafuso de emenda
                resultados.add((float) (quantDescidas * 4)); // parafuso de 8 mm
                resultados.add((float) (barra * 8)); // parafuso de 6mm
                resultados.add((float) (3)); // dps
                resultados.add((float) (((diasAnel + diasCaptor + diasDescidas) / 2) + diasAterramento + diasProtecaoMecanica)); // dias de trablho do instalador e do encarregado

                indices = Arrays.asList(9, 16, 24, 35, 39, 42, 43, 45, 46, 48, 74, 75, 76, 77);

                for (int j = 0; j < resultados.size() - 1; j++) {
                    int indice = indices.get(j);
                    valor.add(resultados.get(j) * dao.obterValorUnidade(indice));
                }




                valor.add(resultados.get(14) * 240);
                valor.add(resultados.get(14) * 180);

            } else if (material.equalsIgnoreCase("cobre")) {

                resultados.add((float) ((altura * quantDescidas) + (perimetro * quantAnel) + perimetroCaptor)); // cabo de cobre nu 50mm
                diasCaptor = (resultados.get(0) / 120);
                diasAnel = (resultados.get(0) / 36);
                diasDescidas = (resultados.get(0) / 48) / (quantDescidas);
                diasAterramento = (quantDescidas / 6);
                diasProtecaoMecanica = (quantDescidas / 6);
                resultados.add(resultados.get(0) * 2); // parafuso de 6 mm completo
                resultados.add(resultados.get(0)); // isolador e mini captor de aluminio
                resultados.add((float) (((diasAnel + diasCaptor + diasDescidas) / 3) + (diasAterramento + diasProtecaoMecanica)));

                valor.add(resultados.get(0) * dao.obterValorUnidade(5));
                valor.add(resultados.get(1) * dao.obterValorUnidade(76));
                valor.add(resultados.get(2) * dao.obterValorUnidade(50));
                valor.add(resultados.get(3) * 240);//dia  de encarregado
                valor.add(resultados.get(3) * 180);//dia de instalador
                indices = Arrays.asList(5, 76,50);
            }
        }

        if (servico.equalsIgnoreCase("aterramento")) {
            if (material.equalsIgnoreCase("cobre") || material.equalsIgnoreCase("cordoalha")) {
                resultados.add(perimetro * pontosAterramento);//cabo de cobre nu 50mm²// cordoalha
                resultados.add((perimetro / 3) * pontosAterramento); //tampa de ferro e caixa de inspeção e haste de camada
                resultados.add((float) (pontosAterramento)); //caixa de bep
                resultados.add((float) (pontosAterramento * 4)); //cabo verde 16mm
                resultados.add((float) ((float) (pontosAterramento) * (1.05)));//terminal de compressão 50mm² e solda exotermica completa// terminal de compreção de 70mm2 solda exotermica completa


                if (pontosAterramento >= 5) {
                    resultados.add((float) (pontosAterramento / 5));
                } else {
                    resultados.add(1F);
                }
                if (material.equalsIgnoreCase("cobre")) {
                    valor.add(resultados.get(0) * dao.obterValorUnidade(5));
                    valor.add(resultados.get(4) * dao.obterValorUnidade(34));
                    valor.add(resultados.get(4) * dao.obterValorUnidade(37));
                    valor.add(resultados.get(1) * dao.obterValorUnidade(12));
                    valor.add(resultados.get(1) * dao.obterValorUnidade(15));
                    valor.add(resultados.get(2) * dao.obterValorUnidade(16));
                    valor.add(resultados.get(3) * dao.obterValorUnidade(11));
                    indices = Arrays.asList(9, 11, 12, 15, 16, 34, 37);
                } else if (material.equalsIgnoreCase("cordoalha")) {
                    valor.add(resultados.get(0) * dao.obterValorUnidade(9));
                    valor.add(resultados.get(4) * dao.obterValorUnidade(35));
                    valor.add(resultados.get(4) * dao.obterValorUnidade(37));
                    valor.add(resultados.get(1) * dao.obterValorUnidade(12));
                    valor.add(resultados.get(1) * dao.obterValorUnidade(15));
                    valor.add(resultados.get(2) * dao.obterValorUnidade(16));
                    valor.add(resultados.get(3) * dao.obterValorUnidade(11));
                    indices = Arrays.asList(9, 11, 12, 15, 16, 35, 37);
                }


                valor.add(valor.getLast() * 240);//dia  de encarregado


            }

        } else if (servico.equalsIgnoreCase("LAUDO")) {
            if (edificacao.equalsIgnoreCase("BLOCOS")) {
                resultados.add((blocos / 9f));
                if (blocos>4){
                total=blocos*300;}
                else {
                    total=1200 ;
                }
            } else if (edificacao.equalsIgnoreCase("OUTROS")) {
                resultados.add((perimetro / 90));
                total=resultados.getFirst()*800;

            } else {
                // Lidar com o caso em que edificacao não é nem "blocos" nem "outros"
                System.out.println("Edificação não reconhecida: " + edificacao);
            }
        }



        System.out.println("  ------------------------------------------------------------------");
        for (int i = 0; i < resultados.size()-1; i++) {
            System.out.println(dao.obterNomeMaterial(indices.get(i)) + ": " + " | Quantidade: " + resultados.get(i));
        }






        System.out.println("  ------------------------------------------------------------------");

        if (servico.equalsIgnoreCase("laudo")) {
            System.out.println("dias de encarregado: " + Math.ceil(resultados.getLast()));
        }
        else  {
            System.out.println("dias de instalador: " + Math.ceil(resultados.get(resultados.size() - 1)));
            System.out.println("dias de encarregado: " + resultados.get(resultados.size() - 1));
        }








        double imposto = aliquota / 100;
        for (float valor : valor) {
            soma += valor;
        }
        if (servico.equalsIgnoreCase("laudo")){
            margemMaterial = 0;
            margemMaodeObra = 0;
        }
        else if (!servico.equalsIgnoreCase("laudo")) {
            margemMaterial = valor.removeLast() + ((valor.removeLast()) * porcemtagemMaterial);
            margemMaodeObra = valor.getLast() + ((valor.getLast()) * porcemtagemMaodeObra);


            valorComissao = (soma + margemMaterial + margemMaodeObra) * comissao;
            tudo = (soma + margemMaterial + margemMaodeObra + valorComissao);
            valorImposto = (tudo * imposto);
            total = tudo + valorImposto;


            System.out.printf("Soma da margem mao de obra: %.2f%n", margemMaodeObra);
            System.out.printf("Soma da margem material: %.2f%n", margemMaterial);
            System.out.printf("Soma da comissao: %.2f%n", valorComissao);
            System.out.printf("Soma da comissao: %.2f%n", (valorComissao+margemMaodeObra+margemMaterial));
            System.out.printf("Soma de imposto: %.2f%n", valorImposto);
        }


        System.out.printf("Soma do valor total com impostos: %.2f%n", total);
    }
}


