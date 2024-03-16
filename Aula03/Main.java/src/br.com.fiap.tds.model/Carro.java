package br.com.fiap.tds.model;

public class Carro {
    
    private String placa;
    private String cor;
    private String modelo;
    private boolean eletrico;
    private int ano;

   
    //Metodos Getters e Setters
    public void setEletrico(boolean eletrico){
        this.eletrico = eletrico;
    }
    public boolean isEletrico(){
        return eletrico;
    }



    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }



    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }



    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }



    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

}