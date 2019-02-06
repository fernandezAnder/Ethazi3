package controlador;

import vista.Ventana7;

public class Contador extends Thread {
   
	@Override
    public void run(){
		
    	for (int i=0;i<=5;i++) {
        	try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}	
    	}
    	
    	Metodoak.lehenengoLeihoa();
    }
    	
}



