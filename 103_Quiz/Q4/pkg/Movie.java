
package pkg;

public class Movie {
    public String movieName;
    public double rating;
    public int numRatings;
    public double revenue;

    public Movie() {
        movieName = "The Avengers";
        rating = 8.0;
        numRatings = 50;
        revenue = 1518000000;
    }

  
    public Movie(String name, double movieRating, int ratings, double money) {
        movieName = name;
        rating = movieRating;
        numRatings = ratings;
        revenue = money;
    }

    public void movieToString() {
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: $" + revenue);
        System.out.println();
    }

    
    public String getMovieName() {
        return movieName;
    }

    public double getRevenue() {
        return revenue;
    }

   
    public void addRating(double newRating) {
        rating = ((rating * numRatings) + newRating) / (numRatings + 1);
        numRatings++;
    }


    public boolean compareRatings(Movie movie) {
        return rating > movie.rating;
    }
}
