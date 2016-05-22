package restfulApp.lolbaby.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import restfulApp.lolbaby.dao.dto.CommonCodeDTO;
import restfulApp.lolbaby.service.CommonCodeService;

@Controller
@RequestMapping("/common")
public class CommonCodeController {
	
	final static Logger logger = LoggerFactory.getLogger(CommonCodeController.class);

	 @Autowired
	 CommonCodeService  commonCodeService;	
	
	 @RequestMapping(value="/{id}", method=RequestMethod.GET)
     @ResponseBody
     public CommonCodeDTO getCodeName(@PathVariable("id") int codeId) {
        logger.debug("###get!!");
        logger.debug("###get!! :" + codeId);
        //CommonCodeService  commonCodeService =  CommonCodeServiceFactory.getCommonCodeService();
        return commonCodeService.getCodeName(codeId);

     }


}
