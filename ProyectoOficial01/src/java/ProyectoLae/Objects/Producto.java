
package ProyectoLae.Objects;


public class Producto {
    
    
    private String m_strCategoria;
    private double m_dPrecio;
    private String m_strSubCategoria;
    private String m_strNombreProducto;
    private String m_strDescripcion;
    private int m_iExistencia;
    private String m_strImagen;

    public Producto(String p_strCategoria, double p_dPrecio, 
            String p_strSubCategoria, String p_strNombreProducto, 
            String p_strDescripcion, int p_iExistencia, String m_strImagen) {
        setCategoria(p_strCategoria);
        setPrecio(p_dPrecio);
        setSubCategoria(p_strSubCategoria);
        setNombreProducto(p_strNombreProducto);
        setDescripcion(p_strDescripcion);
        setExistencia(p_iExistencia);
        setImagen(m_strImagen);
    }

    
    public String getCategoria() {
        return m_strCategoria;
    }

    private void setCategoria(String p_strCategoria) {
        m_strCategoria = p_strCategoria;
    }

    public double getPrecio() {
        return m_dPrecio;
    }

    private void setPrecio(double p_dPrecio) {
        m_dPrecio = p_dPrecio;
    }

    public String getSubCategoria() {
        return m_strSubCategoria;
    }

    private void setSubCategoria(String p_strSubCategoria) {
        m_strSubCategoria = p_strSubCategoria;
    }

    public String getNombreProducto() {
        return m_strNombreProducto;
    }

    private void setNombreProducto(String p_strNombreProducto) {
        m_strNombreProducto = p_strNombreProducto;
    }

    public String getDescripcion() {
        return m_strDescripcion;
    }

    private void setDescripcion(String p_strDescripcion) {
       m_strDescripcion = p_strDescripcion;
    }

    public int getExistencia() {
        return m_iExistencia;
    }

    private void setExistencia(int p_iExistencia) {
        m_iExistencia = p_iExistencia;
    }
    
    public String getImagen() {
        return m_strNombreProducto;
    }

    private void setImagen(String p_strImagen) {
        m_strImagen = p_strImagen;
    }
}
