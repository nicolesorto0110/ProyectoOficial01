package ProyectoLae.Objects;

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
        private String direccion;
    private String ciudad;
       private String departamento;
    
    
    public RegistroObject(String p_strNombre, String p_strApellido, String p_strEmail, String p_strGenero, int p_iBirthYear, int p_iBirthmonth, int p_iBirthDay, String p_strContrasena, String p_strConfirm,String direccion, String ciudad, String departamento) {
        setNombre(p_strNombre);
        setApellido(p_strApellido);
        setEmail(p_strEmail);
        setGenero(p_strGenero);
        setBirthYear(p_iBirthYear);
        setBirthmonth(p_iBirthmonth);
        setBirthDay(p_iBirthDay);
        setContrasena(p_strContrasena);
        setConfirm(p_strConfirm);
        setCiudad(ciudad);
        setDepartamento(departamento);
        setDireccion(direccion);
        
    
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
    
    
    public String getNombre() {
        return m_strNombre;
    }

    private void setNombre(String p_strNombre) {
        m_strNombre = p_strNombre;
    }

    public String getApellido() {
        return m_strApellido;
    }

    private void setApellido(String p_strApellido) {
        m_strApellido = p_strApellido;
    }

    public String getEmail() {
        return m_strEmail;
    }

    private void setEmail(String p_strEmail) {
        m_strEmail = p_strEmail;
    }

    public String getGenero() {
        return m_strGenero;
    }

    private void setGenero(String p_strGenero) {
        m_strGenero = p_strGenero;
    }

    public int getBirthYear() {
        return m_iBirthYear;
    }

    private void setBirthYear(int p_iBirthYear) {
        m_iBirthYear = p_iBirthYear;
    }

    public int getBirthmonth() {
        return m_iBirthmonth;
    }

    private void setBirthmonth(int p_iBirthmonth) {
        m_iBirthmonth = p_iBirthmonth;
    }

    public int getBirthDay() {
        return m_iBirthDay;
    }

    private void setBirthDay(int p_iBirthDay) {
        m_iBirthDay = p_iBirthDay;
    }

    public String getContrasena() {
        return m_strContrasena;
    }

    private void setContrasena(String p_strContrasena) {
        m_strContrasena = p_strContrasena;
    }

    public String getConfirm() {
        return m_strConfirm;
    }

    private void setConfirm(String p_strConfirm) {
        m_strConfirm = p_strConfirm;
    }
    
}

    
