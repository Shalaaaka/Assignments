import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class News 
{
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private int comment;

	public int getNewsId() {
		return newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public int getComment() {
		return comment;
	}

	public News (int newsId, String postedByUser, String commentByUser, int comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
}
public class Assignment5Q2
{
	public static void maxComments(List<News> news)
	{
		News n=Collections.max(news,Comparator.comparingInt(s->s.getComment()));
		System.out.println("NewsID which has received maximum comments: NewsID="+n.getNewsId());
	}
	public static int budgetCount (List < News > news)
	{
		List<News> list=new ArrayList<>();
		for(News n:news)
		{
			if(n.getCommentByUser().equals("Budget"))
			{
				list.add(n);
			}
		}
		System.out.println(list);
		long i=list.stream().count();
		System.out.println("Total number of news which received word budget: "+i);
		return 1;
	}
	 public static Map<String, Integer> sortMaxCommentsByUser (List < News > news)
	{
		news.stream().sorted(Comparator.comparingInt(News::getComment).reversed()).map(News::getPostedByUser).forEach(System.out::println);
		return null;
	}
	
	public static void main(String[] args)
	{
		ArrayList<News> list = new ArrayList<>();
		News news1=new News(1,"Neha","Budget",5);
		News news2=new News(2,"Meena","Lockdown",10);
		News news3=new News(3,"Geeta","Budget",2);
		News news4=new News(4,"Sita","Corona",20);

		list.add(news1);
		list.add(news2);
		list.add(news3);
		list.add(news4);

		maxComments(list);
		budgetCount(list);
		sortMaxCommentsByUser(list);
	}
}
