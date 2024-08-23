package com.project.cms.repository;

import com.project.cms.entities.Artigo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ArtigoRepository extends JpaRepository<Artigo, UUID> {
}
