package com.skcet.liveConcert.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.skcet.liveConcert.model.Audience;


public interface ConcertService {
      public boolean addValue(Audience audience);
      public List<Audience> getValue();
      public boolean updateConcert(String email,Audience audience);
      public boolean deleteConcert(Long id);
      public Page<Audience> getPagesWithSort(PageRequest pageRequest);
      public List<Audience> getAllQuery();
//      public Audience getQueryByEmail(String email);
      public void updateNameQuery(String name,Long id);
	  public int deleteQuery(Long id);
	  public List<Audience> get(String email,String name);
}
