package ch.zuehlke.jhipsterstarter.repository;

import ch.zuehlke.jhipsterstarter.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
