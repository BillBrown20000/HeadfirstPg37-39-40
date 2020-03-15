class movie {
    String title;
    String genre;
    int  rating;

    void playIt(){
        System.out.println("playing the movie");
    }
    public class MovieTestDrive{
        public void main(String[] args) {

        movie one = new movie();
        one.title = "gone with the stock";
        one.genre =  "Tragic";
        one.rating = -2;
        movie two = new movie();
        two.title = "lost in cubicle space";
        two.genre = "comedy";
        two.rating = 5;
        two.playIt();
        movie three = new movie();
        three.title = "byte club";
        three.genre = "tragic but ultimately uplifting";
        three.rating = 127;
        }
    }

}

