public class Etudiant // implements Comparable <Etudiant>
        {
      private int id, age;
    private String nom;

    public Etudiant() {
    }

    public Etudiant(int id, String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", age=" + age + '}';
    }

   /* @Override
    public int compareTo(Etudiant o) {
    return this.nom.compareTo(o.nom);
        }

    @Override
    public int hashCode() {
     return 5 ;    }

    
    
    @Override
    public boolean equals(Object obj) {
     if (obj instanceof Etudiant) 
        return this.getId() == ((Etudiant) obj).getId();
     else
         return false ;
        }
    
    
*/
 
    
    
}
