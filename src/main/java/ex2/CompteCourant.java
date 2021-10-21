package ex2;

public class CompteCourant extends CompteBancaire {

    /**
     * Constructeur
     * 
     * @param solde
     * @param decouvert
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde, decouvert);
    }

    @Override
    public void debiterMontant(double montant) {
        if (this.getSolde() - montant > this.getDecouvert()) {
            this.setSolde(this.getSolde() - montant);
        }
    }
}
