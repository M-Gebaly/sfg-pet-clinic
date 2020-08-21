package gebaly.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> Specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return Specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.Specialities = specialities;
    }
}
