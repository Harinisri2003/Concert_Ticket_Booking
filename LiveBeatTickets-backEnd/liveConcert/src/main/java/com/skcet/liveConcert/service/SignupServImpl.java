package com.skcet.liveConcert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.liveConcert.model.Singup;
import com.skcet.liveConcert.repository.SignUpRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SignupServImpl implements SignupService{
 
	@Autowired
	private SignUpRepo signUpRepo;

	@Override
	public boolean addValues(Singup signup) {
		boolean eventIdExists= signUpRepo.existsByEmail(signup.getEmail());
		if(!eventIdExists)
		{
			signUpRepo.save(signup);
			return true;
		}
		else
		return false;
	}
	
	

}
