package com.ss2m.dao;

import java.util.List;

import com.ss2m.bean.UserVo;

public interface UserDao {

	public List<UserVo> select();
	public void insert(UserVo Vo);
	public void update(UserVo vo);
	public void delete(UserVo vo);
}
