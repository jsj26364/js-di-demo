/**
 * 
 */
package software.jsj;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author jsjackson
 *
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
  
  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    if (bean instanceof LifeCycleDemoBean) {
      ((LifeCycleDemoBean)bean).beforeInit();
    }
    
    return bean;
  }
  
  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    if (bean instanceof LifeCycleDemoBean) {
      ((LifeCycleDemoBean)bean).afterInit();
    }
    return bean;
  }

}
