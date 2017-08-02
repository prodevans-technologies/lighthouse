package com.prodevans.lighthouse.dao;


import java.util.ArrayList;
import java.util.List;

import com.prodevans.lighthouse.pojo.UserDetails;

public interface UserDAO {
	List<UserDetails> getUsers();
}
