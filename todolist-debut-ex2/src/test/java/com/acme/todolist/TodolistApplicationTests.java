package com.acme.todolist;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.acme.todolist.domain.TodoItem;

@SpringBootTest
class TodolistApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testGetTodoList()
	{
		TodoItem ti = new TodoItem("12345", Instant.now().plus(1, ChronoUnit.DAYS), "Test RG1 date < 24h ");
		
		assertTrue(ti.finalContent().startsWith(TodoItem.LATE));
	}

}
