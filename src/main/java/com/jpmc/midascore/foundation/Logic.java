package com.jpmc.midascore.foundation;

import com.jpmc.midascore.entity.UserRecord;
import com.jpmc.midascore.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Logic {
    private final UserRepository userRepository;

    public Logic(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserRecord> findAllEmployee() {
        List<UserRecord> employees = new ArrayList<>();
        userRepository.findAll().forEach(employees::add);
        return employees;
    }

    public UserRecord findAllEmployeeByID(long id) {
        return userRepository.findById(id).orElse(null);
    }

    public UserRecord addEmployee(String name, float balance) {
        return userRepository.save(new UserRecord(name, balance));
    }

    public void deleteAllData() {
        userRepository.deleteAll();
    }
}