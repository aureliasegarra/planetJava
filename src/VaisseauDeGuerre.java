public class VaisseauDeGuerre extends Vaisseau{

    void attaquer(Vaisseau vaisseauAttaque, String arme, int dureeAttaque){
        System.out.println("Un vaisseau de" + type + " attaque un vaissau de type" + vaisseauAttaque.type + " en utilisant une" + arme +" et pendant "+ dureeAttaque+" minutes");
        vaisseauAttaque.resitanceDuBouclier = 0;
        vaisseauAttaque.blindage = vaisseauAttaque.blindage/2;
    }
}
