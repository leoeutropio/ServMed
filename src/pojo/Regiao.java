package pojo;

import java.util.ArrayList;

public class Regiao {
    String nome;
    ArrayList<Consultorio>consultorios = new ArrayList<Consultorio>();

    public Regiao(){}

    public Regiao(String nome, ArrayList<Consultorio> consultorios){
        this.nome = nome;
        this.consultorios = consultorios;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public ArrayList<Consultorio> getListConsultorio(){
        return this.consultorios;
    }
    public void setListConsultorio(ArrayList<Consultorio> consultorios){
        this.consultorios = consultorios;
    }
}