package ru.evs.projects.Artifcatld.javabot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBotApplication {
	/*
	POST /jokes - создание новой шутки
	GET /jokes - выдача всех шуток
	GET /jokes/id - выдача шутки с определенным id
	PUT /jokes/id - изменение шутки
	DELETE /jokes/id - удаление шутки
	 */

	public static void main(String[] args) {
		SpringApplication.run(JavaBotApplication.class, args);
	}

}
