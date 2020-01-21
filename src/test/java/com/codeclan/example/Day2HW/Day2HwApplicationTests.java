package com.codeclan.example.Day2HW;

import com.codeclan.example.Day2HW.repositories.FileRepository;
import com.codeclan.example.Day2HW.repositories.FolderRepository;
import com.codeclan.example.Day2HW.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Day2HwApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileAndFolder() {

	}


}
