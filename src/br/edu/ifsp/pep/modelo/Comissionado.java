package br.edu.ifsp.pep.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;

@Entity
@PrimaryKeyJoinColumns({
    @PrimaryKeyJoinColumn(name = "login", referencedColumnName = "login"),
    @PrimaryKeyJoinColumn(name = "senha", referencedColumnName = "senha")
})
@DiscriminatorValue(value = "comissionado")
public class Comissionado extends Funcionario{
    @Column(name = "salario", scale = 2, precision = 10)
    private double salario;
    
    @Column(name = "comissao")
    private double comissao;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario + comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public Comissionado() {
    }

    public Comissionado(double salario, double comissao) {
        this.salario = salario;
        this.comissao = comissao;
    }
    
    
}
