public abstract class Planete {
    static String forme = "Sphérique";
    static int nbPlanetesDecouvertes = 0;

    String nom;
    long diametre;
    int totalVisiteurs = 0;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAcoste;



    /**
     * Constructor Planete
     */
    Planete(String nom){
        this.nom = nom;
        nbPlanetesDecouvertes++;
    }

    int rotation(int angle){
        return angle / 360;
    }

    int revolution(int angle){
        return angle / 360;
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
