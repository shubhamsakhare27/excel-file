package com.example.Excel.Model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Data
@Entity
public class EmpDetails {


    @Id
    private Integer empId;
    private String name;
    private String lastName;
    private String comName;
	

    
    


}
