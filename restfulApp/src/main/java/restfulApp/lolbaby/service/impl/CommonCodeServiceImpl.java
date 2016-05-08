package restfulApp.lolbaby.service.impl;

import restfulApp.lolbaby.dao.dto.CommonCodeDTO;
import restfulApp.lolbaby.dao.entity.CodeDao;
import restfulApp.lolbaby.service.CommonCodeService;

public class CommonCodeServiceImpl implements CommonCodeService {

	private CodeDao codeDao;
	@Override
	public CommonCodeDTO getCodeName(String CodeType) { 
		return codeDao.getCodeName(CodeType);
	}

}
