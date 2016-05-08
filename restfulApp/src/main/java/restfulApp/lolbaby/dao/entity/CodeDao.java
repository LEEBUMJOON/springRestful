package restfulApp.lolbaby.dao.entity;

import restfulApp.lolbaby.dao.dto.CommonCodeDTO;

public interface CodeDao {

	public CommonCodeDTO getCodeName(String CodeType);
}
