package co.edu.ufps.gidisoft.services;

import co.edu.ufps.gidisoft.models.ProductoInvestigacion;
import org.springframework.stereotype.Service;

@Service
public interface IProductoService {

    public ProductoInvestigacion guardarProducto(ProductoInvestigacion productoInvestigacion);

}
