package lojinha.pojo;

import java.util.List;

public class Produto {
    public String nome;
    public String marca;
    public double valor;
    public List<String> itensInclusos;
    public String tamanho;

    public String getNome(){
        return this.nome;
    }
    public void setNome (String novoNome){
        this.nome = novoNome;   

    }
    public String getMarca () {
        return this.marca;
    }
    public void setMarca (String novoMarca){
        this.marca = novoMarca;
    }



    public double getValor(){
    return this.valor;
}
    public void setValor (double novoValor){
        if (novoValor > 0){
        this.valor = novoValor;
}
        else {
            throw new IllegalArgumentException ("pode nao man");
        }
    }
    public List<String> getItensInclusos (){
        return this.itensInclusos;
    }
    public void setItensInclusos (List<String> novoItensInclusos){
        this.itensInclusos = novoItensInclusos;
    }
    public String getTamanho (){
        return this.tamanho;
    }
    public void setTamanho (String novoTamanho){
        this.tamanho = novoTamanho;
    }
}

