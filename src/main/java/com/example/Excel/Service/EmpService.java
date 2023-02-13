package com.example.Excel.Service;

import com.example.Excel.Model.EmpDetails;
import com.example.Excel.Repository.EmpRepository;
import com.example.Excel.Use.CreateAndSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpRepository empRepository;

    public  ByteArrayInputStream load() {
        List<EmpDetails> emp = (List<EmpDetails>) empRepository.findAll();

        ByteArrayInputStream in = CreateAndSheet.empToExcel(emp);
        return in; 
    }




}
