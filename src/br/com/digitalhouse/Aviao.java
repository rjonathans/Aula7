package br.com.digitalhouse;

public class Aviao implements Voador{
    private String tipoDeAsa;
    private int qtdAssentos;
    public Aviao(){
    }

    public Aviao(int quantidadeDeAssentos,String tipoAsa){
        qtdAssentos=quantidadeDeAssentos;
        tipoDeAsa=tipoAsa;
    }

    public String getTipoDeAsa() {
        return tipoDeAsa;
    }

    public void setTipoDeAsa(String tipoAsa) {
        tipoDeAsa = tipoAsa;
    }

    public Integer getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int quantidadeDeAssentos) {
        qtdAssentos = quantidadeDeAssentos;
    }

    @Override
    public void voar() {
        System.out.println("Voando como um avião....");
    }
}
