package ru.job4j.dish.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import ru.job4j.dish.service.DishService;
@Controller
@RequiredArgsConstructor
public class DishController {
    private final DishService dishService;
}
