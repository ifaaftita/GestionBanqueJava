class Compte {
    private String titulaire;
    private double solde;

    public Compte(String titulaire) {
        this.titulaire = titulaire;
        this.solde = 0.0;
    }

    public Compte(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void debiter(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant");
        }
        solde -= montant;
    }

    public void crediter(double montant) {
        solde += montant;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "titulaire='" + titulaire + '\'' +
                ", solde=" + solde +
                '}';
    }
}

class CompteEpargne extends Compte {
    private double benefice;

    public CompteEpargne(String titulaire) {
        super(titulaire);
        this.benefice = 0.0;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "titulaire='" + getTitulaire() + '\'' +
                ", solde=" + getSolde() +
                ", benefice=" + benefice +
                '}';
    }
}

class Banque {
    private String nom;
    private List<Compte> listCompte;

    public Banque(String nom) {
        this.nom = nom;
        this.listCompte = new ArrayList<>();
    }

    public void ajoutCompte(Compte compte) {
        listCompte.add(compte);
    }
}

class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(String message) {
        super(message);
    }
}

