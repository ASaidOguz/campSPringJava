package kodlama.io.rentAcar.business.abstracts;


import java.util.List;

import kodlama.io.rentAcar.business.Requests.CreateBrandRequest;
import kodlama.io.rentAcar.business.Responses.GetAllBrandsResponse;
import kodlama.io.rentAcar.entities.concretes.Brand;


public interface IBrandService {

    List<GetAllBrandsResponse> getAll(); // get all brands
    void add(CreateBrandRequest createBrandRequest);
}

