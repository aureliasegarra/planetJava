public class Planete {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs = 0;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAcoste;

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




}
