package javaprolog;

import org.jpl7.Query;
/**
 *
 * @author pc
 */
public class Blogue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String t1 = "consult('blogue.pl')";
        Query q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasNext()? "carregado com sucesso!" : "falha ao carregar"));
        String t2 = "acima_de(a,b)";
        Query q2 = new Query(t2);
        System.out.println(t2 + " " + (q2.hasSolution()? "probado" : "no probado"));
        String t3 = "mais_acima_de(X,Y)";
        Query q3 = new Query(t3);
        System.out.println("Solucao para t3 " + t3);
        
        while(q3.hasMoreSolutions()){
            java.util.HashMap s3 = (java.util.HashMap) q3.nextSolution();
            System.out.println("X = " + s3.get("X") + ", Y = " + s3.get("Y"));
        }
    }
}

