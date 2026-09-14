package pe.edu.upeu.sysventas.service;

import pe.edu.upeu.sysventas.dto.ComboBoxOption;
import pe.edu.upeu.sysventas.model.Producto;
import pe.edu.upeu.sysventas.model.UnidMedida;

import java.util.List;

public interface IProductoService extends IcrudGenericoService<Producto, Long> {
    List<ComboBoxOption>listarTipoProducto();
}
