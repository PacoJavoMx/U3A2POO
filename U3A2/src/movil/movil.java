//ALARCON ALARCON FRANCISCO JAVIER
package movil;

public class movil extends DispositivoElectronico {
    
    //Se definen los atributos
    String marca;
    String modelo;
    String pantalla;
    String procesador;
    String ram;
    String almacenamiento;
    String expansion;
    String camara;
    String bateria;
    String sistemaoperativo;
    String perfil;
    String peso;
    String precio;
    
    //Metodos Set-Get

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }



    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }
    
    

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getSistemaoperativo() {
        return sistemaoperativo;
    }

    public void setSistemaoperativo(String sistemaoperativo) {
        this.sistemaoperativo = sistemaoperativo;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
     
    

    
   //Se definen los comportamientos
   
    void encender(){
        System.out.println("Encendiendo " +this.marca+this.modelo);
    }
    
    void apagar(){
        System.out.println("Apagando " +this.marca+this.modelo);
    }
    
    void abrirCamara(){
        System.out.println("Abriendo camara " +this.camara);
    }
    
    void cerrarCamara(){
        System.out.println("Cerrando camara " +this.camara);
    }
    
    void actualizarSO(){
        System.out.println("Actualizando sistema operativo " +this.sistemaoperativo);
    }
    
    void ahorroBateria(){
        System.out.println("Activando ahorro de batería " +this.bateria);
    }
    
    
    
}
