public class TestGestionBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte("mohammed lhammi", 1000.0);
        CompteEpargne compteEpargne1 = new CompteEpargne("sami lassoued");

        Banque banque = new Banque("Ma Banque");
        banque.ajoutCompte(compte1);
        banque.ajoutCompte(compteEpargne1);

        System.out.println(compte1);
        System.out.println(compteEpargne1);
    }
}