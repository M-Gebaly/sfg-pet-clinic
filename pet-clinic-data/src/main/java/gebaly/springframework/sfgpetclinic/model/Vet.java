package gebaly.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_Specialities", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> Specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return Specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.Specialities = specialities;
    }
}
