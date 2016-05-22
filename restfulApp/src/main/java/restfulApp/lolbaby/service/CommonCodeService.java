package restfulApp.lolbaby.service;

import restfulApp.lolbaby.dao.dto.CommonCodeDTO;

public interface CommonCodeService {
	
	/**
	 * 공통코드
	 * @param CodeType
	 * @return
	 */
	public CommonCodeDTO getCodeName(int codeId)  ;

}
