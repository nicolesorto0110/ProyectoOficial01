package ProyectoLae.Objects;

public class InicioObject {
    
    private String m_strUsuario;
    private String m_strContraseña;

    public InicioObject(String p_strUsuario, String p_strContraseña) {
        setUsuario(p_strUsuario);
        setContraseña(p_strContraseña);
    }

    public String getUsuario() {
        return m_strUsuario;
    }

    private void setUsuario(String p_strUsuario) {
        m_strUsuario = p_strUsuario;
    }

    public String getContraseña() {
        return m_strContraseña;
    }

    private void setContraseña(String p_strContraseña) {
        m_strContraseña = p_strContraseña;
    }
    
    
}

    
