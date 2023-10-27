package gestion.psp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gestion.psp.entity.psp;

public interface IpspRepository extends JpaRepository<psp, Long> {

}
