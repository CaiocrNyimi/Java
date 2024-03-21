package br.com.fiap.tds.model.exercicio.model;

import br.com.fiap.tds.model.model.Cor;

public class Aviao {

    private String modelo;

    private int quantidadeLugares;

    private String prefixo;

    private double comprimento;

    private int anoFabricacao;

    private Cor cor;

    private int quantidadeTurbinas;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getQuantidadeLugares() {
        return quantidadeLugares;
    }
    public void setQuantidadeLugares(int quantidadeLugares) {
        this.quantidadeLugares = quantidadeLugares;
    }
    public String getPrefixo() {
        return prefixo;
    }
    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}
