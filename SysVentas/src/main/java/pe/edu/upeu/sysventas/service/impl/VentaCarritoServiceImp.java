package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.model.VentCarrito;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.repository.VentCarritoRepository;
import pe.edu.upeu.sysventas.service.IVentaCarritoService;

import java.util.List;

public class VentaCarritoServiceImp extends CrudGenerioServiceImp<VentCarrito, Long>
        implements IVentaCarritoService {

    private final VentCarritoRepository ventCarritoRepository;

    public VentaCarritoServiceImp(VentCarritoRepository ventCarritoRepository) {
        this.ventCarritoRepository = ventCarritoRepository;
    }

    @Override
    protected ICrudGenericoRepository<VentCarrito, Long> getRepo() {
        return ventCarritoRepository;
    }

    @Override
    public List<VentCarrito> listaCarritoCliente(String dni) {
        return ventCarritoRepository.listaCarritoCliente(dni);
    }

    @Override
    public void deleteCarAll(String dniruc) {
        ventCarritoRepository.deleteByDniruc(dniruc);
    }

    @Override
    public VentCarrito save(VentCarrito ventCarrito) {
        return null;
    }

    @Override
    public VentCarrito update(Long aLong, VentCarrito ventCarrito) {
        return null;
    }

    @Override
    public List<VentCarrito> findAll() {
        return List.of();
    }

    @Override
    public VentCarrito findById(Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
