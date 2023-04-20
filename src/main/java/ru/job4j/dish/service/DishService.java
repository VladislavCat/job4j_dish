package ru.job4j.dish.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.dish.model.Dish;
import ru.job4j.dish.repository.DishDataRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DishService {
    private final DishDataRepository repository;

    public Dish save(Dish dish) {
        return repository.save(dish);
    }

    public List<Dish> findAll() {
        return repository.findAll();
    }

    public Optional<Dish> findById(int id) {
        return repository.findById(id);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
