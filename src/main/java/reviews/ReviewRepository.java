package reviews;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component

public class ReviewRepository {
	private Map<Long, Review> reviewsById;
	private String content = "Shoulder pastrami flank, hamburger bacon burgdoggen swine jowl "
			+ "venison tail shankle ball tip turducken t-bone. Tongue beef cupim, jerky "
			+ "ground round boudin bresaola short ribs kielbasa frankfurter venison pork "
			+ "belly. Kielbasa beef sirloin shankle, spare ribs short ribs pork belly "
			+ "hamburger. Porchetta meatloaf tenderloin burgdoggen, venison brisket boudin "
			+ "drumstick pancetta. Frankfurter hamburger drumstick, flank bresaola turducken"
			+ " pork belly salami beef ribs doner sirloin pastrami chicken. Tri-tip meatloaf "
			+ "ham hock pork loin turducken turkey pork chop beef flank t-bone capicola "
			+ "ground round porchetta ham.";

	public ReviewRepository() {
		reviewsById = new HashMap<Long, Review>();
		Review firstReview = new Review(55, "Logan", "../images/22.jpg", "Action", content);
		reviewsById.put(firstReview.getId(), firstReview);
		Review secondReview = new Review(56, "The Lego Batman Movie", "../images/23.jpg", "Animated", content);
		reviewsById.put(secondReview.getId(), secondReview);
		Review thirdReview = new Review(57, "Hidden Figures", "../images/24.jpg", "Drama", content);
		reviewsById.put(thirdReview.getId(), thirdReview);
		Review fourthReview = new Review(58, "Split", "../images/25.jpg", "Horror", content);
		reviewsById.put(fourthReview.getId(), fourthReview);

	}

	public Review findOne(long id) {
		return reviewsById.get(id);
	}

	public Collection<Review> findAll() {
		return reviewsById.values();
	}

}
