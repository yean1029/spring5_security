package edu.bit.ex.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class EmpUser extends User {
	private EmpVO emp;

	// �⺻������ �θ��� �����ڸ� ȣ���ؾ߸� ���������� �۵�
	public EmpUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

	public EmpUser(EmpVO empVO) {
		super(empVO.getEname(), empVO.getEmpno(), getAuthority(empVO));
		this.emp = empVO;
	}

	// ������ ���� �ִ� ���� ���
	public static Collection<? extends GrantedAuthority> getAuthority(EmpVO empVO) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(empVO.getAuthority()));

		return authorities;
	}
}
