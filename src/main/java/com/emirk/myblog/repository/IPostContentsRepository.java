package com.emirk.myblog.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.emirk.myblog.model.PostContents;

public interface IPostContentsRepository extends JpaRepository<PostContents, Long> {

}
