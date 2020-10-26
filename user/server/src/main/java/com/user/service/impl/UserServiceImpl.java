package com.user.service.impl;

import com.user.dataobject.UserInfo;
import com.user.repository.UserInfoRepostory;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoRepostory repostory;
	
	@Override
	public UserInfo findByOpenid(String openid) {
		return repostory.findByOpenid(openid);
	}
}
