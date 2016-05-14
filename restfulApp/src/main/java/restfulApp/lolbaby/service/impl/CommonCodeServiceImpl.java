package restfulApp.lolbaby.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import restfulApp.lolbaby.controller.CommonCodeController;
import restfulApp.lolbaby.dao.dto.CommonCodeDTO;
import restfulApp.lolbaby.dao.entity.CodeDao;
import restfulApp.lolbaby.dao.entity.CodeDaoFactory;
import restfulApp.lolbaby.service.CommonCodeService;

public class CommonCodeServiceImpl implements CommonCodeService {

	final static Logger logger = LoggerFactory.getLogger(CommonCodeServiceImpl.class);
	
	@Override
	public CommonCodeDTO getCodeName(String codeId) { 	
		CodeDao   codeDao = CodeDaoFactory.getCodeDao();
		logger.debug("codeId" + codeId);
		return codeDao.getCodeName(codeId);
	}

}
