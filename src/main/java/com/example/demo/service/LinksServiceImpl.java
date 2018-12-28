package com.example.demo.service;

import com.example.demo.dao.LinksMapper;
import com.example.demo.entity.Links;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LinksServiceImpl implements LinksService {

    @Resource
    private LinksMapper LinksDao;

    @Override
    public List<Links> getAllLinks(){
        List<Links> linksList = LinksDao.selectAll();
        return linksList;
    }

    @Override
    public List<Links> getLinksLikeName(String name){
        List<Links> linksList = LinksDao.selectByLikeName(name);
        return linksList;
    }
}

