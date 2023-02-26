package taller3.televisores;

public class Control {
	private TV tv;

   
    public void turnOn(){
    	tv.estado = true;
    }
    
    public void turnOff(){
        tv.estado = false;
    }
    
    public boolean getEstado(){
        return tv.estado;
    }
    
    public void canalUp (){
    	if (tv.estado==true) {
    		if (tv.canal >=1 && tv.canal < 120)
    			tv.canal++;
    	}
    }
    
    public void canalDown (){
    	if (tv.estado==true) {
    		if (tv.canal >1 && tv.canal <= 120)
    			++tv.canal;
    	}
    }
    
    public void volumenUp(){
        if (tv.volumen>=0 && tv.volumen !=8 && tv.estado==true)
            tv.volumen++;
    }
    
    public void volumenDown() {
        if (tv.volumen>0 && tv.volumen <=8 && tv.estado==true)
            ++tv.volumen;
    }

    
    public void setCanal(int canal) {
    	if (tv.estado==true) {
    		if (canal>=1 && canal<=120)
    			tv.canal = canal;
    	}
    }
    
    
    public void enlazar(TV tv){
        this.tv = tv;
        tv.control = this;
    }
   
    public TV getTv() {
        return tv;
    }
    
    public TV setTv(TV tv) {
        return tv;

    }

}


