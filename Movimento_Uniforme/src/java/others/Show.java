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
        
        Dados += "<table>";
        Dados += "  <th colspan='2'>Cálculos físicos</th>";
        Dados += "  <tr>";
        Dados += "      <th>Velocidade final</th>";
        Dados += "      <td>" + f.format(getV()) + " m/s</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Quantidade de movimento</th>";
        Dados += "      <td>" + f.format(getQ()) + " kg.m/s</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Força resultante</th>";
        Dados += "      <td>" + f.format(getF()) + " N</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Peso</th>";
        Dados += "      <td>" + f.format(getP()) + " N</td>";
        Dados += "  </tr>";
        Dados += "</table>";
        
        return Dados;
    }
}
