package com.skcet.liveConcert.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.liveConcert.model.Audience;
import com.skcet.liveConcert.model.Event;
import com.skcet.liveConcert.repository.EventRepository;

import jakarta.transaction.Transactional;



@Service
@Transactional
public class EventServiceImpl implements EventService{

	@Autowired
	private EventRepository eventRepository;
	@Override
	public boolean updateEvent(Long eventId, Event event) {
		Optional<Event> existingUserOptional=eventRepository.findByEventId(eventId);
		System.out.println(event.getEventName());
		if(existingUserOptional.isPresent())
		{
		Event concertExists=existingUserOptional.get();
		concertExists.setDescription(event.getDescription());
		concertExists.setEventDate(event.getEventDate());
		concertExists.setEventName(event.getEventName());
		concertExists.setTicketPrice(event.getTicketPrice());
		concertExists.setTicketQuantity(event.getTicketQuantity());
		eventRepository.save(concertExists);
		return true;
		} else
		{
			return false;
		}
	}
	@Override
	public boolean addValue(Event event) {
		boolean eventIdExists= eventRepository.existsById(event.getEventId());
		if(!eventIdExists)
		{
			eventRepository.save(event);
			return true;
		}
		else
		return false;
	}
	@Override
	public List<Event> getValue() {
	
			return eventRepository.findAll();
		
	}
	@Override
	public Event getQueryByEventId(int eventId) {
		// TODO Auto-generated method stub
		return eventRepository.findByEventId(eventId);
	}
	@Override
	public int deleteQuery(int eventId) {
		// TODO Auto-generated method stub
		return eventRepository.deleteByEventId(eventId);
	}
	

}
