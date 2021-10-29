public class Planete {
    String nom;
    String matiere;
    long diametre;

    void rotation(){
        System.out.println("Je suis la planète "+ nom +" et je tourne sur moi-même.");
    }

    void revolution(){
        System.out.println("Je suis la planète "+ nom +" et je tourne autour de mon étoile.");
    }
}
