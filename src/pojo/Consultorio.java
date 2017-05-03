Package pojo;

public class Consultorio{
    String nome;
    String endereco;
    String telefone;
    ArrayList<Medico> medicos = new ArrayList<Medico>();

    public Consultorio(){}

    public Consultorio(String nome, String endereco, String telefone, ArrayList<Medico> medicos){
        this.medicos = medicos;
        this.telefone = telefone;
        this.endereco = endereco;
        this.nome = nome;

    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public ArrayList<Medico> getListMedicos(){
        return this.medicos;
    }
    public void setListMedicos(ArrayList<Medico> medicos){
        this.medicos = medicos;
    }
}