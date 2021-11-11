import java.util.Scanner;

public class HelloUniverse {

        public static void main(String... args) {

            //Création des planètes
            PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
            mercure.diametre = 4880;

            PlaneteTellurique venus = new PlaneteTellurique("Venus");
            venus.diametre = 12100;

            PlaneteTellurique terre = new PlaneteTellurique("Terre");
            terre.diametre = 12756;

            PlaneteTellurique mars = new PlaneteTellurique("Mars");
            mars.diametre = 6792;

            PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
            jupiter.diametre = 142984;

            PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
            saturne.diametre = 120536;

            PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
            uranus.diametre = 51118;

            PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
            neptune.diametre = 49532;


            // Atmosphère Planète
            Atmosphere atmosphereUranus = new Atmosphere();
            atmosphereUranus.tauxHydrogene = 83f;
            atmosphereUranus.tauxHelium = 15f;
            atmosphereUranus.tauxMethane = 2.5f;
            uranus.atmosphere = atmosphereUranus;




            // Partie Vaisseaux

            Vaisseau fregate = new VaisseauDeGuerre("FREGATE");
            fregate.nbPassager = 10;
            Vaisseau croiseur = new VaisseauDeGuerre("CROISEUR");
            croiseur.nbPassager = 20;
            Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
            chasseur.nbPassager = 5;

            Vaisseau cargo = new VaisseauCivil("CARGO");
            cargo.nbPassager = 200;
            Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
            vaisseauMonde.nbPassager = 1000;

            Scanner sc = new Scanner(System.in);
            System.out.println("Quel vaisseau souhaitez vous prendre ?" );
            String vaisseauSelectionne = sc.nextLine();

            System.out.println("Sur quelle planète ?" );
            String planeteSelectionne = sc.nextLine();

            System.out.println("Quel tonnage de cargaison à embarquer ?" );
            int tonnage = sc.nextInt();

            Vaisseau vaisseau = null;
            switch (vaisseauSelectionne) {
                case "CHASSEUR":
                    vaisseau=chasseur;
                    break;
                case "CROISEUR":
                    vaisseau=croiseur;
                    break;
                case "FREGATE":
                    vaisseau=fregate;
                    break;
                case "CARGO":
                    vaisseau=cargo;
                    break;
                case "VAISEEAU-MONDE":
                    vaisseau=vaisseauMonde;
                    break;
            }

            PlaneteTellurique planete = null;
            switch (planeteSelectionne) {
                case "Terre":
                    planete=terre;
                    break;
                case "Venus":
                    planete=venus;
                    break;
                case "Mercure":
                    planete=mercure;
                    break;
                case "Mars":
                    planete=mars;
                    break;

            }

            planete.accueillirVaisseau(vaisseau);
            int rejet = vaisseau.emporterCargaison(tonnage);
            System.out.println("le rejet est de : " + rejet);

        }
}
