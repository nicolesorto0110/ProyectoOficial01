/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoLae.Objects;

/**
 *
 * @author Nicole
 */
  
public class StoreObjetos {
      private int m_id;
    private String m_nombreProducto;
    private String m_descripcion;
    private int m_existencia;
    private float m_precio;  
    private String m_imagen;  
    private int m_subCategoria;

    public StoreObjetos(String m_nombreProducto, String m_descripcion, int m_existencia, float m_precio, String m_imagen, int m_subCategoria,int m_id) {
        setM_nombreProducto(m_nombreProducto);
        setM_descripcion(m_descripcion);
        setM_existencia(m_existencia);
        setM_precio(m_precio);
        setM_imagen(m_imagen);
        setM_subCategoria(m_subCategoria);
        setM_id(m_id);
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int p_id) {
        this.m_id = p_id;
    }

    
    
    
    
    
    
    
    
    public String getM_nombreProducto() {
        return m_nombreProducto;
    }

    private void setM_nombreProducto(String p_nombreProducto) {
        this.m_nombreProducto = p_nombreProducto;
    }

    public String getM_descripcion() {
        return m_descripcion;
    }

    private void setM_descripcion(String p_descripcion) {
        this.m_descripcion = p_descripcion;
    }

    public int getM_existencia() {
        return m_existencia;
    }

    private void setM_existencia(int p_existencia) {
        this.m_existencia = p_existencia;
    }

    public float getM_precio() {
        return m_precio;
    }

    private void setM_precio(float p_precio) {
        this.m_precio = p_precio;
    }

    public String getM_imagen() {
        return m_imagen;
    }

    private void setM_imagen(String p_imagen) {
        this.m_imagen = p_imagen;
    }

    public int getM_subCategoria() {
        return m_subCategoria;
    }

    private void setM_subCategoria(int p_subCategoria) {
        this.m_subCategoria = p_subCategoria;
    }
    
    
    
    
    
    
}
