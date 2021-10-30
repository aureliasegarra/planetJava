public class Planete {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs = 0;

    int rotation(int angle){
        return angle / 360;
    }

    int revolution(int angle){
        return angle / 360;
    }

    void accueillirVaisseau(int nbHumain){
        totalVisiteurs = totalVisiteurs + nbHumain;
    }

    void accueillirVaisseau(String typeVaisseau){
        if (typeVaisseau.equals("CHASSEUR")) {
            totalVisiteurs = totalVisiteurs + 3;
        } else if (typeVaisseau.equals("FREGATE")){
            totalVisiteurs = totalVisiteurs + 12;
        } else if (typeVaisseau.equals("CROISEUR")){
            totalVisiteurs = totalVisiteurs + 50;
        }
    }
}
