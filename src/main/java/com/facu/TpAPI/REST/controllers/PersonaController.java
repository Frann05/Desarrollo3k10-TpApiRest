package com.facu.TpAPI.REST.controllers;

import com.facu.TpAPI.REST.entities.Persona;
import com.facu.TpAPI.REST.services.PersonaService;
import com.facu.TpAPI.REST.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{


}