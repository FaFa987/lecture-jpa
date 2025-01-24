package se.lexicon.lecturejpa.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.lecturejpa.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
