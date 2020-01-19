package Concurrency.contextService;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.concurrent.ContextService;

@Stateless
@LocalBean
public class SimpleEJB {

    private static final Logger log = LoggerFactory.getLogger(SimpleEJB.class);

    @Resource
    private ContextService contextService;

    public void testMethod() {

        SimpleInterface simpleInterface = new SimpleInterfaceImpl();
        final SimpleInterface contextualProxy = contextService.createContextualProxy(simpleInterface, SimpleInterface.class);

        log.debug("contextualProxy class: {}", contextualProxy.getClass().getCanonicalName());

    }

}
