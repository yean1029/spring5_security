package edu.bit.ex.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.EmpMapper;
import edu.bit.ex.mapper.MemberMapper;
import edu.bit.ex.vo.EmpUser;
import edu.bit.ex.vo.EmpVO;
import edu.bit.ex.vo.MemberUser;
import edu.bit.ex.vo.MemberVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class EmpDetailsService implements UserDetailsService  {
   
   @Setter(onMethod_ = @Autowired)
   private EmpMapper empMapper;
   
   @Override
   public UserDetails loadUserByUsername(String ename) throws UsernameNotFoundException {
      
      log.warn("Load User By EmpVO number: " + ename);      
      EmpVO vo = empMapper.getEmp(ename);   
      
      log.warn("queried by EmpVO mapper: " + vo);
      
      return vo == null ? null : new EmpUser(vo);
   }
}