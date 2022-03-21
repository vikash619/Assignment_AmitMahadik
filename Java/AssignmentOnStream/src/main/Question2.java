package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;
    public News(int newsId, String postedByUser, String commentByUser, String comment) {
        super();
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }
    public int getNewsId() {
        return newsId;
    }
    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }
    public String getPostedByUser() {
        return postedByUser;
    }
    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }
    public String getCommentByUser() {
        return commentByUser;
    }
    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
}

public class Question2 {
    public static int maxComments(List<News> news) {
        Map<Object, Long> counts =
                news.stream().collect(Collectors.groupingBy(e -> e.getNewsId(), Collectors.counting()));
        Object newsIdWithMaxComments=counts.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        return (int) newsIdWithMaxComments;
    }

    public static Long budgetCount (List<News> news) {
        List<String> list=news.stream().map(e -> e.getComment()).collect(Collectors.toList());
        Map<String,Long> map = list.stream()
                .map(sentence -> sentence.split("\\s+"))
                    .flatMap(words -> Arrays.stream(words)
                        .distinct())
                            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        return  map.get("Budget");

    }
    public static String maxCommentsByUser (List < News > news) {
        Map<Object, Long> counts =
                news.stream().collect(Collectors.groupingBy(e -> e.getCommentByUser(), Collectors.counting()));
        Object userWithMaxComments=counts.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        return (String) userWithMaxComments;
    }

    public static Map<Object, Long> sortMaxCommentsByUser (List < News > news) {
        Map<Object, Long> counts =
                news.stream().collect(Collectors.groupingBy(e -> e.getCommentByUser(), Collectors.counting()));

        return counts;
    }

    public static void main(String[] args) {
        News news1=new News(101, "John", "Raghav", "Budget is good.");
        News news2=new News(101, "John", "Raman", "News is good");
        News news3=new News(103, "Samuel", "Raghav", "Budget is good.");
        News news4=new News(102, "Koeman", "Raghav", "Budget is good.");
        News news5=new News(103, "Samuel", "Raman", "Budget is good.");
        News news6=new News(103, "Samuel", "Raghav", "Budget is good.");
        News news7=new News(101, "John", "Raghu", "Budget is good.");
        News news8=new News(102, "Koeman", "Raman", "Budget is good.");
        News news9=new News(101, "John", "Ram", "Budget is good.");

        List<News> listOfNews = new ArrayList<News>(
                Arrays.asList(
                        new News(1,"vikash", "akash", "budget is good for development but its need more"),
                        new News(2,"aman", "akash", "budget cloud have been better"),
                        new News(3,"tarun", "prakash", "budget is good for development"),
                        new News(4,"abhishek", "tarun", "nice explanation on budget "),
                        new News(5,"sandharbh", "abhishek", "presentation was good"),
                        new News(6,"gaurav", "surti", "bugdet needs more amount"),
                        new News(7,"surti", "akash", "budget is good for development")
                )
        );

        System.out.println("News Id with maximum comments is : " + maxComments(listOfNews)+"\n");

        System.out.println("The number of occurrence of the word Budget is :"+budgetCount(listOfNews));

        System.out.println("User with maximum comments is : " + maxCommentsByUser(listOfNews)+"\n");

        sortMaxCommentsByUser (listOfNews).forEach((key, value) -> System.out.println(key + ":" + value));
    }
}