package projetoprolog;

import org.jpl7.Query;

/**
 *
 * @author Saiman Moreno
 */
public class ConnectionProlog {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String t1 = "consult('frik-frak-jogo.pl')";
        Query q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasNext()? "Carregado com sucesso!" : "Falha ao carregar"));
        String t2 = "play.";
        Query q2 = new Query(t2);
        System.out.println(q2.hasSolution());
    }
}
