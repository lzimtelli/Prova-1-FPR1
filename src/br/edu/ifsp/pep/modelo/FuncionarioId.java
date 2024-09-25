package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FuncionarioId implements Serializable{
    @Column(name = "login", length = 45)
    private String login;
    
    @Column(name= "senha", length = 45)
    private String senha;

    public FuncionarioId() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
 
}
