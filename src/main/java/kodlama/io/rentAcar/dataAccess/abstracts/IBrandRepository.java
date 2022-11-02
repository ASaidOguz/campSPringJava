package kodlama.io.rentAcar.dataAccess.abstracts;

import java.util.List;

import kodlama.io.rentAcar.entities.concretes.Brand;

public interface IBrandRepository {

    List<Brand> getAll(); // get all brands

    void add(Brand brand); // add brand

    void update(Brand brand); // update brand

    void delete(Brand brand); // delete brand
}

