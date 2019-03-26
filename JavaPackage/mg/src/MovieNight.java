import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class MovieNight {
    public static Boolean canViewAll(Collection<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            public int compare(Movie s1, Movie s2) {
                return s1.getStart().compareTo(s2.getStart());
            }
        });
        Iterator it=movies.iterator();
        while(it.hasNext()){
            if ((Movie)it.next().)
        }
    }
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie(sdf.parse("2015-01-01 20:00"), sdf.parse("2015-01-01 21:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 23:10"), sdf.parse("2015-01-01 23:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 21:30"), sdf.parse("2015-01-01 23:00")));

        System.out.println(MovieNight.canViewAll(movies));


    }
    class Movie {
        private Date start, end;

        public Movie(Date start, Date end) {
            this.start = start;
            this.end = end;
        }

        public Date getStart() {
            return this.start;
        }

        public Date getEnd() {
            return this.end;
        }
    }
}
