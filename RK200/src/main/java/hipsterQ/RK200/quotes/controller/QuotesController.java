package hipsterQ.RK200.quotes.controller;

import hipsterQ.RK200.quotes.service.QuoteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/quotes")
@RequiredArgsConstructor
@Slf4j
public class QuotesController {

    private final QuoteService quoteService;

    // ✅ 랜덤 명언 페이지 (Thymeleaf)
    @GetMapping("")
    public String showQuotePage(Model model) {
        model.addAttribute("quote", ""); // 처음엔 빈 값
        return "quotes";
    }

    @GetMapping("/api/random")
    @ResponseBody
    public String getRandomQuote() {
        return quoteService.getRandomQuote();
    }




}
