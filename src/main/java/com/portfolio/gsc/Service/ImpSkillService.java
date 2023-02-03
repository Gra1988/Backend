package com.portfolio.gsc.Service;

import com.portfolio.gsc.Entity.Skill;
import com.portfolio.gsc.Interface.ISkillService;
import com.portfolio.gsc.Repository.ISkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpSkillService implements ISkillService{
@Autowired ISkillRepository iskillRepository;

    @Override
    public List<Skill> getSkill() {
     List<Skill> skill = iskillRepository.findAll();
             return skill;
    }

    @Override
    public void saveSkill(Skill skill) {
       iskillRepository.save(skill); 
    }

    @Override
    public void deleteSkill(Long id) {
        iskillRepository.deleteById(id);
       
    }

    @Override
    public Skill findSkill(Long id) {
        Skill skill = iskillRepository.findById(id).orElse(null);
        return skill;
        
    }
    
}
