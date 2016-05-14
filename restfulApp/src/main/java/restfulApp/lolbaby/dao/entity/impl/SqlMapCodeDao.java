package restfulApp.lolbaby.dao.entity.impl;

import java.util.HashMap;

import restfulApp.common.SqlAbstractDao;
import restfulApp.lolbaby.dao.dto.CommonCodeDTO;
import restfulApp.lolbaby.dao.entity.CodeDao;

public class SqlMapCodeDao  extends SqlAbstractDao  implements CodeDao {

	@Override
	public CommonCodeDTO getCodeName(String codeId) {
		// TODO Auto-generated method stub
		HashMap<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("codeId", codeId);
		return (CommonCodeDTO) selectOne("commonSelectCode",paramMap);
	}

}
