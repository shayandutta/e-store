package com.shayan.electronic.store.ElectronicStore.Repository;
//data layer


import com.shayan.electronic.store.ElectronicStore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// <Entity, Data_type>
public interface UserRepository extends JpaRepository<User, String> {

}
