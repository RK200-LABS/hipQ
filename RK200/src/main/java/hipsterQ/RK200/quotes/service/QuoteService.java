package hipsterQ.RK200.quotes.service;

import hipsterQ.RK200.quotes.repository.QuoteEntity;
import hipsterQ.RK200.quotes.repository.QuoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class QuoteService {
    private final QuoteRepository quoteRepository;

    public String getRandomQuote() {
        return quoteRepository.findRandomQuote()
                .map(QuoteEntity::getContent)
                .orElseThrow(() -> new NoSuchElementException("명언이 존재하지 않습니다."));
    }
}
