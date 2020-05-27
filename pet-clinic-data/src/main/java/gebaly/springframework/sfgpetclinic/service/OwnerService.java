package gebaly.springframework.sfgpetclinic.service;

import gebaly.springframework.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
