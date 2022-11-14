package com.example.boot.service;

import com.example.boot.entity.Study_record;
import com.example.boot.repository.StudyRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudyRecordService {

    @Autowired
    StudyRecordRepo studyRecordRepo;


    //    전체 Row select
    public List<Study_record> doSelectAll(){
        return studyRecordRepo.findAll();
    }

}
