package com.spring.feign.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.feign.model.UserResponse;

@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "USER-CLIENT")
public interface UserClient {
	
	@GetMapping("/users")
	public List<UserResponse> getUsers();

}
