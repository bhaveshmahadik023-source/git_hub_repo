package com.test;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.File;

public class Git_Hub_agent {

    private final String repoPath;
    private final String commitMessage;

    public Git_Hub_agent(String repoPath, String commitMessage) {

        this.repoPath = repoPath;
        this.commitMessage = commitMessage;
    }

    public String execute() {

        try (Git git = Git.open(new File(repoPath))) {

            // read token from environment variable
            String token = System.getenv("GITHUB_TOKEN");

            System.out.println(token);

            // add all files
            git.add()
                    .addFilepattern(".")
                    .call();

            // commit changes
            git.commit()
                    .setMessage(commitMessage)
                    .call();

            // push to github
            git.push()
                    .setCredentialsProvider(
                            new UsernamePasswordCredentialsProvider(
                                    "bhaveshmahadik023-source",
                                    token
                            )
                    )
                    .call();

            return "Project pushed successfully to GitHub.";

        } catch (Exception e) {

            return "Error : " + e.getMessage();
        }
    }
}