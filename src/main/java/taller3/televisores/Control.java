package taller3.televisores;

public class Control {
	private TV tv;

    //métodos del tv
    //metodo para encender el televisor
    public void turnOn(){
    	tv.estado = true;
    }
    //metodo para apagar el televisor
    public void turnOff(){
        tv.estado = false;
    }
    //metodo para saber el estado del tv
    public boolean getEstado(){
        return tv.estado;
    }
    //metodo para subir el canal con condicional
    public void canalUp (){
        if (tv.canal >=1 && tv.canal != 120)
            tv.canal++;
    }
    //metodo para bajar el canal
    public void canalDown (){
        if (tv.canal >1 && tv.canal <= 120 && tv.estado==true)
            ++tv.canal;
    }
    //metodo para subir volumen
    public void volumenUp(){
        if (tv.volumen>=0 && tv.volumen !=8 && tv.estado==true)
            tv.volumen++;
    }
    //metodo para bajar volumen
    public void volumenDown() {
        if (tv.volumen>0 && tv.volumen <=8 && tv.estado==true)
            ++tv.volumen;
    }

    //método setCanal
    public void setCanal(int canal) {
        tv.canal = canal;
    }
    
    //metodo enlazar
    public void enlazar(TV tv){
        this.tv = tv;
        tv.control = this;
    }
    //método get
    public TV getTv() {
        return tv;
    }
    //método set
    public TV setTv(TV tv) {
        return tv;

    }

}


