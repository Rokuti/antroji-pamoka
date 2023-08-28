package lt.viltiesZiedas.receptai.controler;

import lt.viltiesZiedas.receptai.model.entity.ReceptoKategorija;
import lt.viltiesZiedas.receptai.model.repository.ReceptoKategorijaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ReceptoKategorijaController {

    @Autowired
    ReceptoKategorijaRepository receptoKategorijaRepository;

    @GetMapping("/kategorijos/gauti-visos")
    public String gautiVisasKategorijas(Model model) {
        List<ReceptoKategorija> visosKategorijos = receptoKategorijaRepository.findAll();
        model.addAttribute("visosKategorijos", visosKategorijos);
        return "kategorija/visos-kategorijos.html";
    }
}