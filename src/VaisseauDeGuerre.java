public class VaisseauDeGuerre extends Vaisseau{

    boolean armesDesactivees;

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
}
