public class Planete {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs = 0;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAcoste;
    static String forme = "Sphérique";

    int rotation(int angle){
        return angle / 360;
    }

    int revolution(int angle){
        return angle / 360;
    }

    Vaisseau accueillirVaisseau(Vaisseau vaisseau){
        totalVisiteurs = totalVisiteurs + vaisseau.nbPassager;
        if (vaisseauActuellementAcoste == null){
            System.out.println("Aucun vaisseau ne s'en va");
        } else {
            System.out.println("Un vaisseau de type" + vaisseauActuellementAcoste.type + "doit s'en aller");
        }
        Vaisseau vaisseauPrecedent = vaisseauActuellementAcoste;
        vaisseauActuellementAcoste = vaisseau;
        return vaisseauPrecedent;
    }

    static String expansion(double distanceEntreDeuxPlanetes){
        String distance = "";
        if (distanceEntreDeuxPlanetes < 14){
            distance += "Oh la la mais c'est super rapide !";
        } else if (distanceEntreDeuxPlanetes > 14){
            distance += "Je rêve ou c'est plus rapide que la lumière !";
        }
        return distance;
    }




}
