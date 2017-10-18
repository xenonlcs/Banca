public class Main {
    public static void main(String[] args) {
        Conto conto1=new Conto("IT436001", "FRNNDR90");
        boolean flag;
        flag=conto1.deposita(100);
        if(flag){
            System.out.println("Deposito avvenuto con successo. Nuovo saldo: " + conto1.getSaldo());
        }

        flag=conto1.preleva(1000);
        if(flag){
            System.out.println("Prelievo avvenuto con successo. Nuovo saldo: " + conto1.getSaldo());
        }else{
            System.out.println("Saldo non sufficiente. Saldo attuale: " + conto1.getSaldo());
        }

        flag=conto1.preleva(10);
        if(flag){
            System.out.println("Prelievo avvenuto con successo. Nuovo saldo: " + conto1.getSaldo());
        }else{
            System.out.println("Saldo non sufficiente. Saldo attuale: " + conto1.getSaldo());
        }

        Banca banca1 = new Banca("Intesa", 10);
        banca1.aggiungiConto("1", "PPPP");
        banca1.aggiungiConto("2", "PPPO");
        banca1.aggiungiConto("3", "PPPI");


        flag=banca1.operazione(100,"Intesa1");
        if(flag){
            System.out.println("Operazione avvenuta con successo. Nuovo saldo: " + banca1.getConto("Intesa1").getSaldo());
        }else{
            System.out.println("Saldo non sufficiente. Saldo attuale: " + banca1.getConto("Intesa1").getSaldo());
        }

        flag=banca1.operazione(200,"Intesa2");
        if(flag){
            System.out.println("Operazione avvenuta con successo. Nuovo saldo: " + banca1.getConto("Intesa2").getSaldo());
        }else{
            System.out.println("Saldo non sufficiente. Saldo attuale: " + banca1.getConto("Intesa2").getSaldo());
        }

        flag=banca1.operazione(300,"Intesa3");
        if(flag){
            System.out.println("Operazione avvenuta con successo. Nuovo saldo: " + banca1.getConto("Intesa3").getSaldo());
        }else{
            System.out.println("Saldo non sufficiente. Saldo attuale: " + banca1.getConto("Intesa3").getSaldo());
        }

        flag=banca1.operazione((-2000),"Intesa2");
        if(flag){
            System.out.println("Operazione avvenuta con successo. Nuovo saldo: " + banca1.getConto("Intesa2").getSaldo());
        }else{
            System.out.println("Saldo non sufficiente. Saldo attuale: " + banca1.getConto("Intesa2").getSaldo());
        }

        flag=banca1.operazione((-50),"Intesa1");
        if(flag){
            System.out.println("Operazione avvenuta con successo. Nuovo saldo: " + banca1.getConto("Intesa1").getSaldo());
        }else{
            System.out.println("Saldo non sufficiente. Saldo attuale: " + banca1.getConto("Intesa1").getSaldo());
        }


        for(int i=0; i<banca1.getContiAttivi(); i++){
            System.out.println("IBAN: "+banca1.getConti()[i].getIban()+" CF: "+banca1.getConti()[i].getCf()+" Saldo: "+banca1.getConti()[i].getSaldo());
        }

        System.out.println("Saldo totale: "+banca1.totSaldi());
    }
}
