package io.javabrains.springbootstarter.topic;

import io.javabrains.springbootstarter.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class TopicService implements GenericService<Topic> {

    @Autowired
    private TopicRepository topicRepository;

    @Override
    public List<Topic> getAll() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    @Override
    public Topic get(String id) {
        return topicRepository.findById(id).get();


    }

    @Override
    public void add(Topic item) {
        topicRepository.save(item);
    }

    @Override
    public void update(Topic item, String id) {
        topicRepository.save(item);
    }

    @Override
    public void delete(String id) {
        topicRepository.deleteById(id);
    }
}
