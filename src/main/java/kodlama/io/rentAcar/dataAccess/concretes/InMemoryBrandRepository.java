package kodlama.io.rentAcar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.rentAcar.dataAccess.abstracts.IBrandRepository;
import kodlama.io.rentAcar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryBrandRepository implements IBrandRepository {

    private List<Brand> brands; // list of brands .List is interface and ArrayList is class

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>(); // initialize the list of brands with new ArrayList object
        brands.add(new Brand(1, "Mercedes")); // add new brand to the list
        brands.add(new Brand(2, "BMW"));
        brands.add(new Brand(3, "Audi"));
        brands.add(new Brand(4, "Fiat"));
        brands.add(new Brand(5, "Ford"));
        brands.add(new Brand(6, "Opel"));
        brands.add(new Brand(7, "Renault"));
        brands.add(new Brand(8, "Toyota"));
        brands.add(new Brand(9, "Hyundai"));
        brands.add(new Brand(10, "Honda"));



    }

    @Override
    public List<Brand> getAll() {
        // TODO Auto-generated method stub
        return brands;
    }

    @Override
    public void add(Brand brand) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Brand brand) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Brand brand) {
        // TODO Auto-generated method stub

    }



}

