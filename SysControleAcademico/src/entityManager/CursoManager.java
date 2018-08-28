package entityManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Aluno
 */

public class CursoManager {
    
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("SysControleAcademicoNone");
        
        Usuario u = new Usuario();
        u.setEmail(JOptionPane.showInputDialog("Informe o email: "));
        u.setSenha(JOptionPane.showInputDialog("Informe a senha: "));
        
        EntityManager manager = factory.createEntityManager();
        
        manager.getTransaction().begin();
        
        Usuario usuario = manager.find(Usuario.class, 1);
        
//        manager.remove(usuario);
//        manager.persist(u);
    
        manager.getTransaction().commit();
        manager.close();
    }
    
}
