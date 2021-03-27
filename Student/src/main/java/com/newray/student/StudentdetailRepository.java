package com.newray.student;



import java.util.concurrent.Future;

import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.newray.student.entity.Studentdetail;

@Repository

public interface StudentdetailRepository  extends CrudRepository<Studentdetail, Integer>{
	
//@Async
//Future<Studentdetail> findBysid(Integer sid);

}
