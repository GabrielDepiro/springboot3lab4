package br.gov.sp.fatec.springboot3lab4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//se a classe for diferente do nome da tabela
@Table(name = "usr_usuario")
public class Usuario {
    
    //primary key da tabela
    @Id
    //gerar o ID
    //precisa informar a forma que vai ser gerado
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //se o nome da coluna for diferente da tabela
    @Column(name = "usr_id")
    private Long id;
    
    @Column(name = "usr_nome")
    private String nome;

    @Column(name = "usr_senha")
    private String senha;

    public Usuario(String nome, String senha){
        setNome(nome);
        setSenha(senha);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
