package co.edu.ufps.gidisoft.services.impl;

import co.edu.ufps.gidisoft.models.ProductoInvestigacion;
import co.edu.ufps.gidisoft.repositories.IProductoRepository;
import co.edu.ufps.gidisoft.services.IProductoService;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {

    private IProductoRepository productoRepository;

    public ProductoService(IProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public ProductoInvestigacion guardarProducto(ProductoInvestigacion productoInvestigacion) {
        return this.productoRepository.save(productoInvestigacion);
    }
}
