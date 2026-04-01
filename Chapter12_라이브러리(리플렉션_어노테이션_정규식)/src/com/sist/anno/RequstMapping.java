package com.sist.anno;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/*
 * @RequstMapping
 * aaa()
 * @RequstMapping
 * bbb()
 * @RequstMapping
 * ccc()
 * 
 * -> @RequstMapping 올린다고 함수를 다 찾아주는게 아니라 구분자를 적어줘야해/ 웹사이트는 구분자 대신 주소를 입력(url)
 * 
 * ----------------------------------------------------------------------------------------------
 * 
 * @RequstMapping("aaa")
 * aaa()
 * @RequstMapping("bbb")
 * bbb()
 * @RequstMapping("ccc")
 * ccc()
 * --------------------------------
 * 올라가면 메모리할당, 안 올라가면 X
 * ->  어노테이션이 올라가는 것만 메모리할당을 한다 => 구분자 따로 필요없고 할당 유무만 구분한다
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface RequstMapping {
   public String value(); // 구분자(=이름을 입력해야한다)
}
