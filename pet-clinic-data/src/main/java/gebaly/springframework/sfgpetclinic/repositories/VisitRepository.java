package gebaly.springframework.sfgpetclinic.repositories;

import gebaly.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
