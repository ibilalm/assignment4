package com.example.CIS3368Assignment4.Models;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {
    Object findByFname(String fname);
}
