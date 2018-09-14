package com.br.starfilms.model.repository;

import com.br.starfilms.model.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JAICKE
 */
@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
