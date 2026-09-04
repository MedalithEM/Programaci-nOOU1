package pe.edu.upeu.sysventas.model;

import lombok.Data;
import pe.edu.upeu.sysventas.enums.TipoDocumento;
@Data      //TIENE GETTER Y SETTER
public class Cliente {
    String dniruc;
    String nombre;
    String repLegal;
    TipoDocumento tipoDocumento;
}
