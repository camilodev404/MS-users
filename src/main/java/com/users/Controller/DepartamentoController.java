package com.users.Controller;

import com.users.Model.Departamento;
import com.users.Service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
@CrossOrigin("*")
public class DepartamentoController {

    @Autowired
    DepartamentoService departamentoService;

    @GetMapping("/departamentos")
    public ResponseEntity<List<Departamento>> getDepartamentos(){
        return new ResponseEntity<>(departamentoService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idDepto}")
    public ResponseEntity<Departamento> departamentoById(@PathVariable("idDepto") int idDepto){
        return departamentoService.getById(idDepto).map(departamento -> new ResponseEntity<>(departamento, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}