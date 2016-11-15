package com.yixiang.np.service.impl;

import com.github.pagehelper.PageHelper;
import com.yixiang.np.mapper.inter.UserInfoMapper;
import com.yixiang.np.model.UserInfo;
import com.yixiang.np.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/11/11.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getAll(UserInfo UserInfo) {
        if (UserInfo.getPage() != null && UserInfo.getRows() != null) {
            PageHelper.startPage(UserInfo.getPage(), UserInfo.getRows(), "id");
        }
        return userInfoMapper.selectAll();
    }

    @Override
    public UserInfo getById(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(Integer id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void save(UserInfo country) {
        if (country.getId() != null) {
            userInfoMapper.updateByPrimaryKey(country);
        } else {
            userInfoMapper.insert(country);
        }
    }
}
