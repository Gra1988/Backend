package com.portfolio.gsc.Repository;

import com.portfolio.gsc.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skill, Long>{
    
}
