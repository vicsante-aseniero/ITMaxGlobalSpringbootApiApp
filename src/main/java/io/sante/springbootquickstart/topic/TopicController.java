package io.sante.springbootquickstart.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService _topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {		
		return _topicService.getAllTopics();
	}
	
	@GetMapping(value = "/v1/topics")
	public List<Topic> getTopicsAll() {		
		return _topicService.getAllTopics();
	}
	
	@RequestMapping("/topics{id}")
	public Topic getTopic(@PathVariable String id) {		
		return _topicService.getTopic(id);
	}
	
	@GetMapping("/v1/topics/{id}")
	public Topic getTopicById(@PathVariable String id) {
		return _topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		_topicService.addTopic(topic);
	}
	
	@PostMapping(value = "/v1/topics")
	public void putTopic(@RequestBody Topic topic) {
		_topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		_topicService.updateTopic(id, topic);
	}
	
	@PutMapping(value = "/v1/topics/{id}")
	public void updateTopicById(@RequestBody Topic topic, @PathVariable String id) {
		_topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {		
		_topicService.deleteTopic(id);
	}
	
	@DeleteMapping(value = "/v1/topics/{id}")
	public void removeTopic(@PathVariable String id) {		
		_topicService.deleteTopic(id);
	}
}
