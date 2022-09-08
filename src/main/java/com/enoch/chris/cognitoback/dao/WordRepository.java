package com.enoch.chris.cognitoback.dao;

import java.util.List;
import java.util.Set;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import com.enoch.chris.cognitoback.entity.Word;

@RepositoryRestResource
public interface WordRepository extends JpaRepository<Word, Integer> {

	//is it necessary to define this?
    Page<Word> findById(@RequestParam("id") Integer id, Pageable pageable);
    
    Page<Word> findByEnglish(@RequestParam("english") String english, Pageable pageable);
    
    Page<Word> findBySpanish(@RequestParam("spanish") String spanish, Pageable pageable);
    
}