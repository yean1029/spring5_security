package edu.bit.ex.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpVO {
   String empno;    //NOT NULL NUMBER(4)    
   String ename; //             VARCHAR2(10) 
   String job;//               VARCHAR2(9)  
   int mgr;//               NUMBER(4)    
   Timestamp hiredate;//          DATE         
   int sal;//               NUMBER(7,2)  
   int comm;//              NUMBER(7,2)  
   int deptno;//            NUMBER(2)   
   String authority;
}