package lojinha;

import java.util.ArrayList;
import java.util.List;

import lojinha.pojo.Produto;

public class Main {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();
            meuProduto.setNome("Rodrigo");
            meuProduto.setMarca("Branco");
            meuProduto.setValor(0.01);
            List<String> ItensInclusos = new ArrayList<>();
            ItensInclusos.add ("mao");
            ItensInclusos.add ("cabeca");
            ItensInclusos.add ("pe");
            ItensInclusos.add ("torso");
            meuProduto.setItensInclusos(ItensInclusos);
            meuProduto.setTamanho("180");




            System.out.println(meuProduto.getItensInclusos());


    }
}