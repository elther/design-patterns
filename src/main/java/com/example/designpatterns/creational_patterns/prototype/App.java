package com.example.designpatterns.creational_patterns.prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("elther");
        repository.setName("ugemang");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("week one");

        GithubIssue clone = (GithubIssue) githubIssue.clone();

        repository.setUser("elther2");

        String url = githubIssue.getUrl();
        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.getRepository() == githubIssue.getRepository());

        System.out.println(githubIssue.getUrl());
        System.out.println(clone.getUrl());

    }
}
