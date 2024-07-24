package com.skcet.liveConcert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.liveConcert.model.Audience;
import com.skcet.liveConcert.model.Event;
import com.skcet.liveConcert.service.EventService;

@RestController
@CrossOrigin("*") 
@RequestMapping("api/v1/event")
public class EventController {
	
	@Autowired
    private EventService eventService;
	
	@PostMapping("/add")
    public ResponseEntity<String> addValue(@RequestBody Event event)
    {
 	   boolean dataSaved = eventService.addValue(event);
 	   if(dataSaved) {
			return ResponseEntity.status(200).body("Value added successfully!");
		}else {
			return ResponseEntity.status(404).body("Something went wrong!");
		}
    }
	
	 @GetMapping("/get")
	   	public ResponseEntity<List<Event>> getUser(){
//	    	   System.out.println("sop");
	   		return ResponseEntity.status(200).body(eventService.getValue());
	   	}
	 
	 @GetMapping("/getQ/{eventId}")
	 public ResponseEntity<Event> getQuery(@PathVariable int eventId)
	 {
		 return ResponseEntity.status(200).body(eventService.getQueryByEventId(eventId));
	 }
	
	@PutMapping("/putEvent/{eventId}")
  	public ResponseEntity<String> updateUser(@PathVariable Long eventId,@RequestBody Event event)
  	{
  		boolean EventData=eventService.updateEvent(eventId, event);
  		if(EventData)
  		{
  			return ResponseEntity.status(200).body("updated successfully");
  		}
  		else
  		{
  			return ResponseEntity.status(404).body("not updated successfully");
  		}
//  		return null;
  	}
	
	@DeleteMapping("/deleteQuery/{eventId}")
	    public ResponseEntity<String> deleteQuery(@PathVariable int eventId) {
		int flag = eventService.deleteQuery(eventId);
		if(flag == 1)
			return ResponseEntity.status(200).body("Record deleted successfully!");
		else
			return ResponseEntity.status(200).body("Something went wrong!");
	   }

}
