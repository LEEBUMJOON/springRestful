package restfulApp.lolbaby.dao.entity.impl;

import java.util.HashMap;

import restfulApp.common.SqlAbstractDao;
import restfulApp.lolbaby.dao.dto.CommonCodeDTO;
import restfulApp.lolbaby.dao.entity.CodeDao;

public class SqlMapCodeDao extends SqlAbstractDao implements CodeDao {

	@Override
	public CommonCodeDTO getCodeName(String CodeType) {
		// TODO Auto-generated method stub
		HashMap<String,Object> paramMap = new HashMap<String,Object>();
		
		return (CommonCodeDTO) selectOne("",paramMap);
	}

}
