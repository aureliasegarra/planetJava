public class HelloUniverse {

        public static void main(String... args) {
            Planete mercure = new Planete();
            mercure.nom = "Mercure";
            mercure.diametre = 4880;
            mercure.matiere = "Tellurique";



            Planete venus = new Planete();
            venus.nom = "Venus";
            venus.diametre = 12100;
            venus.matiere = "Tellurique";


            Planete terre = new Planete();
            terre.nom = "Terre";
            terre.diametre = 12756;
            terre.matiere = "Tellurique";


            Planete mars = new Planete();
            mars.nom = "Mars";
            mars.diametre = 6792;
            mars.matiere = "Tellurique";



            Planete jupiter = new Planete();
            jupiter.nom = "Jupiter";
            jupiter.diametre = 142984;
            jupiter.matiere = "Gazeuse";


            Planete saturne = new Planete();
            saturne.nom = "Saturne";
            saturne.diametre = 120536;
            saturne.matiere = "Gazeuse";


            Planete uranus = new Planete();
            uranus.nom = "Uranus";
            uranus.diametre = 51118;
            uranus.matiere = "Gazeuse";

            Atmosphere atmosphereUranus = new Atmosphere();
            atmosphereUranus.tauxHydrogene = 83f;
            atmosphereUranus.tauxHelium = 15f;
            atmosphereUranus.tauxMethane = 2.5f;
            uranus.atmosphere = atmosphereUranus;

            System.out.println("La planète Uranus est composée de :");
            System.out.println("A :" + uranus.atmosphere.tauxHydrogene + "% de hydrigène");
            System.out.println("A :" + uranus.atmosphere.tauxHelium + "% de helium");
            System.out.println("A :" + uranus.atmosphere.tauxMethane + "% de méthane");


            Planete neptune = new Planete();
            neptune.nom = "Neptune";
            neptune.diametre = 49532;
            neptune.matiere = "Gazeuse";

            System.out.println("Neptune a effectué " + neptune.revolution(-3542) + " tours autour de son étoile");
            System.out.println("Mars a effectué " + mars.rotation(-684) + "tours autour d'elle même");
            System.out.println("Venus a effectué " + venus.rotation(1250) + "tours autour d'elle même");

            Planete planeteX = new Planete();

            System.out.println(planeteX.nom+" est une planète "+planeteX.matiere+" avec un diamètre de "+planeteX.diametre+" kilomètres.");

            Vaisseau nouveauVaisseau = new Vaisseau();
            nouveauVaisseau.type = "FREGATE";
            nouveauVaisseau.nbPassager = 9;

            mars.accueillirVaisseau(nouveauVaisseau);

            Vaisseau autreVaisseau = new Vaisseau();
            autreVaisseau.type = "CROISEUR";
            autreVaisseau.nbPassager = 42;

            mars.accueillirVaisseau(autreVaisseau);

            //System.out.println("le nombre de personnes ayant séjournées sur Mars est de :" + mars.totalVisiteurs);

            System.out.println("La forme d'une planète est :"+ Planete.forme);
            System.out.println("La forme de Mars est :"+ mars.forme);

            System.out.println(Planete.expansion(10.2));
            System.out.println(Planete.expansion(14.2));

        }
}
