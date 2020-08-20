package gebaly.springframework.sfgpetclinic.bootstrap;

import gebaly.springframework.sfgpetclinic.model.Owner;
import gebaly.springframework.sfgpetclinic.model.Pet;
import gebaly.springframework.sfgpetclinic.model.PetType;
import gebaly.springframework.sfgpetclinic.model.Vet;
import gebaly.springframework.sfgpetclinic.service.OwnerService;
import gebaly.springframework.sfgpetclinic.service.PetTypeService;
import gebaly.springframework.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner /*For loading data*/{

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    //@Autowired no need it generated automatically
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    /*
    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }*/

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        //owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("1123 Monib");
        owner1.setCity("Giza");
        owner1.setTelephone("025982358");

        Pet miskesPet = new Pet();
        miskesPet.setPetType(savedDogPetType);
        miskesPet.setOwner(owner1);
        miskesPet.setBirthDate(LocalDate.now());
        miskesPet.setName("Rosco");
        owner1.getPets().add(miskesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        //owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("1123 Shobra");
        owner2.setCity("Cairo");
        owner2.setTelephone("026459324");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("Just Cat");
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners.....");

        Vet vet1 = new Vet();
        //vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        //vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
