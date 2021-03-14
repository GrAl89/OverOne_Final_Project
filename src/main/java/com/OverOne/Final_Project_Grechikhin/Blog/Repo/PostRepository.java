package com.OverOne.Final_Project_Grechikhin.Blog.Repo;

import com.OverOne.Final_Project_Grechikhin.Blog.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
