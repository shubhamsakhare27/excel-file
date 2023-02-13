package com.example.Excel.Repository;

import com.example.Excel.Model.EmpDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<EmpDetails,Integer> {


}
