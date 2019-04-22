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
public class carritoObjeto {
            private int id;

        private String m_imagen;
        private String m_nombreProducto;
        private int m_cantidad;
        private float m_precio;

    public carritoObjeto(String m_imagen, String m_nombreProducto, int m_cantidad, float m_precio,int id) {
        setM_imagen(m_imagen);
        setM_nombreProducto(m_nombreProducto);
        setM_cantidad(m_cantidad);
        setM_precio(m_precio);
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        
        
        
        
        
    public String getM_imagen() {
        return m_imagen;
    }

    public void setM_imagen(String p_imagen) {
        this.m_imagen = p_imagen;
    }

    public String getM_nombreProducto() {
        return m_nombreProducto;
    }

    public void setM_nombreProducto(String p_nombreProducto) {
        this.m_nombreProducto = p_nombreProducto;
    }

    public int getM_cantidad() {
        return m_cantidad;
    }

    public void setM_cantidad(int p_cantidad) {
        this.m_cantidad = p_cantidad;
    }

    public float getM_precio() {
        return m_precio;
    }

    public void setM_precio(float p_precio) {
        this.m_precio = p_precio;
    }

 
    
}
