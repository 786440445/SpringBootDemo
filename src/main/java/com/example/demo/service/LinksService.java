package com.example.demo.service;

import com.example.demo.entity.Links;

import java.util.List;

public interface LinksService {
    List<Links> getAllLinks();
    List<Links> getLinksLikeName(String likename);
}
