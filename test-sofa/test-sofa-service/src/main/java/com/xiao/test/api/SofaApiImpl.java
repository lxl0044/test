package com.xiao.test.api;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author xiao
 */
@Slf4j
@RestController
@RequestMapping("/sofa")
@SofaService(bindings = {@SofaServiceBinding(bindingType = "bolt", timeout = 20000)})
public class SofaApiImpl implements SofaApi {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @Override
    public String test(@RequestParam("param") String param) {
        return param;
    }
}