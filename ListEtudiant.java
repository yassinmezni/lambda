
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yassin
 */
public class ListEtudiant implements GestionEtudiant{

    @Override
    public void afficherEtudiants(List<Etudiant> etudiants, Consumer<Etudiant> consumer) {
        for (Etudiant etd : etudiants) {
            consumer.accept(etd);
        }
         
    }

    @Override
    public void afficherEtudiantSelonFiltre(List<Etudiant> etudiants, Predicate<Etudiant> predicate, Consumer<Etudiant> cons) {

        for (Etudiant etudiant : etudiants) {
            
            if (predicate.test(etudiant))
                cons.accept(etudiant);
        }
    }

    @Override
    public String afficherNomEtudiant(List<Etudiant> etudiants, Function<Etudiant, String> f) {
  String s ="";
  
        for (Etudiant etudiant : etudiants) {
            s = s + f.apply(etudiant)+" ";
        }
        return s;
    }

    @Override
    public Etudiant creeEtudiant(Supplier<Etudiant> supp) {
    return supp.get();
    }

    @Override
    public Stream convertListStream(List<Etudiant> l) {
     return l.stream();    }
    
}
