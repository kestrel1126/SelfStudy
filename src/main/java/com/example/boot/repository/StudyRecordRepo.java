package com.example.boot.repository;

import com.example.boot.entity.Study_record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRecordRepo extends JpaRepository<Study_record,Integer> {
 //어떤 테이블 Study_record, key값 (key_id) 타입 Integer
}
