package com.codeclan.example.Day2HW.components;

import com.codeclan.example.Day2HW.models.File;
import com.codeclan.example.Day2HW.models.Folder;
import com.codeclan.example.Day2HW.models.User;
import com.codeclan.example.Day2HW.repositories.FileRepository;
import com.codeclan.example.Day2HW.repositories.FolderRepository;
import com.codeclan.example.Day2HW.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User john = new User("John");
        userRepository.save(john);

        User jacob = new User("Jacob");
        userRepository.save(jacob);

        User jjj = new User("Jjj");
        userRepository.save(jjj);


        Folder small = new Folder("small",john );
        folderRepository.save(small);

        Folder medium = new Folder("small", jacob);
        folderRepository.save(medium);

        Folder large = new Folder("small", jjj);
        folderRepository.save(large);


        File abacus = new File("abacus", ".txt", 20, small);
        fileRepository.save(abacus);

        File baby = new File("babies", ".png", 40, medium);
        fileRepository.save(baby);

        File cat = new File("cats", ".py", 60, large);
        fileRepository.save(cat);
    }
}
