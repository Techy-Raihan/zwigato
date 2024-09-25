package com.zwigato.zwigato.Service.Implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zwigato.zwigato.Entity.Restaurent;
import com.zwigato.zwigato.Repository.RestaurentRepo;
import com.zwigato.zwigato.Service.RestaurentService;

@Service
public class RestaurentServiceImpl implements RestaurentService{

    private RestaurentRepo restaurentRepo;

    public RestaurentServiceImpl(RestaurentRepo restaurentRepo) {
        super();
        this.restaurentRepo = restaurentRepo;
    }

    @Override
    public Restaurent saveRestaurent(Restaurent restaurent) {
       return restaurentRepo.save(restaurent);
    }

    @Override
    public Restaurent updateRestaurent(Restaurent restaurent) {
        return restaurentRepo.save(restaurent);
    }

    @Override
    public void deleteRestaurent(int id) {
        restaurentRepo.deleteById(id);
    }

    @Override
    public Restaurent getRestaurentByName(int id) {
        return restaurentRepo.findById(id).get();
    }

    @Override
    public List<Restaurent> getAllRestaurents() {
        return restaurentRepo.findAll();
    }
}
