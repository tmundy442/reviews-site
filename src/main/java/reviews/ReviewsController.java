package reviews;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsController {
	private ReviewRepository repository = new ReviewRepository();

	@RequestMapping("/review")
	public String showOne(@RequestParam(value = "id") long id, Model model) {
		Review reviewTemplate = repository.findOne(id);
		model.addAttribute("selectedReview", reviewTemplate);
		return "reviewTemplate";
	}

	@RequestMapping("/reviews")
	public String showAll(Model model) {
		Collection<Review> reviews = repository.findAll();
		model.addAttribute("reviews", reviews);
		return "reviews";
	}

}
