package pe.edu.upeu.sysventas.service;

import pe.edu.upeu.sysventas.dto.ComboBoxOption;
import pe.edu.upeu.sysventas.model.Marca;

import java.util.List;

public interface IMarcaService extends IcrudGenericoService<Marca,Long> {
    List<ComboBoxOption> listarCombobox();
}
