package ru.job4j.dish.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.job4j.dish.model.Dish;
import ru.job4j.dish.model.DishDto;
import ru.job4j.dish.service.DishService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/dish")
@RequiredArgsConstructor
public class DishController {
    private final DishService dishService;

    @GetMapping("/findDishesForOrder")
    public ResponseEntity<List<DishDto>> findDish(@RequestBody Map<String, ArrayList<Integer>> map) {
        return ResponseEntity.ok(dishService.findAllById(map.get("ids"))
                .stream()
                .map(DishDto::new)
                .collect(Collectors.toList()));
    }
}
