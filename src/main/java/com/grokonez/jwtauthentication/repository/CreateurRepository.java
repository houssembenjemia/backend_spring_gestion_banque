package com.grokonez.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grokonez.jwtauthentication.model.Createur;

public interface CreateurRepository extends JpaRepository<Createur, Integer> {

}
