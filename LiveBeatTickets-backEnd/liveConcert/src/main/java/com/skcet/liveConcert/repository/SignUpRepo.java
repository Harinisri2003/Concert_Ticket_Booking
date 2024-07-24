package com.skcet.liveConcert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.liveConcert.model.Singup;

public interface SignUpRepo extends JpaRepository<Singup, Integer>{
    boolean existsByEmail(String email);
}
