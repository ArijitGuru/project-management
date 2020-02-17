//https://mkyong.com/spring-boot/spring-boot-junit-5-mockito/

package com.develop.projectmanagement.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.develop.projectmanagement.model.User;

@SpringBootTest
class UserServiceImplTest {

	@Mock
	private UserService userService;
	
	@BeforeEach
    void setMockOutput() {
		User user = new User();
		user.setFirstName("Binayak");;
		List<User> userList = new ArrayList<User>();
		userList.add(user);
        when(userService.viewUser()).thenReturn(userList);
    }
	
	
	@Test
	void viewUsertest() {
		assertEquals("Binayak", userService.viewUser().get(0).getFirstName());
	}

}
