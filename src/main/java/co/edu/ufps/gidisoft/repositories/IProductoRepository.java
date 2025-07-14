package co.edu.ufps.gidisoft.repositories;

import co.edu.ufps.gidisoft.models.ProductoInvestigacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<ProductoInvestigacion, Long> {
}
