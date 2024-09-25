package com.zwigato.zwigato.Service;

import java.util.List;

import com.zwigato.zwigato.Entity.Restaurent;

public interface RestaurentService {
    List<Restaurent> getAllRestaurents();

    Restaurent saveRestaurent(Restaurent restaurent);

    Restaurent getRestaurentByName(int id);

    Restaurent updateRestaurent(Restaurent restaurent);

    void deleteRestaurent(int id);

    // List<Restaurent> getRestaurentByCity(String city);

    // List<Restaurent> getRestaurentByCuisine(String cuisine);

    // List<Restaurent> getRestaurentByRating(int rating);

    // List<Restaurent> getRestaurentByPrice(int price);

    // List<Restaurent> getRestaurentByLocation(String location);

    // List<Restaurent> getRestaurentByCuisineAndCity(String cuisine, String city);

    // List<Restaurent> getRestaurentByCuisineAndLocation(String cuisine, String location);

    // List<Restaurent> getRestaurentByCityAndLocation(String city, String location);
    
}