
package Modelos;

public class InfoPanel {
    private int idInfo;
    private String titulo;
    private String cuerpo;

    public InfoPanel() {
    }
    
    

    public InfoPanel(int idInfo, String titulo, String cuerpo) {
        this.idInfo = idInfo;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public int getIdInfo() {
        return idInfo;
    }

    public void setIdInfo(int idInfo) {
        this.idInfo = idInfo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
    
    
}
