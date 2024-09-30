package com.itheima.demo8test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    private static List<Movie> movies = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public void start(){
        while (true) {
            System.out.println("========电影信息管理=======");
            System.out.println("1.电影上架");
            System.out.println("2.电影下架");
            System.out.println("3.电影查询");
            System.out.println("4.封杀明星");
            System.out.println("5.退出");

            String command = sc.next();
            switch (command) {
                case "1":
                    addMovie();
                    break;
                case "2":
                    break;
                case "3":
                    queryMovie();
                    break;
                case "4":
                    break;
                case "5":
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
    }

    private void queryMovie() {
        System.out.println("========电影查询=======");
        System.out.println("请输入电影名称：");
        String searchname = sc.next();
        Movie temp = queryMovieByName(searchname);
        if (temp != null) {
            System.out.println(temp);
        } else {
            System.out.println("没有找到该电影");
        }
    }

    private Movie queryMovieByName(String searchname) {
        for(Movie movie : movies) {
            if (movie.getName().equals(searchname)) {
                return movie;
            }
        }
        return null;
    }

    private void addMovie() {
        Movie movie = new Movie();
        System.out.println("========增加电影=======");
        System.out.println("请输入电影名称：");
        movie.setName(sc.next());
        System.out.println("请输入电影评分：");
        movie.setScore(sc.nextDouble());
        System.out.println("请输入主演：");
        movie.setActor(sc.next());
        System.out.println("请输入电影价格：");
        movie.setPrice(sc.nextDouble());
        movies.add(movie);

    }
}
