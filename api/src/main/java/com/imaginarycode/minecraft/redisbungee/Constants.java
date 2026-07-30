/*
 * Copyright (c) 2013-present RedisBungee contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 *
 *  http://www.eclipse.org/legal/epl-v10.html
 */


package com.imaginarycode.minecraft.redisbungee;

public class Constants {

    public final static String VERSION = "{{ version }}";
    public final static String GIT_COMMIT = "{{ git-commit }}";
    private static final String GITHUB_REPOSITORY = "https://github.com/ProxioDev/ValioBungee";

    public static String getGitCommitDisplay() {
        return isGitCommitAvailable() ? GIT_COMMIT.substring(0, 8) : "unknown";
    }

    public static String getGithubCommitLink() {
        return isGitCommitAvailable() ? GITHUB_REPOSITORY + "/commit/" + GIT_COMMIT : GITHUB_REPOSITORY;
    }

    private static boolean isGitCommitAvailable() {
        return GIT_COMMIT.matches("[0-9a-fA-F]{7,40}");
    }

}
