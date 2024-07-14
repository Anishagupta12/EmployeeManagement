package in.oak.dao;

import in.oak.entity.User;

public interface UserDao {

	public int saveUser(User user);

	public User loginUser(String email, String passsword);

}
