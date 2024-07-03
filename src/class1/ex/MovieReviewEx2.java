package class1.ex;

public class MovieReviewEx2 {
    public static void main(String[] args){
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "Inception";
        inception.review = "인생은 무한 루프.";
        reviews[0] = inception;

        MovieReview interstellar = new MovieReview();
        interstellar.title = "Interstellar";
        interstellar.review = "우리는 미래의 먼지다.";
        reviews[1] = interstellar;

        for (int i = 0; i < reviews.length; i++) {
            System.out.println("영화 제목: " + reviews[i].title + ", 리뷰: " + reviews[i].review);
        }
    }
}
