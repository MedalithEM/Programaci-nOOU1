package pe.edu.upeu.sysventas.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder              //patron para no instanciar y que sea de forma directa
@NoArgsConstructor    //crea un constructor vacio
@AllArgsConstructor
public class Categoria {
    private Long idCategoria;
    private String nombre;
}