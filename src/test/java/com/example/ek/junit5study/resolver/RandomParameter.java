package com.example.ek.junit5study.resolver;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Parameter;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

/**
 * junit5study
 * com.example.ek.junit5study.resolver.RandomParamterResolver.java
 *
 * TODO ここにクラスの説明を書いてください。
 *
 * @author E-Kanegae
 *
 */
public class RandomParameter implements ParameterResolver {

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.PARAMETER)
	public @interface RandomParam {
	}

	/* (非 Javadoc)
	 * @see org.junit.jupiter.api.extension.ParameterResolver#resolveParameter(org.junit.jupiter.api.extension.ParameterContext, org.junit.jupiter.api.extension.ExtensionContext)
	 */
	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
		// TODO 自動生成されたメソッド・スタブ
		return getRandomValue(parameterContext.getParameter(), extensionContext);
	}

	/* (非 Javadoc)
	 * @see org.junit.jupiter.api.extension.ParameterResolver#supportsParameter(org.junit.jupiter.api.extension.ParameterContext, org.junit.jupiter.api.extension.ExtensionContext)
	 */
	@Override
	public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
		return parameterContext.getParameter().isAnnotationPresent(RandomParam.class);
	}

	private Object getRandomValue(Parameter parameter, ExtensionContext extensionContext) {
		Class<?> type = parameter.getType();
		java.util.Random random = extensionContext.getRoot().getStore(Namespace.GLOBAL)//
				.getOrComputeIfAbsent(java.util.Random.class);
		if (int.class.equals(type)) {
			return random.nextInt();
		}
		if (double.class.equals(type)) {
			return random.nextDouble();
		}
		throw new ParameterResolutionException("No random generator implemented for " + type);
	}

}
