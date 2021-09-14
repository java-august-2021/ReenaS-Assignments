package com.reena.dojoOverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reena.dojoOverflow.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long>{

}
