package com.ltts.screen.repository;
import org.springframework.data.repository.CrudRepository;

import com.ltts.screen.model.Screen;  

//repository that extends CrudRepository  
public interface ScreenRepository extends CrudRepository<Screen, Integer>
{

}

