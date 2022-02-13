package com.emirk.myblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emirk.myblog.model.PostContents;
import com.emirk.myblog.service.IPostContentsService;


@RestController
@RequestMapping("api/postcontents")//pre-path
public class PostContentsController {
	
	@Autowired
    private IPostContentsService postContentsService;

    @PostMapping
    public ResponseEntity<?> savePerson(@RequestBody PostContents postcontents)
    {
        return new ResponseEntity<>(postContentsService.savePostContents(postcontents), HttpStatus.CREATED);
    }

    @DeleteMapping("{postContentsId}") 
    public ResponseEntity<?> deletePerson(@PathVariable Long postContentsId)
    {
    	postContentsService.deletePostContents(postContentsId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllPostContents()
    {
        return new ResponseEntity<>(postContentsService.findAllPostContents(), HttpStatus.OK);
    }
	    
}
