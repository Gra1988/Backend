package com.portfolio.gsc.Controller;

import com.portfolio.gsc.Entity.Skill;
import com.portfolio.gsc.Interface.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://app-frontgsc.web.app/")
public class SkillController {
    
@Autowired ISkillService iskillService;

@GetMapping("skills/traer")
public List<Skill> getSkill(){
return iskillService.getSkill();
}

@PostMapping("/skills/crear")
public String createSkill(@RequestBody Skill skill){
iskillService.saveSkill(skill);
return "La skill fue creada exitosamente";
}

@DeleteMapping ("/skills/borrar/{id}")
public String deleteSkill(@PathVariable Long id){
iskillService.deleteSkill(id);
return "La skill fue eliminada exitosamente";
}
//URL:PUERTO/skills/editar/(num id)/nombre,porcentaje
@PutMapping ("/skills/editar/{id}")
public ResponseEntity<Skill>editSkill(@PathVariable Long id,
        @RequestBody Skill e) {
    Skill nuevaSki = iskillService.findSkill(id);
       
    nuevaSki.setNombre(e.getNombre());
    nuevaSki.setPorcentaje(e.getPorcentaje());
        
    iskillService.saveSkill(nuevaSki);
    return ResponseEntity.ok(nuevaSki);
}
@GetMapping("/skills/traer/perfil")
public Skill findSkill(){
    return iskillService.findSkill((long)1);
}
@GetMapping("/skills/details/{id}")
public Skill findSkill(@PathVariable Long id){
    return iskillService.findSkill(id);
}
}

