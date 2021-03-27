package com.ltts.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.ltts.screen.model.Screen;
import com.ltts.screen.repository.ScreenRepository;  
@Service  
public class ScreenService {

	
	@Autowired  
	ScreenRepository screenRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Screen> getAllScreens()   
	{  
	List<Screen> screen = new ArrayList<Screen>();  
	screenRepository.findAll().forEach(screen1 -> screen.add(screen1));  
	return screen;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Screen getScreensById(int id)   
	{  
	return screenRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Screen screen)   
	{  
		screenRepository.save(screen);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		screenRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Screen screen, int screen_id)   
	{  
		screenRepository.save(screen);  
	}
	} 



