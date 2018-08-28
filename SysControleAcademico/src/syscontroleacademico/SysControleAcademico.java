/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syscontroleacademico;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aluno
 */
public class SysControleAcademico {
    public static void main(String[] args) {
        EntityManagerFactory  factory = 
                Persistence.createEntityManagerFactory("SysControleAcademicoJPA");
        
        factory.close();
    }
    
}
