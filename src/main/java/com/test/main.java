package com.test;

public class main {

    public static void main(String[] args) {

        Git_Hub_agent agent =
                new Git_Hub_agent(
                        "C:/Users/ACER/IdeaProjects/git_hub_manager",
                        "first commit from java agent"
                );

        String result = agent.execute();

        System.out.println(result);
    }
}