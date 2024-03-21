package br.com.fiap.tds.model;

import br.com.fiap.tds.model.model.Carro;
import br.com.fiap.tds.model.model.Cor;

public class Main {
    public static void main(String[] args) {
        //Instanciar um Carro
        Carro gol = new Carro();

        Cor branco = new Cor();
        branco.alterarCor(255,255,255,"Branco");

        gol.setModelo("Gol");
        gol.setQuantidadeLugares(5);
        gol.setQuantidadePortas(4);
        gol.setComprimento(3.9);
        gol.setAnoFabricacao(1980);
        gol.setCor(branco);
        gol.setPlaca("AAA1111");
        gol.setMotor(1);

        //Exibir os valores do modelo, placa e cor
        System.out.println("\nFicha Técnica do Carro: \n \n Modelo: " + gol.getModelo() + "\n Quantidade de lugares: " + gol.getQuantidadeLugares() +
                "\n Quantidade de portas: " + gol.getQuantidadePortas() + "\n Comprimento: " + gol.getComprimento() +
                "\n Ano de fabricação: " + gol.getAnoFabricacao() + "\n Cor: " + gol.getCor().getNome() +
                "\n Placa: " + gol.getPlaca() + "\n Motor: " + gol.getMotor());

    }
}