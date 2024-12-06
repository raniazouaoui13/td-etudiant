public class Main {
    public static void main(String[] args) {
        Etudiant[] T = {
                new Etudiant("Alice", "Dupont", 14),
                new Etudiant("Bob", "Martin", 16),
                new Etudiant("Carla", "Lefèvre", 12),
                new Etudiant("David", "Dubois", 15),
                new Etudiant("Emma", "Lemoine", 18)
        };

        for (Etudiant etudiant : T) {
            if (etudiant.getNom().equals("Alice")) {
                if (etudiant.setNote(19)) {
                    System.out.println("Mise à jour de la note de Alice réussie.");
                } else {
                    System.out.println("Mise à jour de la note de Alice échouée.");
                }
                break;
            }
        }

        Etudiant e1 = new Etudiant("Lucas", "Marc", 17);
        System.out.print("Etudiant e1 : ");
        e1.afficher();

        Etudiant e2 = new Etudiant("Chloé", "Léa", 10);
        System.out.println("Prénom de l'étudiant e2 : " + e2.getPrenom());

        for (Etudiant etudiant : T) {
            etudiant.afficher();
        }
    }
}