package com.sinem.repository;

import com.sinem.repository.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITweetRepository extends JpaRepository<Tweet, Long> {

}
