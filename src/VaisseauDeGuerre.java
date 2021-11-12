public class VaisseauDeGuerre extends Vaisseau{

    boolean armesDesactivees;


    public VaisseauDeGuerre(TypeVaisseau type){
        this.type = type;
        if (type == TypeVaisseau.CHASSEUR){
            tonnageMax = 0;
        }
        else if ((type == TypeVaisseau.FREGATE)){
            tonnageMax = 50;
        }
        else if ((type == TypeVaisseau.CROISEUR)){
            tonnageMax = 100;
        }
    }

    void attaquer(Vaisseau vaisseauAttaque, String arme, int dureeAttaque){
        if (armesDesactivees){
            System.out.println("Attaque impossible");
        } else {
            System.out.println("Un vaisseau de" + type + " attaque un vaissau de type" + vaisseauAttaque.type + " en utilisant une" + arme +" et pendant "+ dureeAttaque+" minutes");
            vaisseauAttaque.resitanceDuBouclier = 0;
            vaisseauAttaque.blindage = vaisseauAttaque.blindage/2;
        }

    }

    void desactiverArmes(){
        armesDesactivees = true;
        System.out.println("Désactivation des armes d'un vaisseau de type :" + type);
    }

    @Override
    void activerLeBouclier() {
        this.desactiverArmes();
        super.activerLeBouclier();
    }

    @Override
    int emporterCargaison(int cargaison) {
        if (type.equals("CHASSEUR")){
            return cargaison;
        }
        else {
            if (nbPassager<12){
                return cargaison;
            }
            else {
                int tonnagePassagers = 2 * nbPassager;
                int tonnageRestant = tonnageMax-tonnageActuel;
                int tonnageAConsiderer = (tonnagePassagers<tonnageRestant ? tonnagePassagers : tonnageRestant);
                if (cargaison>tonnageAConsiderer){
                    tonnageActuel=tonnageMax;
                    return cargaison-tonnageAConsiderer;
                } else {
                    tonnageActuel = tonnageActuel + cargaison;
                    return 0;
                }
            }
        }

    }
}
