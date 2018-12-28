package com.example.demo.dao;

import com.example.demo.entity.Links;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LinksMapper {
    List<Links> selectAll();
    List<Links> selectByLikeName(String name);
}
