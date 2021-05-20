<%@page import="java.text.DecimalFormat"%>
<%@page import="others.Show"%>
<%@page import="others.Accessory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    
    <body>
        <%
            DecimalFormat n = new DecimalFormat();
            
            
            try{
                
                String Velocidade_txt,Aceleracao_txt,Distancia_txt,Massa_txt;
                
                Velocidade_txt = request.getAttribute("Velocy").toString();
                Aceleracao_txt = request.getAttribute("Aceleracao").toString();
                Distancia_txt = request.getAttribute("Space").toString();
                Massa_txt = request.getAttribute("Mass").toString();
                
                
                double F,P,Q,V,Vo,a,S,m;
                
                Vo = Double.parseDouble(Velocidade_txt);
                a = Double.parseDouble(Aceleracao_txt);
                S = Double.parseDouble(Distancia_txt);
                m = Double.parseDouble(Massa_txt);

                V = Accessory.VelocidadeFinal(Vo, a, S);
                Q = Accessory.QntdDeMovimento(V, m);
                F = Accessory.Forca(m, a);
                P = Accessory.Peso(m, 9.99);

                Show mostrar = new Show();

                mostrar.setV(V);
                mostrar.setQ(Q);
                mostrar.setF(F);
                mostrar.setP(P);

                out.print(mostrar.GetInfo());

                if(V < 0){
                    out.print("<p>VELOCIDADE INVÁLIDA :( ... !</p><p>NÃO existe velocidade negativa!!! ...</p>");
                }
                else{
                    if(V >= 0 && V < 11.111){
                        out.print("<p>ABAIXO DO LIMITE PERMITIDO!!!</p><p>O usuário está está trafegando com uma velocidade de <strong>" + n.format(V) + " m/s</strong>. Portanto, o motorista terá que pagar uma multa no valor de <strong>R$ " + (11.111 - V) * (65/10) + " reais</strong>.</p>");
                    }
                    else if(V >= 11.111 && V < 22.222){
                        out.print("<p>O USUÁRIO NÃO SERÁ MULTADO!!!</p><p>O usuário está está trafegando com uma velocidade de <strong>" + n.format(V) + " m/s</strong>. Portanto, o motorista não será multado.</p>");
                    }
                    else{
                        if(V >= 22.222){
                            out.print("<p>ACIMA DO LIMITE PERMITIDO!!!</p><p>O usuário está está trafegando com uma velocidade de <strong>" + n.format(V) + " m/s</strong>. Protanto, o motorista terá que pagar uma multa no valor de <strong>R$ " + (V - 22.222) * (65/10) + " reais</strong>.</p>");
                        }
                    }
                }
            }
            catch(Exception Erro){
                out.print("<p>Error :( ... " + Erro + "</p>");
            }
            
        %>
    </body>
</html>
