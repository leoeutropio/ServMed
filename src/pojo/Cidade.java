package pojo;

import java.util.ArrayList;

public class Cidade {
    String nome;
    ArrayList<Regiao>regioes = new ArrayList<Regiao>();

    public Cidade(){}

    public Cidade(String nome, ArrayList<Regiao>regioes){
        this.nome = nome;
        this.regioes = regioes;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public ArrayList<Regiao> getListRegiao(){
        return this.regioes;
    }
    public void setListRegiao(ArrayList<Regiao> regioes){
        this.regioes = regioes;
    }
}