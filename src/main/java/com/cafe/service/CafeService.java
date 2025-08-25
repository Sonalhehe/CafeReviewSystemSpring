package com.cafe.service;

import com.cafe.model.Cafe;
import com.cafe.repository.CafeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CafeService {
    private final CafeRepository repo;
    public CafeService(CafeRepository repo) { this.repo = repo; }

    public List<Cafe> getAll() { return repo.findAll(); }
    public Cafe save(Cafe cafe) { return repo.save(cafe); }
}
