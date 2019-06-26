package com.example.filesAndFoldersHomework.components;


import com.example.filesAndFoldersHomework.repository.FileRepository;
import com.example.filesAndFoldersHomework.repository.FolderRepository;
import com.example.filesAndFoldersHomework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        
    }
}
