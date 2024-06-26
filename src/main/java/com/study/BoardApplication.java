package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/* SpringBOotApplication은 아래 세가지 어노테이션으로 구성되어 있음
	@EnableAutoConfiguration : 개발에 필요한 몇 가지 필수적인 설정들의 처리가 되어 있으며, 해당 어노테이션에 의해 다양한 설정들의 일부가 자동으로 완료됨
	@ComponentScan : 자동으로 컴포넌트 클래스를 검색하고, 스프링 어플리케이션 콘텍스트(IoC컨테이너)에 빈(Bean)클래스로 등록. 쉽게 말해 의존성 주입 과정이 더욱 간편해짐
	@Configuration : 해당 어노테이션이 선언된 클래스는 Java 기반의 설정 파일로 인식됨. 스프링 4버전부터 java기반의 설정이 가능하게 되었으며, XML 설정에 큰 시간을 소모하지 않아도됨
*/
public class BoardApplication {

	public static void main(String[] args) {

		SpringApplication.run(BoardApplication.class, args);
	}

}
