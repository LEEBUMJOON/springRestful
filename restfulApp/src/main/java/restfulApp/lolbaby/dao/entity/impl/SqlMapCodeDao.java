package restfulApp.lolbaby.dao.entity.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import restfulApp.lolbaby.dao.dto.CommonCodeDTO;
import restfulApp.lolbaby.dao.entity.CodeDao;

@Repository
//public class SqlMapCodeDao  extends SqlAbstractDao  implements CodeDao {
public class SqlMapCodeDao implements CodeDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public CommonCodeDTO getCodeName(String codeId) {
		// TODO Auto-generated method stub
		return (CommonCodeDTO) sqlSession.selectOne("commonSelectCode",codeId);
	}


}
