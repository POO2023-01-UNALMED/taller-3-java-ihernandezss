package taller3.televisores;

public class TV  {
	//atributos
    private Marca marca;
    int canal = 1;
    private int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;
    static int numTV;

    //constructor
    public TV (Marca marca, boolean estado){
        this.marca=marca;
        this.estado=estado;
        numTV++;
    }
    //setters y getters de numTV
    static public void setNumTV(int numTV){
        TV.numTV=numTV;
    }
    static public int getNumTV() {
    	return numTV;
    }

    //metodo para acceder al numTV
    public int getNumTv(){
        return numTV;
    }

    //métodos get-set
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
    //metodo para encender el televisor
    public void turnOn(){
        estado = true;
    }
    //metodo para apagar el televisor
    public void turnOff(){
        estado = false;
    }
    //metodo para saber el estado del tv
    public boolean getEstado(){
        return estado;
    }
    //metodo para subir el canal con condicional
    public void canalUp (){
        if (canal >=1 && canal != 120 && estado==true)
            canal++;
    }
    //metodo para bajar el canal
    public void canalDown (){
        if (canal >1 && canal <= 120 && estado==true)
            ++canal;
    }
    //metodo para subir volumen
    public void volumenUp(){
        if (volumen>=0 && volumen !=8 && estado==true)
            volumen++;
    }
    //metodo para bajar volumen
    public void volumenDown() {
        if (volumen>0 && volumen <=8 && estado==true)
            ++volumen;
    }
}