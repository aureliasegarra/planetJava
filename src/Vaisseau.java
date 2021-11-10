public abstract class Vaisseau {
    String type;
    int nbPassager;
    int blindage;
    int resitanceDuBouclier;
    int tonnageMax;
    int tonnageActuel;

    void activerLeBouclier(){
        System.out.println("Activation du bouclier du vaisseau de type X" + type);
    }

    void desactiverLeBouclier(){
        System.out.println("Desactivation du bouclier du vaisseau de type X" + type);
    }

    abstract int emporterCargaison(int tonnage);
}
