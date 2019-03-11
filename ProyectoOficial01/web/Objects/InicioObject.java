package Objects;

public class InicioObject {
    
    private String m_strUsuario;
    private String m_strContraseña;

    public InicioObject(String m_strUsuario, String m_strContraseña) {
        this.m_strUsuario = m_strUsuario;
        this.m_strContraseña = m_strContraseña;
    }

    public String getUsuario() {
        return m_strUsuario;
    }

    public void setUsuario(String p_strUsuario) {
        m_strUsuario = p_strUsuario;
    }

    public String getContraseña() {
        return m_strContraseña;
    }

    public void setContraseña(String p_strContraseña) {
        m_strContraseña = p_strContraseña;
    }
    
    
}
