package gebaly.springframework.sfgpetclinic.repositories;

import gebaly.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
