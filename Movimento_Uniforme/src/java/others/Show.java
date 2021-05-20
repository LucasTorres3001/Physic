package others;

import java.text.DecimalFormat;


public class Show {
    
    private double F,P,Q,V;

    public double getF() {
        return F;
    }

    public void setF(double F) {
        this.F = F;
    }

    public double getP() {
        return P;
    }

    public void setP(double P) {
        this.P = P;
    }

    public double getQ() {
        return Q;
    }

    public void setQ(double Q) {
        this.Q = Q;
    }

    public double getV() {
        return V;
    }

    public void setV(double V) {
        this.V = V;
    }
    
    public String GetInfo(){
        
        DecimalFormat f = new DecimalFormat();
        
        String Dados = "";
        
        Dados += "<p><strong>Velocidade final</strong>___________ " + f.format(getV()) + " m/s</p>";
        Dados += "<p><strong>Quantidade de movimento</strong>__ " + f.format(getQ()) + " kg.m/s</p>";
        Dados += "<p><strong>Força resultante</strong>___________ " + f.format(getF()) + " N</p>";
        Dados += "<p><strong>Peso</strong>_____________________ " + f.format(getP()) + " N</p>";
        
        return Dados;
    }
}
