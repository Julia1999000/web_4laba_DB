package com.web.repository;

import com.web.entity.News;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NewsRepositoryTest extends BaseTest {

    @Autowired
    private NewsRepository newsRepository;

    @Test
    void testAddAndReadNewsFromDB() {
        newsRepository.deleteAll();

        News news = News.builder()
                .description("description")
                .lessDescription("less description")
                .title("title")
                .build();

        newsRepository.save(news);

        List<News> res = newsRepository.findAll();
        assertEquals("description", res.get(0).getDescription());
    }

}