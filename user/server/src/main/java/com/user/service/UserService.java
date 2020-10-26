package com.user.service;

import com.user.dataobject.UserInfo;


public interface UserService {

	UserInfo findByOpenid(String openid);
}
