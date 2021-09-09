package se331.lab.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab.rest.entity.Organizer;

import java.awt.print.Pageable;

public interface OrganizerRepository extends JpaRepository<Organizer,Long> {

}
