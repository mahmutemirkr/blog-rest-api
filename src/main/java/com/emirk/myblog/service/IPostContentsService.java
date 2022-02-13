package com.emirk.myblog.service;

import java.util.List;

import com.emirk.myblog.model.PostContents;

public interface IPostContentsService {

	PostContents savePostContents(PostContents postContents);

	void deletePostContents(Long id);

	List<PostContents> findAllPostContents();

}
