package my.naruter.outsourcing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.naruter.outsourcing.dao.SignDAO;
import my.naruter.outsourcing.service.SignService;
import my.naruter.outsourcing.vo.MemberInfo;

@Service
public class SignServiceImpl implements SignService {

	@Autowired
	private SignDAO sdao;

	@Override
	public Integer loginGet(MemberInfo memInfo) {
		int cnt = -1;
		if (memInfo != null && memInfo.getMemberid() != null && memInfo.getMemberpwd() != null) {
			cnt = sdao.loginSelect(memInfo);
		}
		return cnt;
	}

}
