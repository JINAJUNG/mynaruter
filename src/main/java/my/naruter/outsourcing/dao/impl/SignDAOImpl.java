package my.naruter.outsourcing.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.naruter.outsourcing.dao.SignDAO;
import my.naruter.outsourcing.vo.MemberInfo;

@Repository
public class SignDAOImpl implements SignDAO{
	@Autowired
	private SqlSession ss;

	@Override
	public Integer loginSelect(MemberInfo memInfo) {
		return ss.selectOne("SQL.MEMBERINFO.login",memInfo);
	}

}
