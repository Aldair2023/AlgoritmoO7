/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author aldair
 */
public class Reloj {

    private int Horas;
    private int Minutos;
    private int Segundos;

    public Reloj(int Horas, int Minutos, int Segundos) {
        this.Horas = Horas;
        this.Minutos = Minutos;
        this.Segundos = Segundos;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public int getMinutos() {
        return Minutos;
    }

    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    public int getSegundos() {
        return Segundos;
    }

    public void setSegundos(int Segundos) {
        this.Segundos = Segundos;
    }

    public String comprobar() {
        String aux1;

        if (this.getHoras() > 24 && this.getMinutos() > 60 && this.getSegundos() > 60) {
            aux1 = "hora es Incorrecta";
        } else {
            aux1 = "la hora es correcta";
        }

        return aux1;
    }

    public String Igualar(Reloj Dos) {

        String igual;

        if (this.getHoras() == Dos.getHoras() && this.getMinutos() == Dos.getMinutos() && this.getSegundos() == Dos.getSegundos()) {
            igual = "las horas de ambos reloj coinciden";
        }else{
            igual = "las horas NO coinciden";
        }
        
        return igual;
    }
    
    public String Mostrar(){
        String aux1;
        
       aux1 = "son las: "+this.getHoras()+ "con" +this.getMinutos()+ "y" +this.getSegundos();
    
       return aux1;
    }
    
    public String Comparar(Reloj Dos){
        String aux1;
        
        
        if(this.getHoras() > Dos.getHoras() && this.getMinutos() > Dos.Minutos && this.getSegundos() > Dos.getSegundos()){
            aux1 = "las hora general del reloj UNO es mayor a la del DOS";
        }else if(this.getHoras() > Dos.getHoras()){
            aux1 = "las hora del reloj UNO es mayor a la del DOS";
        }else if(this.getHoras() < Dos.getHoras()){
            aux1 = "las hora del reloj DOS es mayor a la del UNO";
        }else if(this.getMinutos() < Dos.getMinutos()){
            aux1 = "los minutos del reloj DOS es mayor a la del UNO";
        }else if(this.getMinutos() > Dos.getMinutos()){    
            aux1 = "los minutos del reloj UNO es mayor a la del DOS";
        }else if(this.getSegundos() < Dos.getSegundos()){
            aux1 = "los segundo del reloj DOS es mayor a la del UNO";
        }else if(this.getSegundos() > Dos.getSegundos()){
            aux1 = "los segundo del reloj UNO es mayor a la del DOS";
        }else{
            aux1 = "las hora general del reloj DOS es mayor a la del UNO";
        }    
            
        return aux1;
    }
}
