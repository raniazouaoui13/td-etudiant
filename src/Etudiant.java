public class Etudiant {
    private String nom;
    private String prenom;
    private int note;

    public Etudiant(String nom, String prenom, int note) {
        this.nom = nom;
        this.prenom = prenom;
        this.note = note;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public boolean setNote(int note) {
        if (note >= 0 && note <= 20) {
            this.note = note;
            return true;
        }
        return false;
    }

    public int getNote() {
        return note;
    }

    public void afficher() {
        System.out.println("Nom : " + nom + ", Prénom : " + prenom + ", Note : " + note);
    }
}