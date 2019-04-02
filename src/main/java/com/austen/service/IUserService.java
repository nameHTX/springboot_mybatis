package com.austen.service;

import com.austen.entity.SysUser;

/**
 * @author Austen
 */
public interface IUserService {

    SysUser getUserByName(String userName);
}
