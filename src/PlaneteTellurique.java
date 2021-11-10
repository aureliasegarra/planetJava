public class PlaneteTellurique extends Planete implements Habitable{

    public PlaneteTellurique(String nom){
        super(nom);
    }

    public Vaisseau accueillirVaisseau(Vaisseau vaisseau){

        if (vaisseau instanceof VaisseauDeGuerre){
            // Transtypage
            ((VaisseauDeGuerre)vaisseau).desactiverArmes();
        }

        totalVisiteurs = vaisseau.nbPassager;
        Vaisseau vaisseauPrecedent = vaisseauActuellementAcoste;
        vaisseauActuellementAcoste = vaisseau;
        return vaisseauPrecedent;
    }

}
