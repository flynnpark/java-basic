package class1.ex;

public class MovieReviewEx1 {
    public static void main(String[] args){
        MovieReview inception = new MovieReview();
        inception.title = "Inception";
        inception.review = "인생은 무한 루프.";

        MovieReview interstellar = new MovieReview();
        interstellar.title = "Interstellar";
        interstellar.review = "우리는 미래의 먼지다.";

        System.out.println("영화 제목: " + inception.title + ", 리뷰: " + inception.review);
        System.out.println("영화 제목: " + interstellar.title + ", 리뷰: " + interstellar.review);
    }
}
