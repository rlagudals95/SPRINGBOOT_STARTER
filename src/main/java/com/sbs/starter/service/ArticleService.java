package com.sbs.starter.service;

import java.util.List;
import java.util.Map;

import com.sbs.starter.dto.Article;

public interface ArticleService {
	public List<Article> getList();
	

	public void add(Map<String, Object> param); //여기 이렇게 써주니까 controller에 add부분 에러가 사라짐..흠..
	
}
