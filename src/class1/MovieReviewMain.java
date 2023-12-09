package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        MovieReview movieReview2 = new MovieReview();
        MovieReview[] movieReviews = new MovieReview[] {movieReview1, movieReview2};

        movieReviews[0].title = "인셉션";
        movieReviews[0].review = "인생은 무한 루프";
        movieReviews[1].title = "어바웃 타임";
        movieReviews[1].review = "인생 시간 영화!";

        for (MovieReview m : movieReviews) {
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }
    }
}
