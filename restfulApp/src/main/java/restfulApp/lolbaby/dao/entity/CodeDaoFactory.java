package restfulApp.lolbaby.dao.entity;

import restfulApp.lolbaby.dao.entity.impl.SqlMapCodeDao;

public class CodeDaoFactory {
	
	private static final CodeDaoFactory CODE_DAO_FACTORY = new CodeDaoFactory();
	
	private final CodeDao codeDao = new SqlMapCodeDao();
	
	
	public static CodeDao getCodeDao() {
		return CODE_DAO_FACTORY.codeDao;
	}

}
