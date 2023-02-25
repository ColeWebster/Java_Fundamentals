package Spring;
import java.util.List;
import java.lang.Iterable;
import java.util.Date;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequstMapping;

@RestController
public class SuperHeroController {
    private final SuperHeroRepository superHeroRepository;
    private final SuperReportRepository superReportRepository;

    public SuperHeroController(SuperHeroRepository superHeroRepository, SuperReportRepository, superReportRepository) {
        this.superHeroRepository = superHeroRepository;
        this.superReportRepository = superReportRepository;
    }

    @RequestMapping("/superHeroes")
    public Iterable<SuperHero> getSuperHero() {
        Iterable<SuperHero> superHero = superHeroRepository.findAll();
        return superHeroes;
    }
}
