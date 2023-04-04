/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojecombate;

/**
 * Aula 7ab
 * @author Manuel Francisco
 */
public final class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    //Métodos públicos
    public void apresentar(){
        System.out.println("******************************************************");
        System.out.println("Apresentamos o lutador " + this.getNome());
        System.out.println("Ele que é de nacionalidade " + this.getNacionalidade());
        System.out.println("de " + this.getIdade() + " anos de idade e "+ this.getAltura()+ " m de altura");
        System.out.println("Ele que pesa "+ this.getPeso() + " Kg" );
        System.out.println("Tem na sua conta " + this.getVitorias() + " vitória(s)");
        System.out.println("Ainda cerca de " + this.getDerrotas() + " derrota(s)");
        System.out.println("E cerca de " + this.getEmpates() + " empate(s)");
    }
    public void status(){
        System.out.println("------------------------------------------------------");
        System.out.println("----------------DADOS ACTUALIZADOS: ------------------");
        System.out.println("Lutador: " + this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("ganhou : "+ this.getVitorias()+ " vez(es)");
        System.out.println("perdeu : "+this.getDerrotas() + " vez(es)");
        System.out.println("Empatou: "+this.getEmpates() + " vez(es)");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    //Métodos Especiais

    Lutador(String no, String naci, int id, float alt, float pe, int vit, int der, int emp) {
        this.nome = no;
        this.nacionalidade = naci;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pe); 
        this.vitorias = vit; 
        this.derrotas = der;
        this.empates = emp;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    private float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();//neste caso a categoria mudará consuante ao peso do lutador
    }

    private void setCategoria() { // setCategoria passa a ser um método somente interno pelo que pode ser privado e sem parámetro
        if(this.peso < 52.2)
            this.categoria = "Inválido";
        else
            if(this.peso <= 70.3)
                this.categoria = "Leve";
            else
                if(this.peso <= 83.9)
                    this.categoria = "Médio";
                else 
                    if(this.peso <= 102.2)
                        this.categoria = "Pesado";
                    else
                        this.categoria = "Inválido";
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
