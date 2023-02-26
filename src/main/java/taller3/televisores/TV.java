package taller3.televisores;

public class TV  {
	
    private Marca marca;
    int canal = 1;
    private int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;
    static int numTV;

    
    public TV (Marca marca, boolean estado){
        this.marca=marca;
        this.estado=estado;
        numTV++;
    }
    
    static public void setNumTV(int numTV){
        TV.numTV=numTV;
    }
    static public int getNumTV() {
    	return numTV;
    }

    
    public int getNumTv(){
        return numTV;
    }

   
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public void setControl(Control control) {
        this.control = control;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setVolumen(int volumen) {
    	if (estado==true)
    		this.volumen = volumen;
    }
    public void setCanal(int canal) {
    	if (estado==true) {
    		if (canal>=1 && canal<=120)
    			this.canal = canal;
    	}
    }
    public Marca getMarca() {
        return marca;
    }
    public Marca getMarca(Marca marca){
        return marca;
    }
    public Control getControl(){
        return control;
    }
    public int getPrecio(){
        return precio;
    }
    public int getVolumen(){
        return volumen;
    }
    public int getCanal(){
        return canal;

    }
    
    public void turnOn(){
        estado = true;
    }
    
    public void turnOff(){
        estado = false;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public void canalUp (){
        if (canal >=1 && canal != 120 && estado==true)
            canal++;
    }
    
    public void canalDown (){
        if (canal >1 && canal <= 120 && estado==true)
            canal=canal-1;
    }
   
    public void volumenUp(){
        if (volumen>=0 && volumen !=8 && estado==true)
            volumen++;
    }
    
    public void volumenDown() {
        if (volumen>0 && volumen <=8 && estado==true)
            volumen=volumen-1;
    }
}
