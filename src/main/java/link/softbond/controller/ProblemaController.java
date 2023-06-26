package link.softbond.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import link.softbond.entities.*;
import link.softbond.repositorios.*;

import java.util.List;
import java.util.Optional;
public class ProblemaController {
    @Autowired
    ProblemaRepository problemaRepository;

    @GetMapping("/{problemas}/{list}")
    public List<Problema> getProblemaAll(){
        return problemaRepository.findAll();
    }

    @GetMapping(/{problemas}/{list}/{activos})
    public 
}
