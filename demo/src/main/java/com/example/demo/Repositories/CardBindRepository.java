package com.example.demo.Repositories;

import com.example.demo.Models.CardBinModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardBindRepository extends CrudRepository<CardBinModel,Long> {


}