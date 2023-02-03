package com.portfolio.gsc.Interface;

import com.portfolio.gsc.Entity.Skill;
import java.util.List;

public interface ISkillService {
  //Traer una lista de Skills
    public List<Skill> getSkill();
    
    //Guardar un objeto de tipo Skill
    public void saveSkill(Skill skill);
    
    //Eliminar un objeto por ID
    public void deleteSkill(Long id);
    
    //Buscar una Skill por ID
    public Skill findSkill(Long id);
}
