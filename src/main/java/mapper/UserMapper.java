package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.taskHub.model.User;

public class UserMapper implements RowMapper<User> {


	@Override
	public com.example.taskHub.model.User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		 User user = new User();
	        user.setCustID(rs.getInt("id"));
	        user.setCustName(rs.getString("cust_name"));
	        user.setCustEmail(rs.getString("cust_email"));
//	        user.setCustPassword(rs.getString("cust_password"));
	        return user;
//		return null;
	}
}