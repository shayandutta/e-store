package com.shayan.electronic.store.ElectronicStore.entity;

import jakarta.persistence.*;
import lombok.*;

//using lombok for annotations
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "users")  //name of table replacing from User to users
public class User {


    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)   //for auto incrementing(can be used for ints)
    private String userId; //since marked under @Id, it's the primary column now

    @Column(name = "user_name") //setting the name of the column as username, default will be name
    private String name;

    @Column(name = "user_email", unique = true)
    private String email;

    @Column(name = "user_password", length = 10)
    private String password;
    private String gender;

    @Column(length = 1000) //extending the space to column (1000 words)
    private String about;

    @Column(name = "user_image_name")
    private String imageName;


}
