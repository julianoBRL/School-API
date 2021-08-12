package com.shintaro.SchoolAPI.entitys.user;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.shintaro.SchoolAPI.generic.Service;

@org.springframework.stereotype.Service
public class UserService extends Service<UserEntity, UserRepository> implements UserDetailsService {
	
	@Autowired
	private UserRepository repository;

	protected UserService(UserRepository repository) {
		super(repository);
		this.repository = repository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Optional<UserEntity> usuarioOptional = repository.findByUsername(email);
		UserEntity usuario = usuarioOptional.orElseThrow(() -> new UsernameNotFoundException("Usuário e/ou senha incorretos"));
		System.out.println(usuario.getType().toString().toUpperCase());
		
		if(!usuario.isActive()) {
			throw new UsernameNotFoundException("Usuário e/ou senha incorretos");
		}
			
		return new UserAuth(email, usuario.getPassword(), getPermissoes(usuario),usuario.getId());
	}

	private Collection<? extends GrantedAuthority> getPermissoes(UserEntity usuario) {
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		authorities.add(new SimpleGrantedAuthority(usuario.getType().toString().toUpperCase()));
		return authorities;
	}

}
