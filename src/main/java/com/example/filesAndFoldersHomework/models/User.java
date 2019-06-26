package com.example.filesAndFoldersHomework.models;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

//    name, list of folders

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "folder_id")
    private Folder folder;


    public User(String name, Folder folder) {

        this.name = name;
        this.folder = folder;
    }

    public User() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
