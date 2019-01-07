package org.finalled.com.repository;

import org.finalled.com.entity.Test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;



public interface TestRepository extends JpaRepository<Test, Long>
{

}
