package com.ltts.screen.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.ltts.screen.model.Screen;
import com.ltts.service.ScreenService;  

//mark class as Controller  
@RestController  
public class ScreenController   
{  
//autowire the BooksService class  
@Autowired  
ScreenService screenService;  
//creating a get mapping that retrieves all the books detail from the database   
@GetMapping("/screens")  
private List<Screen> getAllScreens()   
{  
return screenService.getAllScreens() ;  
}  
//creating a get mapping that retrieves the detail of a specific book  
@GetMapping("/screens/{screen_id}")  
private Screen getScreens(@PathVariable("screen_id") int screen_id)   
{  
return screenService.getScreensById(screen_id);  
}  
//creating a delete mapping that deletes a specified book  
@DeleteMapping("/screens/{screen_id}")  
private void deleteScreen(@PathVariable int screen_id)   
{  
screenService.delete(screen_id);  
}  
//creating post mapping that post the book detail in the database  
@PostMapping("/screens")  
private int saveScreen(@RequestBody Screen screens)   
{  
screenService.saveOrUpdate(screens);  
return screens.getScreenId();  
}  
//creating put mapping that updates the book detail   
@PutMapping("/screens")  
private Screen update(@RequestBody Screen screens)   
{  
screenService.saveOrUpdate(screens);  
return screens;  
}  
}  
