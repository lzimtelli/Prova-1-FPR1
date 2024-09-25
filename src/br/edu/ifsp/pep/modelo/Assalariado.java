package br.edu.ifsp.pep.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;

@Entity
@PrimaryKeyJoinColumns({
    @PrimaryKeyJoinColumn(name = "login", referencedColumnName = "login"),
    @PrimaryKeyJoinColumn(name = "senha", referencedColumnName = "senha")
})
@NamedQueries({
    @NamedQuery(name = "SalarioMaior10000", query = "SELECT * FROM Assalariado a where a.salario > 10000")})
@DiscriminatorValue(value = "assalariado")
public class Assalariado extends Funcionario{
    @Column(name = "salario", scale = 2, precision = 10)
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Assalariado() {
    }

    public Assalariado(double salario) {
        this.salario = salario;
    }
    
    
}
