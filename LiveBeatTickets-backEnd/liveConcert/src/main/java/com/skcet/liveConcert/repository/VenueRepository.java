package com.skcet.liveConcert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.liveConcert.model.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long>{

}
