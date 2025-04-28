public class ContoBancario {
    private double saldo;
    private boolean erroreSetSaldo;

    public ContoBancario(double saldoIniziale){
        erroreSetSaldo = !(setSaldo(saldoIniziale));
    }

    public boolean isInError(){
        return erroreSetSaldo;
    }
    
    private boolean setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
            return true;
        }
        return false;
    }

    public boolean preleva(double importo){
        return setSaldo(saldo - importo);
    }

    public void deposita(double importo){
        setSaldo(saldo + importo);
    }

    public double getSaldo(){
        return saldo;
    }
}