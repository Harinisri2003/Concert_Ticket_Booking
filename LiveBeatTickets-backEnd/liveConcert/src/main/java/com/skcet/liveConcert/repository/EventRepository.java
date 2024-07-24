package com.skcet.liveConcert.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.skcet.liveConcert.model.Audience;
import com.skcet.liveConcert.model.Event;

import jakarta.transaction.Transactional;



public interface EventRepository extends JpaRepository<Event,Integer>{
	Optional<Event> findByEventId(Long eventId);
	 boolean existsById(int eventId);
	 @Query(value="select * from _event where event_id=?1",nativeQuery = true)
     Event findByEventId(int eventId);
	 
	 @Modifying
		@Transactional
		@Query(value = "delete from _event where event_id = ?1", nativeQuery = true)
		int deleteByEventId(int eventId);
}
