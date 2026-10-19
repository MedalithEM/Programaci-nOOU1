package pe.edu.upeu.sysventas.model;

import lombok.Builder;
import lombok.Data;
import pe.edu.upeu.sysventas.enums.TipoDocumento;
@Builder
@Data      //TIENE GETTER Y SETTER
public class Cliente {
    String dniruc;
    String nombres;
    String direccion;

    String repLegal;
    TipoDocumento tipoDocumento;



}
