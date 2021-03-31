import java.util.*;
class MovieDetails implements Comparable<MovieDetails>
{
    private String movieName;
    private String actor;
    private String actress;
    private String genre;

	public MovieDetails(String movieName, String actor, String actress, String genre) {
		super();
		this.movieName = movieName;
		this.actor = actor;
		this.actress = actress;
		this.genre = genre;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", actor=" + actor + ", actress=" + actress + ", genre=" + genre
				+ "]";
	}
	@Override
    public int compareTo(MovieDetails md) {
        return this.movieName.compareTo(md.movieName);
	}
}
public class Assignment3Q10 
{
	public void addMovie(MovieDetails movie) 
	{
        List<MovieDetails> addmovie = new ArrayList<>();
        System.out.println("Movie added : "+addmovie.add(movie));
	}
	public static void sort(ArrayList<MovieDetails> movieDetails, Comparator<MovieDetails> movieDetailsComparator)
	{
        Collections.sort(movieDetails, movieDetailsComparator);
    }

    public static void printSortedMovieList(ArrayList<MovieDetails> movieDetails)
	{
        for (MovieDetails m: movieDetails) 
			{
			System.out.println(m);
			}
        return ;
    }
	public void removeMovies(List<MovieDetails> list,String movieName) 
	{
        Iterator<MovieDetails> itr = list.iterator();
        while(itr.hasNext())
		{
            MovieDetails md = itr.next();
                if (md.getMovieName().equals(movieName)) 
				{
                    itr.remove();

                }
        }
		for (MovieDetails neww: list) 
		{
            System.out.println(neww);
        }
    }
	public MovieDetails find_movie_By_mov_Name(List<MovieDetails> list, String movieName) 
	{
        Iterator<MovieDetails> itr = list.iterator();
        while (itr.hasNext()) 
		{
            MovieDetails md = itr.next();
            if (md.getMovieName().equals(movieName)) 
			{
                return md;          
            }
        }
        return null;
    }
	
    public static void main(String[] args)
	{
		
		Assignment3Q10 list=new Assignment3Q10();
		MovieDetails m1=new MovieDetails("YJHD","Ranbir","Deepika","Dharma");
		MovieDetails m2=new MovieDetails("ZNMD","Hritik","Katrina","XYZ");
		MovieDetails m3=new MovieDetails("3 Idiots","Amir","Kareena","ABC");
		MovieDetails m4=new MovieDetails("TATB","Noah","Lana","LMN");
		Scanner scanner = new Scanner(System.in);
		list.addMovie(m1);
		list.addMovie(m2);
		list.addMovie(m3);
		list.addMovie(m4);

		ArrayList<MovieDetails> newlist=new ArrayList<>();
		newlist.add(m4);
		newlist.add(m3);

		sort(newlist,MovieDetails::compareTo);
        printSortedMovieList(newlist);

		System.out.println("MovieName to search : ");
        String movie = scanner.next();
        System.out.println(list.find_movie_By_mov_Name(newlist,movie));

		System.out.println("MovieName to remove : ");
        String remove = scanner.next();
        list.removeMovies(newlist,remove);


		
	}
}