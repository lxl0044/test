package com.xiao.test.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.xiao.test.api.SofaApi;
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
@RequestMapping("/client")
public class SofaClientController {

    @SofaReference(binding = @SofaReferenceBinding(bindingType = "bolt", timeout = 20000))
    private SofaApi sofaApi;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam("param") String param) {
        return sofaApi.test(param);
    }
}