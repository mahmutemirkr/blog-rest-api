package com.emirk.myblog.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.emirk.myblog.model.PostContents;
import com.emirk.myblog.repository.IPostContentsRepository;

import lombok.Data;


@Data
@Service
public class PostContentsService implements IPostContentsService {
	
	
	private final IPostContentsRepository postContentsRepository;
	
	public PostContentsService(IPostContentsRepository postContentsRepository) {
		
		this.postContentsRepository = postContentsRepository;
		
	}
	
	@Override
	public PostContents savePostContents(PostContents postContents) {
		
		postContents.setCreationDate(LocalDateTime.now());
		return postContentsRepository.save(postContents);
		
	}
	
	@Override
	public void deletePostContents(Long id) {
		
		postContentsRepository.deleteById(id);
		
	}
	
	@Override
	public List<PostContents> findAllPostContents(){
		
		return postContentsRepository.findAll();
	}
	
}
