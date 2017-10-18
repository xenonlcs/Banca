public class Conto {
    private String iban;
    private String cf;
    private double saldo;

    Conto(String iban, String cf){
        this.iban=iban;
        this.cf=cf;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public boolean preleva(double somma){
        if(saldo>=somma){
            saldo-=somma;
            return true;
        }
        return false;
    }


    public boolean deposita(double somma){
        saldo+=somma;
        return true;
    }

}
