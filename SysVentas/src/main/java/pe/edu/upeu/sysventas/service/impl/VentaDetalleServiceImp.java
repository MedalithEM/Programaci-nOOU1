package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.model.VentaDetalle;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.repository.VentaDetalleRepository;
import pe.edu.upeu.sysventas.service.IVentaDetalleService;

import java.util.List;

public class VentaDetalleServiceImp extends CrudGenerioServiceImp<VentaDetalle, Long>
        implements IVentaDetalleService {

    private final VentaDetalleRepository repository;

    public VentaDetalleServiceImp(VentaDetalleRepository repository) {
        this.repository = repository;
    }

    @Override
    protected ICrudGenericoRepository<VentaDetalle, Long> getRepo() {
        return repository;
    }

    @Override
    public VentaDetalle save(VentaDetalle ventaDetalle) {
        return null;
    }

    @Override
    public VentaDetalle update(Long aLong, VentaDetalle ventaDetalle) {
        return null;
    }

    @Override
    public List<VentaDetalle> findAll() {
        return List.of();
    }

    @Override
    public VentaDetalle findById(Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
