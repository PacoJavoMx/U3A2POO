/*ALARCON ALARCON FRANCISCO JAVIER*/
package movil;

public class Reloj extends Warable{
    
    String chip;
    String brujula;
    String resistenciaAgua;

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getBrujula() {
        return brujula;
    }

    public void setBrujula(String brujula) {
        this.brujula = brujula;
    }

    public String getResistenciaAgua() {
        return resistenciaAgua;
    }

    public void setResistenciaAgua(String resistenciaAgua) {
        this.resistenciaAgua = resistenciaAgua;
    }
    
    void abrirBrujula(){
        System.out.println("Abriendo brujula");
                };
    
    void cerrarBrujula(){
        System.out.println("Cerrado brujula");
                };
    //Sobreescritura
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
