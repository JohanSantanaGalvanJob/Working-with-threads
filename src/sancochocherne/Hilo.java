package sancochocherne;

import java.util.concurrent.Semaphore;

public class Hilo extends Thread {

    public Semaphore sem1,sem2,sem3,sem4,sem5,sem6,sem7;

    public Hilo(String texto, Semaphore se1,Semaphore se2,Semaphore se3,Semaphore se4,Semaphore
se5,Semaphore se6,Semaphore se7) {
        super(texto);
        this.sem1=se1; this.sem2=se2; this.sem3=se3; this.sem4=se4; this.sem5=se5; this.sem6=se6;
        this.sem7=se7;;
        
    }

    @Override
    public void run() {
        
        if (this.getName().equals("H1")) {
            System.out.println(" H1 Pelar las papas");
            sem1.release(); //desbloqueo semáforo 1.
        } 
        
        if (this.getName().equals("H2")) {
            try{
                sem1.acquire(); //espero por el semáforo 1 
            } catch (InterruptedException e){}
            System.out.println("H2 Cortar las papas en lascas");
            sem2.release(); //desbloqueo semáforo 2.
        } 
        
        if (this.getName().equals("H3")) {
            System.out.println("H3 Calentar aceite a medio fuego");
            sem2.release(); //desbloqueo semáforo 3.
        } 
        
        if (this.getName().equals("H4")) {
            try{
                sem2.acquire(); //espero por el semáforo 2 
            } catch (InterruptedException e){}
            System.out.println("H4 Pochar las papas");
            sem3.release(); //desbloqueo semáforo 4.
        } 
        
        if (this.getName().equals("H5")) {
            System.out.println("H5 Trocear tomate por la mitad");
            sem3.release(); //desbloqueo semáforo 5.
        } 
        
        if (this.getName().equals("H6")) {
            System.out.println("H6 Trocear pimiento");
            sem3.release(); //desbloqueo semáforo 6.
        } 
        
        if (this.getName().equals("H7")) {
            System.out.println("H7 Poner sal ajo y perejil al cherne antes de colocarlo en la fuente de horno");
            sem3.release(); //desbloqueo semáforo 7.
        } 
        
        if (this.getName().equals("H8")) {
            try{
                sem3.acquire(); //espero por el semáforo 4 
            } catch (InterruptedException e){}
           
            System.out.println("H8 Colocar en una fuente de horno las papas pochadas con el tomate, el pimiento y el Cherne");
            sem4.release(); //desbloqueo semáforo 8.
        } 
        
        if (this.getName().equals("H9")) {
            System.out.println("H9 Precalentar horno a 270 grados centígrados");
            sem4.release(); //desbloqueo semáforo 9.
        } 
        
        if (this.getName().equals("H10")) {
            try{
                sem4.acquire(); //espero por el semáforo 8 
            } catch (InterruptedException e){}
            System.out.println("H10 Meter fuente con todo en el horno precalentado a 270º solo 5 minutos para que se marque");
            sem5.release(); //desbloqueo semáforo 10.
        } 
        
        if (this.getName().equals("H11")) {
            System.out.println("H11 Calentar vaso de vino blanco hasta llevarlo a ebullición");
            sem5.release(); //desbloqueo semáforo 11.
        } 
        
        if (this.getName().equals("H12")) {
            try{
                sem5.acquire(); //espero por el semáforo 10 
            } catch (InterruptedException e){}
            System.out.println("H12 Tras marcar el pescado, rocía el vaso de vino blanco por todo el pescado");
            sem6.release(); //desbloqueo semáforo 12.
        } 
        
        if (this.getName().equals("H13")) {
            try{
                sem6.acquire(); //espero por el semáforo 12 
            } catch (InterruptedException e){}
            System.out.println("H13 Poner el horno a 160 grados y cocinar durante 20 minutos más");
            sem7.release(); //desbloqueo semáforo 13.
        } 
        
        if (this.getName().equals("H14")) {
            try{
                sem7.acquire(); //espero por el semáforo 13 
            } catch (InterruptedException e){}
            System.out.println("H14 Servir caliente");
        } 
        
    }

}
