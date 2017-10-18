public class Banca {
    private String nome;
    private int maxConti;
    private Conto conti[];
    private int contiAttivi;
    private String radiceIban;


    public Banca(String nome, int maxConti) {
        this.nome = nome;
        this.maxConti = maxConti;
        conti=new Conto[maxConti];
        contiAttivi=0;
        radiceIban=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMaxConti() {
        return maxConti;
    }

    public void setMaxConti(int maxConti) {
        this.maxConti = maxConti;
    }

    public Conto[] getConti() {
        return conti;
    }

    public void setConti(Conto[] conti) {
        this.conti = conti;
    }

    public int getContiAttivi() {
        return contiAttivi;
    }

    public void setContiAttivi(int contiAttivi) {
        this.contiAttivi = contiAttivi;
    }

    public String getRadiceIban() {
        return radiceIban;
    }

    public void setRadiceIban(String radiceIban) {
        this.radiceIban = radiceIban;
    }


    public Conto aggiungiConto(String ID, String cf){
        Conto conto;
        if(contiAttivi<maxConti){
            conto = new Conto(radiceIban+ID, cf);
            conti[contiAttivi]=conto;
            contiAttivi++;
        }else{
            conto=null;
        }

        return conto;
    }
    public double totSaldi(){
        double sommaSaldi=0;
        for(int i=0; i<contiAttivi; i++){
            sommaSaldi+=conti[i].getSaldo();
        }
        return sommaSaldi;
    }
    public boolean operazione(double somma, String iban){
        boolean flag;
        Conto temp= getConto(iban);
        if(somma>=0){
            flag=temp.deposita(somma);
        }else{
            flag=temp.preleva(somma*(-1));
        }
        return flag;
    }
    public Conto getConto(String iban){
        for(int i=0; i<contiAttivi; i++){
            if(conti[i].getIban().equals(iban)){
                return conti[i];
            }
        }
        return null;

    }

}
