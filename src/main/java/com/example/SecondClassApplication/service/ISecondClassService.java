package com.example.SecondClassApplication.service;

import com.example.SecondClassApplication.entity.SecondClass;

import java.util.List;

public interface ISecondClassService {
   public SecondClass saveName(SecondClass secondClass);

   List<SecondClass> getAll();

   SecondClass getById(Integer id);

   SecondClass updateById(Integer id, SecondClass secondClass);

   void deleteById(Integer id);
}
