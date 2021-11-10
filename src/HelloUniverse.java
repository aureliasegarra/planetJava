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

            Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
            chasseur.blindage = 156;
            chasseur.resitanceDuBouclier = 2;

            Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
            vaisseauMonde.blindage = 4784;
            vaisseauMonde.resitanceDuBouclier = 30;

            chasseur.activerLeBouclier();
            // transtypage du chasseur en VaisseauDeGuerre
            ((VaisseauDeGuerre)chasseur).attaquer(vaisseauMonde, "Laser Photonique", 3);
            vaisseauMonde.activerLeBouclier();
            vaisseauMonde.desactiverLeBouclier();

            System.out.println("la résistance du bouclier du VM est : " + vaisseauMonde.resitanceDuBouclier);
            System.out.println("le blindage du VM est : " + vaisseauMonde.blindage);

            mars.accueillirVaisseau(vaisseauMonde);
            mars.accueillirVaisseau(chasseur);

            Vaisseau chasseurSurTerre = new VaisseauDeGuerre("CHASSEUR");
            terre.accueillirVaisseau(chasseurSurTerre);
            System.out.println("Le chasseur a rejeté" + chasseurSurTerre.emporterCargaison(20) + "tonnes");

            Vaisseau fregateSurTerre = new VaisseauDeGuerre("FREGATE");
            terre.accueillirVaisseau(fregateSurTerre);
            System.out.println("La fregate a rejeté" + fregateSurTerre.emporterCargaison(45) + "tonnes");
            System.out.println("La fregate a rejeté" + fregateSurTerre.emporterCargaison(12) + "tonnes");

            Vaisseau fregateSurTerre2 = new VaisseauDeGuerre("FREGATE");
            terre.accueillirVaisseau(fregateSurTerre2);
            System.out.println("La fregate a rejeté" + fregateSurTerre2.emporterCargaison(30) + "tonnes");

            Vaisseau vaisseauMondeSurTerre = new VaisseauCivil("VAISSEAU-MONDE");
            terre.accueillirVaisseau(vaisseauMondeSurTerre);
            System.out.println("La fregate a rejeté" + vaisseauMondeSurTerre.emporterCargaison(1560) + "tonnes");
            System.out.println("La fregate a rejeté" + vaisseauMondeSurTerre.emporterCargaison(600) + "tonnes");
        }
}
