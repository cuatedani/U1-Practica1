
import java.util.Date;

public class FechaHora {
    private int dia;
    private int mes;
    private int year;
    private int hora;
    private int minuto;

    public void hoy(){
        Date fecha = new Date();
        dia=fecha.getDate();
        mes=fecha.getMonth();
        mes++;
        year=fecha.getYear();
        year+=1900;
        hora=fecha.getHours();
        minuto=fecha.getMinutes();
    }
    
    public String FechaLarga(){
        String cadena="";
        switch(mes){
            case 1: cadena=dia+" de Enero del "+year;
            case 2: cadena=dia+" de Febrero del "+year;
            case 3: cadena=dia+" de Marzo del "+year;
            case 4: cadena=dia+" de Abril del "+year;
            case 5: cadena=dia+" de Mayo del "+year;
            case 6: cadena=dia+" de Junio del "+year;
            case 7: cadena=dia+" de Julio del "+year;
            case 8: cadena=dia+" de Agosto del "+year;
            case 9: cadena=dia+" de Septiembre del "+year;
            case 10: cadena=dia+" de Octubre del "+year;
            case 11: cadena=dia+" de Noviembre del "+year;
            case 12: cadena=dia+" de Diciembre del "+year;
            default: ;
        }
        return cadena;
    }
    
    public String FechaCorta(){
        String cadena;
        String año=year+"";
        cadena=dia+"/"+mes+"/"+año.substring(2);
        return cadena;
    }
    
    public String Formato24(){
        String cadena;
        cadena=hora+":"+minuto;
        return cadena;
    }
    
    public String Formato12(){
        String cadena="";
        if(hora==24){
            cadena=(hora-12)+":"+minuto+" A.M.";
        }else{
            if(hora==12){
                cadena=hora+":"+minuto+" P.M.";
            }else{
                if(hora>12){
                    cadena=(hora-12)+":"+minuto+" P.M.";
                }else{
                    cadena=hora+":"+minuto+" A.M.";
                }
            }
        }
        return cadena;
    }
}
