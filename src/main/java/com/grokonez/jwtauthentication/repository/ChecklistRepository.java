package com.grokonez.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grokonez.jwtauthentication.model.Checklist;

public interface ChecklistRepository extends JpaRepository<Checklist, Long> {

}
