package ru.job4j.dish.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.dish.model.Dish;

import java.util.List;

@Repository
public interface DishDataRepository extends CrudRepository<Dish, Integer> {
    Dish save(Dish dish);
    List<Dish> findAll();
}
