package vt.restclientproject.services;

import java.util.List;

import vt.api.domain.User;

public interface ApiService {

	public List<User> getUsers(Integer limit);
}
