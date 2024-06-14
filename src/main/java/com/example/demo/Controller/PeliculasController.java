package com.example.demo.Controller;


import org.springframework.ui.Model;
import com.example.demo.Dao.PeliculasDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/list")
public class PeliculasController {
    final PeliculasDao peliculasDao;

    public PeliculasController(PeliculasDao peliculasDao) {
        this.peliculasDao = peliculasDao;
    }

    @GetMapping({"/list", "/"})
    public String ListarPeliculas(Model model){
        model.addAttribute("ListaPeliculas", peliculasDao.listar());
        return "/list";
    }
}
