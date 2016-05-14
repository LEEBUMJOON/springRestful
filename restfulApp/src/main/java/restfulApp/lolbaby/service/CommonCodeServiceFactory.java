package restfulApp.lolbaby.service;

import restfulApp.lolbaby.service.impl.CommonCodeServiceImpl;

public class CommonCodeServiceFactory {
	
private static final CommonCodeServiceFactory CODE_DAO_FACTORY = new CommonCodeServiceFactory();
	
	private final CommonCodeService commonCodeService = new CommonCodeServiceImpl();
	
	
	public static CommonCodeService getCommonCodeService() {
		return CODE_DAO_FACTORY.commonCodeService;
	}
}

