package com.spring.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



@Repository
public class IncrementDaoImpl implements IncrementDao {

	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int updateNumber() {


         int number = 0;
		String sql= "update Number set number=number+1" ;

		synchronized(this){
		      getTemplate().update(sql);

			sql= "SELECT * FROM Number";

			number =  getTemplate().query(sql, new RowMapper<Integer>() {
				public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
					Integer number = rs.getInt("number");

					return number;
				}
			}).get(0);
		}

		return number;

	}


}