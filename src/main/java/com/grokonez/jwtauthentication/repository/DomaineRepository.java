package com.grokonez.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grokonez.jwtauthentication.model.Domaine;

public interface DomaineRepository extends JpaRepository <Domaine, Integer> {

}
