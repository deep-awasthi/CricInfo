package com.example.deepawasthi.Cricinfo.Repository;

import com.example.deepawasthi.Cricinfo.Model.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepo extends JpaRepository<MatchEntity, Integer> {
}
