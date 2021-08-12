package com.shintaro.SchoolAPI.utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.shintaro.SchoolAPI.entitys.user.UserAuth;

public abstract class ClassUtils {
	
	public static boolean hasRole (String roleName)
	{
	    return SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
	            .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals(roleName));
	}
	
	public static String getCourentUserID () {
		Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
		UserAuth customUser = (UserAuth)loggedInUser.getPrincipal();
    	return customUser.getUniqueID().toString();
	}

}
