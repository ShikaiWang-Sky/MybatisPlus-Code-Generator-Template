package com.wang.register.serviceImpl;

import com.wang.register.pojo.User;
import com.wang.register.dao.UserMapper;
import com.wang.register.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 王诗凯
 * @since 2020-10-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
