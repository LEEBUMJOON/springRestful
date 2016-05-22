package restfulApp.lolbaby.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restfulApp.lolbaby.dao.dto.CommonCodeDTO;
import restfulApp.lolbaby.dao.entity.CodeDao;
import restfulApp.lolbaby.service.CommonCodeService;

@Service
public class CommonCodeServiceImpl implements CommonCodeService {

	final static Logger logger = LoggerFactory.getLogger(CommonCodeServiceImpl.class);
	
	@Autowired
	CodeDao   codeDao ;
	@Override
	public CommonCodeDTO getCodeName(int codeId)  { 	
		//CodeDao   codeDao = CodeDaoFactory.getCodeDao();
		logger.debug("codeId  " + codeId);
		return codeDao.getCodeName(codeId);
	}

}
