package com.lego.care4you.demo.controller;

import com.lego.care4you.demo.repository.RulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RulesController {

    @Autowired
    RulesRepository rulesRepository;
}
