package com.skcet.liveConcert.service;


import java.util.List;

import com.skcet.liveConcert.model.Audience;
import com.skcet.liveConcert.model.Event;

public interface EventService {
	public boolean updateEvent(Long eventId,Event event);
	public boolean addValue(Event event);
	 public List<Event> getValue();
	 public Event getQueryByEventId(int eventId);
	 public int deleteQuery(int eventId);
}
