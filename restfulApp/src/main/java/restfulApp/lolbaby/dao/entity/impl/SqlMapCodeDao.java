package restfulApp.lolbaby.dao.entity.impl;

import org.springframework.stereotype.Repository;

import restfulApp.common.SqlAbstractDao;
import restfulApp.lolbaby.dao.dto.CommonCodeDTO;
import restfulApp.lolbaby.dao.entity.CodeDao;

@Repository
public class SqlMapCodeDao  extends SqlAbstractDao  implements CodeDao {
//public class SqlMapCodeDao implements CodeDao {
	
//	@Autowired
//	private SqlSession sqlSession;
	
	@Override
	public CommonCodeDTO getCodeName(String codeId) {
		// TODO Auto-generated method stub
		return (CommonCodeDTO) selectOne("commonSelectCode",codeId);
	}


}
