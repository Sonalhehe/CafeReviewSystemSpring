package com.cafe.controller;

import com.cafe.model.Cafe;
import com.cafe.service.CafeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cafes")
@CrossOrigin(origins = "*")
public class CafeController {
    private final CafeService service;
    public CafeController(CafeService service) { this.service = service; }

    @GetMapping
    public List<Cafe> getAllCafes() { return service.getAll(); }

    @PostMapping
    public Cafe addCafe(@RequestBody Cafe cafe) { return service.save(cafe); }
}

