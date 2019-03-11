package Objects;

public class RegistroObject {
    
    private String m_strNombre;
    private String m_strApellido;
    private String m_strEmail;
    private String m_strGenero;
    private int m_iBirthYear;
    private int m_iBirthmonth;
    private int m_iBirthDay;
    private String m_strContrasena;
    private String m_strConfirm;

    public RegistroObject(String m_strNombre, String m_strApellido, String m_strEmail, String m_strGenero, int m_iBirthYear, int m_iBirthmonth, int m_iBirthDay, String m_strContrasena, String m_strConfirm) {
        this.m_strNombre = m_strNombre;
        this.m_strApellido = m_strApellido;
        this.m_strEmail = m_strEmail;
        this.m_strGenero = m_strGenero;
        this.m_iBirthYear = m_iBirthYear;
        this.m_iBirthmonth = m_iBirthmonth;
        this.m_iBirthDay = m_iBirthDay;
        this.m_strContrasena = m_strContrasena;
        this.m_strConfirm = m_strConfirm;
    }

    public String getNombre() {
        return m_strNombre;
    }

    public void setNombre(String p_strNombre) {
        m_strNombre = p_strNombre;
    }

    public String getApellido() {
        return m_strApellido;
    }

    public void setApellido(String p_strApellido) {
        m_strApellido = p_strApellido;
    }

    public String getEmail() {
        return m_strEmail;
    }

    public void setEmail(String p_strEmail) {
        m_strEmail = p_strEmail;
    }

    public String getGenero() {
        return m_strGenero;
    }

    public void setGenero(String p_strGenero) {
        m_strGenero = p_strGenero;
    }

    public int getBirthYear() {
        return m_iBirthYear;
    }

    public void setBirthYear(int p_iBirthYear) {
        m_iBirthYear = p_iBirthYear;
    }

    public int getBirthmonth() {
        return m_iBirthmonth;
    }

    public void setBirthmonth(int p_iBirthmonth) {
        m_iBirthmonth = p_iBirthmonth;
    }

    public int getBirthDay() {
        return m_iBirthDay;
    }

    public void setBirthDay(int p_iBirthDay) {
        m_iBirthDay = p_iBirthDay;
    }

    public String getContrasena() {
        return m_strContrasena;
    }

    public void setContrasena(String p_strContrasena) {
        m_strContrasena = p_strContrasena;
    }

    public String getConfirm() {
        return m_strConfirm;
    }

    public void setConfirm(String p_strConfirm) {
        m_strConfirm = p_strConfirm;
    }
    
}
