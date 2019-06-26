package com.example.filesAndFoldersHomework.models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "folders")
public class Folder {

//    title list of files user

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "fileList")
    private List<File> fileList;

    @Column(name = "user")
    private String name;


    public Folder(String title, List<File> fileList, String name) {
        this.title = title;
        this.fileList = fileList;
        this.name = name;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
