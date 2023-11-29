package com.ymsaadi.contentcalendar.repository;

import com.ymsaadi.contentcalendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
    List<Content> findAllByTitleContains(String keyword);
}
