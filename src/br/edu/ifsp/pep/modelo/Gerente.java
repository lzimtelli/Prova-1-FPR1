package br.edu.ifsp.pep.modelo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;

@Entity
@PrimaryKeyJoinColumns({
    @PrimaryKeyJoinColumn(name = "login", referencedColumnName = "login"),
    @PrimaryKeyJoinColumn(name = "senha", referencedColumnName = "senha")
})
@DiscriminatorValue(value = "gerente")
public class Gerente extends Funcionario{
    @Column(name = "salario", scale = 2, precision = 10)
    private double salario;
    
    @OneToMany(mappedBy = "gerente")
    private List<Venda> vendas;
    
    @Column(name = "percentual")
    private double percentual;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        for (Venda venda : vendas) {
            this.salario = salario + (percentual*venda.getValor()/100);
        }
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }  

    public Gerente() {
    }

    public Gerente(double salario, double percentual) {
        this.salario = salario;
        this.percentual = percentual;
    }
    
    
}
