public class HelloUniverse {

        public static void main(String... args) {

            //Création des planètes
            Planete mercure = new Planete("Mercure");
            mercure.diametre = 4880;
            mercure.matiere = "Tellurique";

            Planete venus = new Planete("Venus");
            venus.diametre = 12100;
            venus.matiere = "Tellurique";

            Planete terre = new Planete("Terre");
            terre.diametre = 12756;
            terre.matiere = "Tellurique";

            Planete mars = new Planete("Mars");
            mars.diametre = 6792;
            mars.matiere = "Tellurique";

            Planete jupiter = new Planete("Jupiter");
            jupiter.diametre = 142984;
            jupiter.matiere = "Gazeuse";

            Planete saturne = new Planete("Saturne");
            saturne.diametre = 120536;
            saturne.matiere = "Gazeuse";

            Planete uranus = new Planete("Uranus");
            uranus.diametre = 51118;
            uranus.matiere = "Gazeuse";

            Planete neptune = new Planete("Neptune");
            neptune.diametre = 49532;
            neptune.matiere = "Gazeuse";



            // Atmosphère Planète
            Atmosphere atmosphereUranus = new Atmosphere();
            atmosphereUranus.tauxHydrogene = 83f;
            atmosphereUranus.tauxHelium = 15f;
            atmosphereUranus.tauxMethane = 2.5f;
            uranus.atmosphere = atmosphereUranus;




            // Partie Vaisseaux

            Vaisseau nouveauVaisseau = new Vaisseau();
            nouveauVaisseau.type = "FREGATE";
            nouveauVaisseau.nbPassager = 9;

            mars.accueillirVaisseau(nouveauVaisseau);

            Vaisseau autreVaisseau = new Vaisseau();
            autreVaisseau.type = "CROISEUR";
            autreVaisseau.nbPassager = 42;

            mars.accueillirVaisseau(autreVaisseau);

            VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
            chasseur.blindage = 156;
            chasseur.resitanceDuBouclier = 2;
            chasseur.type = "CHASSEUR";


            VaisseauCivil vaisseauMonde = new VaisseauCivil();
            vaisseauMonde.blindage = 4784;
            vaisseauMonde.resitanceDuBouclier = 30;
            vaisseauMonde.type = "VAISSEAU-MONDE";

            chasseur.activerLeBouclier();
            chasseur.attaquer(vaisseauMonde, "Laser Photonique", 3);
            vaisseauMonde.activerLeBouclier();
            vaisseauMonde.desactiverLeBouclier();

            System.out.println("la résistance du bouclier du VM est : " + vaisseauMonde.resitanceDuBouclier);
            System.out.println("le blindage du VM est : " + vaisseauMonde.blindage);
        }
}
