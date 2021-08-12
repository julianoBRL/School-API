package com.shintaro.SchoolAPI.entitys.user;

import java.util.Collection;
import java.util.UUID;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;

public class UserAuth extends User{
	
	@Getter
	private UUID uniqueID;

	private static final long serialVersionUID = -5522656773343508094L;
	
	public UserAuth(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities,UUID uniqueID) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		this.uniqueID = uniqueID;
	}
	
	public UserAuth(String username, String password, Collection<? extends GrantedAuthority> authorities, UUID uniqueID) {
		super(username, password, authorities);
		this.uniqueID = uniqueID;
	}


}
