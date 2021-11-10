public class PlaneteTellurique extends Planete implements Habitable{

    public PlaneteTellurique(String nom){
        super(nom);
    }

    public Vaisseau accueillirVaisseau(Vaisseau nouveauVaisseau){
        totalVisiteurs = nouveauVaisseau.nbPassager;

        Vaisseau vaisseauPrecedent = vaisseauActuellementAcoste;

        vaisseauActuellementAcoste = nouveauVaisseau;
        return vaisseauPrecedent;
    }

}
