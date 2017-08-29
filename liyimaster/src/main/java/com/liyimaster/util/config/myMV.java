package com.liyimaster.util.config;

import java.util.LinkedHashMap;
import java.util.Locale;

import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;

/**
 * http://blog.csdn.net/prince2270/article/details/5891085
 * 
 * @author hand
 * @Data By 2017年8月28日 下午2:58:01
 */
public class myMV extends LinkedHashMap<String, Object> implements ViewResolver {

	/**
	 * @Data By 2017年8月28日 下午3:00:28
	 */
	private static final long serialVersionUID = 3686100142647598617L;

	/**
	 * modelandview.addObject() 实现LinkedHashMap类 引用put方法 相当于
	 * request.setAttribute方法
	 * 
	 * @param attributeName
	 * @param attributeValue
	 * @return
	 */
	public myMV addValue(String attributeName, Object attributeValue) {
		Assert.notNull(attributeName, "Model attribute name must not be null");
		put(attributeName, attributeValue);
		return this;
	}

	@Override
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		
		return null;
	}

}
