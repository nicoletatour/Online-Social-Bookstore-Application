package myy803.socialbookstore.services;

import java.util.List;

import myy803.socialbookstore.formsdata.BookDTO;
import myy803.socialbookstore.formsdata.RecommendationsDTO;

public interface RecommendationService {
    List<BookDTO> recommendBusinessLogic(String username, RecommendationsDTO recomDto);
}
