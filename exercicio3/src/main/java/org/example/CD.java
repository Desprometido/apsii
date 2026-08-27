package org.example;

public class CD extends Produto implements InfoGerais {
    public int numFaixas;

    public CD(String nome, double preco, int numFaixas){
        super(nome, preco);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    @Override
    public void exibeInformacoes() {
        System.out.println("CD: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Número de faixas: " + getNumFaixas());
    }
}
