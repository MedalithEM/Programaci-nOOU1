package pe.edu.upeu.sysventas.service;

import pe.edu.upeu.sysventas.dto.ComboBoxOption;
import pe.edu.upeu.sysventas.model.UnidMedida;

import java.util.List;

public interface IUnidadMedidaService extends IcrudGenericoService<UnidMedida, Long> {
    List<ComboBoxOption> listarCombobox();
}
