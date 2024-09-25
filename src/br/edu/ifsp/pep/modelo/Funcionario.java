package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "cargo_Funcionario")
@NamedQuery(name = "retornarCargo", query = "SELECT f.cargo_Funcionario FROM Funcionario c")
public class Funcionario implements Serializable{
    @EmbeddedId
    private FuncionarioId codigo;

    public Funcionario() {
    }

    public FuncionarioId getCodigo() {
        return codigo;
    }

    public void setCodigo(FuncionarioId codigo) {
        this.codigo = codigo;
    }
    
    
}
