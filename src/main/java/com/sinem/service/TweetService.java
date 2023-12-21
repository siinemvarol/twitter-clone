package com.sinem.service;

import com.sinem.repository.ITweetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TweetService {
    private final ITweetRepository tweetRepository;
}
