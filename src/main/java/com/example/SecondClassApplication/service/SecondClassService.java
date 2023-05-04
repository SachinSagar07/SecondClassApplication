package com.example.SecondClassApplication.service;

import com.example.SecondClassApplication.entity.SecondClass;
import com.example.SecondClassApplication.repository.SecondClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class SecondClassService implements ISecondClassService{

    @Autowired(required = true)
    private SecondClassRepository secondClassRepository;

    @Override
    public SecondClass saveName(SecondClass secondClass) {
        return secondClassRepository.save(secondClass);
    }

    @Override
    public List<SecondClass> getAll() {
        return secondClassRepository.findAll();
    }

    @Override
    public SecondClass getById(Integer id) {
        return secondClassRepository.findById(id).get();
    }

    @Override
    public SecondClass updateById(Integer id, SecondClass secondClass) {
        SecondClass sc = secondClassRepository.findById(id).get();

        if (Objects.nonNull(secondClass.getPname()) && !"".equalsIgnoreCase(secondClass.getPname())) {
            sc.setPname(secondClass.getPname());
        }

        if (Objects.nonNull(secondClass.getPaddress()) && !"".equalsIgnoreCase(secondClass.getPaddress())) {
            sc.setPaddress(secondClass.getPaddress());
        }

        if (Objects.nonNull(secondClass.getPaadharNumber())) {
            sc.setPaadharNumber(secondClass.getPaadharNumber());
        }

        if (Objects.nonNull(secondClass.getSeatNo())) {
            sc.setSeatNo(secondClass.getSeatNo());
        }

        return secondClassRepository.save(sc);
    }

    @Override
    public void deleteById(Integer id) {
        secondClassRepository.deleteById(id);
    }
}
