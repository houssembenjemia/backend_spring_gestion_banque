package com.grokonez.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grokonez.jwtauthentication.model.Document;

public interface DocumentRepository  extends JpaRepository<Document, Integer> {

}
