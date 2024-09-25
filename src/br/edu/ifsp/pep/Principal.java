package br.edu.ifsp.pep;

import br.edu.ifsp.pep.modelo.Assalariado;
import br.edu.ifsp.pep.modelo.Comissionado;
import br.edu.ifsp.pep.modelo.Funcionario;
import br.edu.ifsp.pep.modelo.FuncionarioId;
import br.edu.ifsp.pep.modelo.Gerente;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexaoPU");
    
    public static void main(String[] args) {
        
        // https://github.com/lzimtelli/Prova-1-FPR1
        
        FuncionarioId fid1 = new FuncionarioId();
        FuncionarioId fid2 = new FuncionarioId();
        FuncionarioId fid3 = new FuncionarioId();
        
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();
        
        f1.setCodigo(fid1);
        f2.setCodigo(fid2);
        f3.setCodigo(fid3);    
        
        Assalariado a1 = new Assalariado(1500);
        Comissionado c1 = new Comissionado(2000, 1500);
        Gerente g1 = new Gerente(3000, 30);
        
        a1.setCodigo(fid1);
        c1.setCodigo(fid2);
        g1.setCodigo(fid3);
        
    }
}
