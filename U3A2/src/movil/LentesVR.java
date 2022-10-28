/*ALARCON ALARCON FRANCISCO JAVIER*/
package movil;

public class LentesVR extends Warable{
    
    String sensores;
    String Conectividad;

    public String getSensores() {
        return sensores;
    }

    public void setSensores(String sensores) {
        this.sensores = sensores;
    }

    public String getConectividad() {
        return Conectividad;
    }

    public void setConectividad(String Conectividad) {
        this.Conectividad = Conectividad;
    }
    
    void activandoSensores(){
        System.out.println("Activando sensores " +this.sensores);
    }
    
    void activandoConectividadTotal(){
        System.out.println("Activando conectividad " +this.Conectividad);
    }
    
    void desactivandoConectividadTotal(){
        System.out.println("Desactivando conectividad " +this.Conectividad);
    }

    @Override
    void encender() {
        super.encender(); 
    }

    @Override
    void apagar() {
        super.apagar();
    }

    @Override
    void abrirCamara() {
        super.abrirCamara();
    }

    @Override
    void cerrarCamara() {
        super.cerrarCamara();
    }

    @Override
    void actualizarSO() {
        super.actualizarSO();
    }

    @Override
    void ahorroBateria() {
        super.ahorroBateria();
    }
    
    
}
