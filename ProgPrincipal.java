
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yassin
 */
public class ProgPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ListEtudiant X = new ListEtudiant();
        ArrayList <Etudiant> list = new ArrayList();
        list.add(new Etudiant (10, "Sana", 22));
        list.add(new Etudiant (20, "Eslem", 22));
        list.add(new Etudiant (30, "Faten", 24));
        list.add(new Etudiant (40, "Oussema", 23));
        
        Consumer <Etudiant> consumer = (e->System.out.println(e));
        
        X.afficherEtudiants(list, consumer);
        
        System.out.println(" \n ***************** ");
        Predicate <Etudiant> p = (e->e.getAge() > 22);
        X.afficherEtudiantSelonFiltre(list, p, consumer);
        
        System.out.println(" \n ***************** ");
        Predicate <Etudiant> p1 = (etd -> etd.getNom().length()>5);
        X.afficherEtudiantSelonFiltre(list, p1, consumer);
        
        Function<Etudiant, String> f =(e-> e.getNom());
        
        System.out.println(" \n ***************** ");
        String res = X.afficherNomEtudiant(list, f);
        System.out.println(" res = "+res);
        
        
        System.out.println(" \n ***************** ");
        Supplier<Etudiant> s= (()-> new Etudiant(50,"Narjes", 15));
        System.out.println(" Etudiant = "+ X.creeEtudiant(s));
        X.creeEtudiant(()-> new Etudiant(50,"Narjes", 15));
       
    }
    
}
