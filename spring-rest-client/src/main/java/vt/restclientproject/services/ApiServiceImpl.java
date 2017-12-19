package vt.restclientproject.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import vt.api.domain.User;
import vt.api.domain.UserData;

@Service
public class ApiServiceImpl implements ApiService {

	RestTemplate restTemplate;
	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	 
	@Override
	public List<User> getUsers(Integer limit) {
		UserData data = restTemplate.getForObject("http://apifaketory.com/api/user?limit="+limit, UserData.class);
		return data.getData();
	}

}
