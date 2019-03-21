
package ProyectoLae.Objects;

import ProyectoLae.pojos.CategoriaInfo;


public class CategoriaObj {
    
    CategoriaInfo Categoria;

    public CategoriaObj(CategoriaInfo Categoria) {
        setCategoria(Categoria);
    }
    
    public CategoriaInfo getCategoria() {
        return Categoria;
    }

    private void setCategoria(CategoriaInfo Categoria) {
        this.Categoria = Categoria;
    }
    
    
    
}
